package com.modularwarfare.utility;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RaytraceHelper {
	
	public static class Line
	{
		
		/**
		 * Creates a new line between the given positions.
		 * It doesn't matter which position you add first.
		 * @param pos1 The first position of this line.
		 * @param pos2 The second position of this line.
		 */
		public Line(Position pos1, Position pos2){
			position1 = pos1;
			position2 = pos2;
			refresh();
		}
		protected Line() {}
		private Position position1;
		private Position position2;
		/**
		 * The distance of this line on the x-axis.
		 */
		public double distanceX;
		/**
		 * The distance of this line on the y-axis.
		 */
		public double distanceY;
		/**
		 * The distance of this line on the z-axis.
		 */
		public double distanceZ;
		
		public double distanceXT;
		public double distanceYT;
		public double distanceZT;
		/**
		 * the distance between the positions of this line.
		 */
		public double distance;
		/**
		 * This method refreshes all the data this line has, for now only the distances to the positions.
		 */
		public void refresh(){
			distanceX = position2.x - position1.x;
			distanceY = position2.y - position1.y;
			distanceZ = position2.z - position1.z;
			distanceXT = distanceX;
			distanceYT = distanceY;
			distanceZT = distanceZ;
			if(distanceX < 0){
				distanceX *= -1;
			}
			if(distanceY < 0){
				distanceY *= -1;
			}
			if(distanceZ < 0){
				distanceZ *= -1;
			}
			double distanceXZ = Math.hypot(distanceX, distanceZ);
			distance = Math.hypot(distanceXZ, distanceY);
		}
		/**
		 * This method returns one of the positions.
		 * @param i The position to get. i <= 1 will return position1, position2 otherwise.
		 * @return The position you asked.
		 */
		public Position getPosition(int i){
			if(i <= 1){
				return position1;
			}
			else {
				return position2;
			}
		}
		/**
		 * This method changes one of the positions and refreshes the distance.
		 * @param i The position to choose. i <= 1 will change position1, position2 otherwise.
		 * @param pos The new value of the position.
		 */
		public void setPosition(int i, Position pos){
			if(i <= 1){
				position1 = pos;
			}
			else {
				position2 = pos;
			}
			refresh();
		}
		
		/**
		 * 
		 * @param world the world to spawn the particles.
		 * @param red how red the particles will be.
		 * @param green how green the particles will be.
		 * @param blue how blue the particles will be.
		 * @param dbp distance between particles.
		 */
		public void spawnParticles(World world, double red, double green, double blue, double dbp, double twist){
			double speedX = distanceXT * dbp;
			double speedY = distanceYT * dbp;
			double speedZ = distanceZT * dbp;
			double x = position1.x;
			double y = position1.y;
			double z = position1.z;
			int times = 0;
			int particles = fromDouble(divineAccurate(position1.getDistance(position2), dbp));
			while(times <= particles && world.isRemote){
				world.spawnParticle(EnumParticleTypes.REDSTONE, x, y, z, red, green, blue);
				x += speedX;
				y += speedY;
				z += speedZ;
				++times;
				//TODO work in progress
			}
		}
		
		/**
		 * 
		 * @param world the world to spawn the particles.
		 * @param red how red the particles will be.
		 * @param green how green the particles will be.
		 * @param blue how blue the particles will be.
		 * @param dbp distance between particles.
		 */
		public void spawnParticles2(World world, double red, double green, double blue, double dbp, int lifetime){
			double speedX = distanceXT * dbp;
			double speedY = distanceYT * dbp;
			double speedZ = distanceZT * dbp;
			double x = position1.x;
			double y = position1.y;
			double z = position1.z;
			int times = 0;
			int particles = fromDouble(divineAccurate(position1.getDistance(position2), dbp));
			while(times <= particles && world.isRemote){
				world.spawnParticle(EnumParticleTypes.REDSTONE, x, y, z, red, green, blue);
				x += speedX;
				y += speedY;
				z += speedZ;
				++times;
			}
			
		}
		
		public String toString(){
			return "Line: distance = " + distance + "  position1 = [" + position1 + "], position2 = [" + position2 + "]";
		}
		/**
		 * This method makes and returns a list of all entities that are in this line.
		 * @param world The world to look for the entities
		 * @param entityClass the class the entities must have or extend.
		 * @param putInBag If this is true, the types in the given list will be EntityBag instead of normal Entities.
		 * @return A list of all entities in this line.
		 */
		public List getEntities(World world, Class entityClass, boolean putInBag){
			refresh();
			double minX = Math.min(position1.x, position2.x);
			double maxX = Math.max(position1.x, position2.x);
			double minY = Math.min(position1.y, position2.y);
			double maxY = Math.max(position1.y, position2.y);
			double minZ = Math.min(position1.z, position2.z);
			double maxZ = Math.max(position1.z, position2.z);
			List entities = world.getEntitiesWithinAABB(entityClass, new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ));
			double factorXY = divineAccurate(distanceYT, distanceXT);
			double factorXZ = divineAccurate(distanceZT, distanceXT);
			double bufferXY = position1.y - (position1.x * factorXY);
			double bufferXZ = position1.z - (position1.x * factorXZ);
			List entities2 = new ArrayList();
			int times = 0;
			while(times < entities.size()){
				Entity entity = (Entity) entities.get(times);
				AxisAlignedBB aabb = entity.getEntityBoundingBox();
				double d = (aabb.minX * factorXY) + bufferXY;
				double e = (aabb.maxX * factorXY) + bufferXY;
				double m = (aabb.minX * factorXZ) + bufferXZ;
				double n = (aabb.maxX * factorXZ) + bufferXZ;
				boolean flag1 = m <= aabb.maxZ && n >= aabb.minZ || m >= aabb.minZ && n <= aabb.maxZ;
				boolean flag2 = d <= aabb.maxY && e >= aabb.minY || d >= aabb.minY && e <= aabb.maxY;
				if(flag1 && flag2){
					if(!putInBag){
						entities2.add(entity);
					}
					else {
						int times2 = 0;
						entities2.add(new EntityBag(entity, entity.posX, (entity.posX * factorXY) + bufferXY, (entity.posX * factorXZ) + bufferXZ));
					}
				}
				++times;
			}
			return entities2;
		}
		/**
		 * this method creates a new line that is equal to the rayTrace of the given entity.
		 * @param entity The entity whose rayTrace this method will use.
		 * @param light The maximum lenght this rayTrace can have.
		 * @return a new Line that is the rayTrace of the given entity.
		 */
		public static Line fromRaytrace(Entity entity, double lenght){
			Position pos1 = new Position(entity.posX, entity.height * 0.8 + entity.getEntityBoundingBox().minY, entity.posZ);
			Position pos2 = new Position(entity.getLookVec());
			Vec3d v3 = new Vec3d(pos1.x, pos1.y, pos1.z);
			Position pos4 = new Position(v3.addVector(pos2.x * lenght, pos2.y * lenght, pos2.z * lenght));
			Position pos3 = new Position(entity.posX * pos2.x, (entity.height * 0.8 + entity.getEntityBoundingBox().minY) * pos2.y, entity.posZ * pos2.z);
			return new Line(pos1, pos4);
		}
		/**
		 * This method gives the nearest entity in this line to the given position.
		 * @param world The world to look for the entity.
		 * @param entityClass The class the entities must have or extend.
		 * @param position the position where the entity must be close too.
		 * @param exclude An entity that doesn't count in this method.
		 * @return The entity in this line that is the closest from the given position.
		 */
		public Entity getNearestEntity(World world, Class entityClass, Position position, Entity exclude){
			List entities = getEntities(world, entityClass, false);
			double maxDistance = -1;
			int times = 0;
			Entity entity2 = null;
			while(times < entities.size()){
				Entity entity = (Entity) entities.get(times);
				double distance = position.getDistance(new Position(entity));
				if(entity != exclude){
					if(maxDistance == -1){
						maxDistance = distance;
						entity2 = entity;
					}
					else if(distance < maxDistance){
						maxDistance = distance;
						entity2 = entity;
					}
				}
				++times;
			}
			return entity2;
		}
		/**
		 * This method does the same as the other method, but put the entity in a bag.
		 * @param world
		 * @param position
		 * @param entityClass
		 * @param exclude
		 * @return
		 */
		public EntityBag getNearestEntity(World world, Position position, Class entityClass, Entity exclude){
			List entities = getEntities(world, entityClass, true);
			double maxDistance = -1;
			int times = 0;
			EntityBag entity2 = null;
			while(times < entities.size()){
				EntityBag entity = (EntityBag) entities.get(times);
				double distance = position.getDistance(new Position(entity.x, entity.y, entity.z));
				if(entity.entity != exclude){
					if(maxDistance == -1){
						maxDistance = distance;
						entity2 = entity;
					}
					else if(distance < maxDistance){
						maxDistance = distance;
						entity2 = entity;
					}
				}
				++times;
			}
			return entity2;
		}
		/**
		 * This method writes the data of the positions to the given NBTTagCompound.
		 * @param nbt the NBTTagCompound to save the data.
		 */
		public void writeToNBT(NBTTagCompound nbt){
			position1.writeToNBT(nbt, "position1");
			position2.writeToNBT(nbt, "position2");
		}
		/**
		 * Reads the info of positions that are written in the NBTTagCompound.
		 * The line will be useless if the right data is not stored.
		 * @param nbt The NBTTagCompound to read.
		 */
		public void readFromNBT(NBTTagCompound nbt){
			position1 = new Position();
			position2 = new Position();
			position1.readFromNBT(nbt, "position1");
			position2.readFromNBT(nbt, "position2");
			refresh();
		}
		/**
		 * Creates a line from a NBTTagCompound.
		 * Be sure this is the same NBTTagCompound as the one where you saved the data.
		 * @param nbt The NBTTagCompound to read.
		 * @return
		 */
		public static Line createLineFromNBT(NBTTagCompound nbt){
			Line line = new Line();
			line.readFromNBT(nbt);
			return line;
		}
		/**
		 * This method gives a list of the blocks in the line.
		 * @param world The world to take the blocks.
		 * @param acceptWeakBlocks If this is false, it will not set blocks in the list with a hardness of 0.
		 * @return A list of blocks in the line.
		 */
		public List getBlocks(World world, boolean acceptWeakBlocks){
			double speedX = divineAccurate(distanceXT, distance);
			double speedY = divineAccurate(distanceYT, distance);
			double speedZ = divineAccurate(distanceZT, distance);
			if(!isNormalNumber(speedX)){
				speedX = 0;
			}
			if(!isNormalNumber(speedY)){
				speedY = 0;
			}
			if(!isNormalNumber(speedZ)){
				speedZ = 0;
			}
			int maxTimes = (int)distance + 1;
			int times = 0;
			List blocks = new ArrayList();
			double x = position1.x;
			double y = position1.y;
			double z = position1.z;
			while (times <= maxTimes){
				IBlockState blockstate = world.getBlockState(new BlockPos((int) x, (int) y, (int) z));
				if(acceptWeakBlocks || blockstate.getBlock().getBlockHardness(blockstate, world, new BlockPos((int) x, (int) y, (int) z)) != 0){
					BlockBag bag = new BlockBag(blockstate, x, y, z);
					blocks.add(bag);
				}
				++times;
				x += speedX;
				y += speedY;
				z += speedZ;
			}
			return blocks;
		}
		/**
		 * This method gives the closest block in the line.
		 * @param world The world to look for the blocks.
		 * @param acceptWeakBlocks If this is true, blocks with a hardness of 0 will not count.
		 * @param pos if this is 1 or tinier, this method will search from position1, position2 otherwise.
		 * @return The nearest block in the line.
		 */
		public BlockBag getNearestBlockInLine(World world, boolean acceptWeakBlocks, Position pos){
			List blocks = getBlocks(world, acceptWeakBlocks);
			int times = 0;
			double distance = 1.0 / 0.0;
			BlockBag block = null;
			while(times < blocks.size()){
				BlockBag bag = (BlockBag) blocks.get(times);
				Position position = new Position(bag.xd, bag.yd, bag.zd);
				if(pos.getDistance(position) < distance){
					block = bag;
					distance = pos.getDistance(position);
				}
				++times;
			}
			return block;
		}
		/**
		 * This method makes a new line that will come not further than the nearest block from the given position.
		 * @param world The world to look for the blocks.
		 * @param acceptWeakBlocks If this is true, blocks with a hardness of 0 will count.
		 * @param position If this is 1 or tinier, it will look from position1, position2 otherwise.
		 * @return a new line that only reaches the nearest block from the old line.
		 */
		public Line toNearestBlock(World world, boolean acceptWeakBlocks, int position){
			Position p;
			Position q;
			if(position <= 1){
				p = position1;
				q = position2;
			}
			else {
				p = position2;
				q = position1;
			}
			BlockBag bag = getNearestBlockInLine(world, acceptWeakBlocks, p);
			if(bag != null){
				return new Line(p, new Position(bag.xd, bag.yd, bag.zd));
			}
			else {
				return this;
			}
		}
		/**
		 * Creates a new Line that starts from the given position and stops at the nearest entity of the right class.
		 * @param world The world to look for the entity.
		 * @param entityClass The class the entity must have or extend.
		 * @param position if it is 1 or tinier, this method will start looking from position1, position2 otherwise.
		 * @param exclude An entity that will not count, it can be null.
		 * @return A new line from the given position to the closest entity.
		 */
		public Line toNearestEntity(World world, Class entityClass, int position, Entity exclude){
			Position pos;
			if(position <= 1){
				pos = position1;
			}
			else {
				pos = position2;
			}
			EntityBag entity = getNearestEntity(world, pos, entityClass, exclude);
			if(entity != null){
				if(entity.entity != null){
					return new Line(pos, new Position(entity.x, entity.y, entity.z));
				}
				else {
					return this;
				}
			}
			else {
				return this;
			}
		}
		
		public static int fromDouble(double d){
			double t = d - (int)d;
			int a;
			if(t >= 0.5){
				a  = 1;
			}
			else {
				a = 0;
			}
			return (int)d + a;
		}
		
		public static double divineAccurate(double d, double d2){
			double x = d * 100000000;
			double y = d2 * 100000000;
			return x / y;
		}
		
		public static boolean isBetween(double d, double t1, double t2){
			double min = Math.min(t1, t2);
			double max = Math.max(t1, t2);
			return d >= t1 && d <= t2;
		}
		
		public static double max(double... d){
			double e = -Double.MAX_VALUE;
			int times = 0;
			while(times < d.length){
				double f = d[times];
				if(f > e){
					e = f;
				}
				++times;
			}
			return e;
		}
		
		public static boolean isNormalNumber(double d){
			String s = d + "";
			return !s.contains("NaN") && !s.contains("Infinity");
		}
		
	}
	
	public static class Position
	{
		
		public double x;
		public double y;
		public double z;
		/**
		 * Creates a new position on the given location.
		 * @param posX The x location of the position.
		 * @param posY The y location of the position.
		 * @param posZ The z location of the given position.
		 */
		public Position(double posX, double posY, double posZ){
			x = posX;
			y = posY;
			z = posZ;
		}
		
		Position() {}
		/**
		 * Creates a new position on the given location, this constructor works with integers.
		 * @param posX The x location of the position.
		 * @param posY The y location of the position.
		 * @param posZ The z location of the given position.
		 */
		public Position(int posX, int posY, int posZ){
			x = posX;
			y = posY;
			z = posZ;
		}
		/**
		 * Creates a new position on the given location, this constructor works with floats.
		 * @param posX The x location of the position.
		 * @param posY The y location of the position.
		 * @param posZ The z location of the given position.
		 */
		public Position(float posX, float posY, float posZ){
			x = posX;
			y = posY;
			z = posZ;
		}
		/**
		 * Creates a new position at the given entity.
		 * @param entity The entity where the position has to be created.
		 */
		public Position(Entity entity){
			x = entity.posX;
			y = entity.posY;
			z = entity.posZ;
		}
		
		public Position(RayTraceResult mop){
			x = mop.hitVec.x;
			y = mop.hitVec.y;
			z = mop.hitVec.z;
		}
		public Position(Vec3d vec3){
			x = vec3.x;
			y = vec3.y;
			z = vec3.z;
		}
		/**
		 * Returns this position as string.
		 */
		public String toString(){
			String string = "Position: x = " + x + ", y = " + y + ", z = " + z;
			return string;
		}
		/**
		 * Makes a string for the given position.
		 * @param p
		 * @return the string.
		 */
		public static String makeString(Position p){
			return p.toString();
		}
		/**
		 * Gives the x of this position as integer.
		 * @return The integer the double is the closest to.
		 */
		public int intX(){
			double t = x - (int)x;
			if(t >= 0.5){
				t = 1;
			}
			else {
				t = 0;
			}
			return (int) ((int)x + t);
		}
		/**
		 * Gives the y of this position as integer.
		 * @return The integer the double is the closest to.
		 */
		public int intY(){
			double t = y - (int)y;
			if(t >= 0.5){
				t = 1;
			}
			else {
				t = 0;
			}
			return (int) ((int)y + t);
		}
		/**
		 * Gives the z of this position as integer.
		 * @return The integer the double is the closest to.
		 */
		public int intZ(){
			double t = z - (int)z;
			if(t >= 0.5){
				t = 1;
			}
			else {
				t = 0;
			}
			return (int) ((int)z + t);
		}
		/**
		 * this method gives the x of the position as float.
		 * @return The x of the position as float.
		 */
		public float floatX(){
			return (float) x;
		}
		/**
		 * this method gives the y of the position as float.
		 * @return The y of the position as float.
		 */
		public float floatY(){
			return (float)y;
		}
		/**
		 * this method gives the z of the position as float.
		 * @return The z of the position as float.
		 */
		public float floatZ(){
			return (float)z;
		}
		/**
		 * Gives the distance to another position. It will use Math.hypot for getting it.
		 * @param p The other position.
		 * @return The distance from this position to the given position.
		 */
		public double getDistance(Position p){
			double distanceX;
			double distanceY;
			double distanceZ;
			if(x >= p.x){
				distanceX = x - p.x;
			}
			else {
				distanceX = p.x - x;
			}
			if(y >= p.y){
				distanceY = y - p.y;
			}
			else {
				distanceY = p.y - y;
			}
			if(z >= p.z){
				distanceZ = z - p.z;
			}
			else {
				distanceZ = p.z - z;
			}
			double distanceXZ = Math.hypot(distanceX, distanceZ);
			return Math.hypot(distanceXZ, distanceY);
		}
		/**
		 * Gives the distance to the given position. This will just use distanceX + distanceY + distanceZ.
		 * @param p The other position.
		 * @return The distance to the given position.
		 */
		public double getIndirectDistance(Position p){
			double distanceX;
			double distanceY;
			double distanceZ;
			if(x >= p.x){
				distanceX = x - p.x;
			}
			else {
				distanceX = p.x - x;
			}
			if(y >= p.y){
				distanceY = y - p.y;
			}
			else {
				distanceY = p.y - y;
			}
			if(z >= p.z){
				distanceZ = z - p.z;
			}
			else {
				distanceZ = p.z - z;
			}
			return distanceX + distanceY + distanceZ;
		}
		/**
		 * Gives the squared distance between two positions. It will use Math.hypot.
		 * @param a The first position.
		 * @param p The second position.
		 * @return The squared distance between the two positions.
		 */
		public static double getSquaredDistance(Position a, Position p){
			double distanceX;
			double distanceY;
			double distanceZ;
			if(a.x >= p.x){
				distanceX = a.x - p.x;
			}
			else {
				distanceX = p.x - a.x;
			}
			if(a.y >= p.y){
				distanceY = a.y - p.y;
			}
			else {
				distanceY = p.y - a.y;
			}
			if(a.z >= p.z){
				distanceZ = a.z - p.z;
			}
			else {
				distanceZ = p.z - a.z;
			}
			double distanceXZ = Math.hypot(distanceX, distanceZ);
			return Math.hypot(distanceXZ, distanceY);
		}
		/**
		 * Gives the distance between the given positions. This will just use distanceX + distanceY + distanceZ.
		 * @param p The first position.
		 * @param a The second position.
		 * @return The distance between the given positions.
		 */
		public static double getIndirectDistance(Position a, Position p){
			double distanceX;
			double distanceY;
			double distanceZ;
			if(a.x >= p.x){
				distanceX = a.x - p.x;
			}
			else {
				distanceX = p.x - a.x;
			}
			if(a.y >= p.y){
				distanceY = a.y - p.y;
			}
			else {
				distanceY = p.y - a.y;
			}
			if(a.z >= p.z){
				distanceZ = a.z - p.z;
			}
			else {
				distanceZ = p.z - a.z;
			}
			return distanceX + distanceY + distanceZ;
		}
		/**
		 * This method will write itself in the given NBTTagCompound.
		 * It will set a tag with the given key, and set the doubles there.
		 * This method is not called automatically, so save it where you need it.
		 * Be sure to use the same key at readFromNBt and to use another key for every position.
		 * @param nbt The NBTTagCompound where it will save its position.
		 * @param key The key it will use to create a new tag. 
		 */
		public void writeToNBT(NBTTagCompound nbt, String key){
			NBTTagCompound a = new NBTTagCompound();
			a.setDouble("x", x);
			a.setDouble("y", y);
			a.setDouble("z", z);
			nbt.setTag(key, a);
		}
		/**
		 * This method is made to read the position from the given NBTTagCompound.
		 * Be sure to use the same NBTTagCompound and string as writeToNBT.
		 * @param nbt The NBTTagCompound it will use to read the position.
		 * @param key The tag of the NBTTagCompound it will check.
		 */
		public void readFromNBT(NBTTagCompound nbt, String key){
			x = nbt.getCompoundTag(key).getDouble("x");
			y = nbt.getCompoundTag(key).getDouble("y");
			z = nbt.getCompoundTag(key).getDouble("z");
		}
		/**
		 * Spawns an entity at the given position.
		 * @param p The position the entity has to spawn.
		 * @param entity The entity to spawn.
		 * @param world The world to spawn the entity.
		 */
		public static void spawnEntity(Position p, Entity entity, World world){
			entity.posX = p.x;
			entity.posY = p.y;
			entity.posZ = p.z;
			world.spawnEntity(entity);
		}
		/**
		 * Spawns an entity at this position.
		 * @param entity The entity to spawn.
		 * @param world The world to spawn the entity.
		 */
		public void spawnEntity(Entity entity, World world){
			entity.posX = x;
			entity.posY = y;
			entity.posZ = z;
			world.spawnEntity(entity);
		}
		/**
		 * Sets a block at the given position.
		 * @param p The position to place the block.
		 * @param world The world to set the block.
		 * @param block The block to set.
		 */
		public static void setBlock(Position p, World world, IBlockState block){
			world.setBlockState(new BlockPos(p.intX(), p.intY(), p.intZ()), block);
		}
		/**
		 * Sets a block at this position.
		 * @param world The world to place the block.
		 * @param block The block to place.
		 */
		public void setBlock(World world, IBlockState block){
			world.setBlockState(new BlockPos(intX(), intY(), intZ()), block);
		}
		/**
		 * Spawns a particle at the given position with the given colors.
		 * @param world The world to spawn the particle.
		 * @param p The position to spawn the particle.
		 * @param color1 The amount red.
		 * @param color2 The amount green.
		 * @param color3 The amount purple/blue.
		 */
		public static void spawnParticle(World world, Position p, double color1, double color2, double color3){
			world.spawnParticle(EnumParticleTypes.REDSTONE, p.x, p.y, p.z, color1, color2, color3);
		}
		
		public boolean equals(Object b){
			if(b instanceof Position){
				Position c = (Position) b;
				if(c.x == x && c.y == y && c.z == z){
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return false;
			}
		}
		
	}
	
	public static class BlockBag {
		public Block block;
		
		public int x;
		public int y;
		public int z;
		
		public double xd;
		public double yd;
		public double zd;
		
		public BlockBag(Block block, double x, double y, double z){
			this.block = block;
			this.x = (int) x;
			this.y = (int) y;
			this.z = (int) z;
			xd = x;
			yd = y;
			zd = z;
		}
		public BlockBag(IBlockState block2, double x2, double y2, double z2) {
			this(block2.getBlock(), x2, y2, z2);
		}
		public String toString(){
			return "block: " + block + " x: " + x + " y: " + y + " z: " + z;
		}
	}
	
	public static class EntityBag {
		public Entity entity;
		
		public double x;
		public double y;
		public double z;
		
		public EntityBag(Entity entity, double x, double y, double z){
			this.entity = entity;
			this.x = x;
			this.y = y;
			this.z = z;
		}
	}

}
