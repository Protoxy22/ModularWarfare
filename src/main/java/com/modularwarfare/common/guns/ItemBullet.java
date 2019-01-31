package com.modularwarfare.common.guns;

import com.modularwarfare.common.type.BaseItem;
import com.modularwarfare.common.type.BaseType;

public class ItemBullet extends BaseItem {

	public BulletType type;
	
	public ItemBullet(BulletType type) {
		super(type);
		this.type = type;
		this.render3d = false;
	}
	
	@Override
	public void setType(BaseType type)
	{
		this.type = (BulletType) type;
	}
	
}