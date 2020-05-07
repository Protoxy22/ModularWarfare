package com.modularwarfare.utility;

public class AABBInt {
    public int minX;
    public int minY;
    public int minZ;
    public int maxX;
    public int maxY;
    public int maxZ;

    public AABBInt(final int p1, final int p2, final int p3) {
        this(0, 0, 0, p1, p2, p3);
    }

    public AABBInt(final int p1, final int p2, final int p3, final int p4, final int p5, final int p6) {
        this.minX = p1;
        this.minY = p2;
        this.minZ = p3;
        this.maxX = p4;
        this.maxY = p5;
        this.maxZ = p6;
    }

    public boolean isCollided(final AABBInt aabb) {
        return this.minX < aabb.maxX && this.maxX > aabb.minX && this.minY < aabb.maxY && this.maxY > aabb.minY && this.minZ < aabb.maxZ && this.maxZ > aabb.minZ;
    }

    public int sizeX() {
        return this.maxX - this.minX;
    }

    public int sizeY() {
        return this.maxY - this.minY;
    }

    public int sizeZ() {
        return this.maxZ - this.minZ;
    }

    public void repeat(final RepeatFunc func) {
        int count = 0;
        for (int x = this.minX; x < this.maxX; ++x) {
            for (int y = this.minY; y < this.maxY; ++y) {
                for (int z = this.minZ; z < this.maxZ; ++z) {
                    func.processing(x, y, z, count);
                    ++count;
                }
            }
        }
    }

    public interface RepeatFunc {
        void processing(final int p0, final int p1, final int p2, final int p3);
    }
}
