package com.modularwarfare.client.export;

public class ItemModelExport {
	
	public String parent = "item/generated";
	public TextureLayers textures = new TextureLayers();
	
	public void setBaseLayer(String path)
	{
		textures.layer0 += path;
	}
	
	static class TextureLayers
	{
		public String layer0 = "modularwarfare:items/";
	}

}
