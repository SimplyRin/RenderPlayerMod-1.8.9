package net.simplyrin.renderplayermod;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.simplyrin.renderplayermod.command.RenderPlayer;

@SideOnly(Side.CLIENT)
@Mod(modid = RenderPlayerMod.MODID, version = RenderPlayerMod.VERSION, clientSideOnly = true)
public class RenderPlayerMod {

	public static final String MODID = "RenderPlayerMod";
	public static final String VERSION = "1.0-KAMO";

	@EventHandler
    public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(this);
		ClientCommandHandler.instance.registerCommand(new RenderPlayer());

		File file = new File("config/renderplayermod.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@SubscribeEvent
	public void onRenderGui(RenderGameOverlayEvent.Post event) {
		GuiInventory.drawEntityOnScreen(70 + 51, 15 + 75, 30, (float) (50 + 51) - 100, (float) (100 + 75 - 50) - 120, Minecraft.getMinecraft().thePlayer);
	}

	public static String getPrefix() {
		return "§7[§cRenderPlayer§7] §r";
	}

}
