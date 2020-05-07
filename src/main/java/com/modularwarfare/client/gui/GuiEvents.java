package com.modularwarfare.client.gui;

import net.minecraftforge.client.event.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.client.resources.*;
import net.minecraftforge.fml.common.eventhandler.*;

public class GuiEvents
{
    @SubscribeEvent
    public void guiPostInit(final GuiScreenEvent.InitGuiEvent.Post event) {
        if (event.getGui() instanceof GuiInventory || event.getGui() instanceof GuiPlayerExpanded) {
            final GuiContainer gui = (GuiContainer)event.getGui();
            event.getButtonList().add(new GuiBaublesButton(55, gui, 27, 9, 10, 10, I18n.format((event.getGui() instanceof GuiInventory) ? "button.equipment" : "button.normal", new Object[0])));
        }
    }
}
