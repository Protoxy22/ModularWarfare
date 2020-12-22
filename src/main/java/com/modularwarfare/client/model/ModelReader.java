package com.modularwarfare.client.model;

import com.modularwarfare.ModularWarfare;
import com.modularwarfare.client.tmt.ModelRendererTurbo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.IResource;
import net.minecraft.util.ResourceLocation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ModelReader {

    public static ModelGun readModel(ResourceLocation rl) {

        ModelGun model = new ModelGun();

        IResource res;

        model.path = rl.getResourcePath();

        try {
            res = Minecraft.getMinecraft().getResourceManager().getResource(rl);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        InputStream stream;

        try {
            stream = res.getInputStream();
        } catch (Exception e) {
            System.out.println("FATAL ERROR: Model Loading Failed! File Path: " + rl.getResourcePath());
            return null;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        String line;

        ModelRendererTurbo e = null;
        try {
            while ((line = reader.readLine()) != null) {
                if (line.contains("textureX")) {
                    String h = substring(line, line.indexOf("=") + 1, line.indexOf(";"));
                    h = h.trim();
                    model.textureHeight = Integer.parseInt(h);
                    ModularWarfare.LOGGER.info("Loaded gunModel textureHeight: "+model.textureHeight);
                } else if (line.contains("textureWidth")) {
                    String w = substring(line, line.indexOf("=") + 1, line.indexOf(";"));
                    w = w.trim();
                    model.textureWidth = Integer.parseInt(w);
                    ModularWarfare.LOGGER.info("Loaded gunModel textureWidth: "+model.textureWidth);
                } else if(line.contains("gunModel = ")){
                    int num = Integer.parseInt(substring(line, line.indexOf("[")+1, line.indexOf("]")));
                    ModularWarfare.LOGGER.info("Loaded gunModel size: "+num);
                    model.gunModel = new ModelRendererTurbo[num];
                }
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return model;
    }


    public static String substring (String s,int startPos, int endPos){
        return s.substring(startPos, endPos);
    }

    public static String substring (String s,int startPos){
        return s.substring(startPos);
    }
}
