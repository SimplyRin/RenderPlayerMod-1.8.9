package net.simplyrin.renderplayermod;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;

public class ChatHandler {

	public static void send(String message) {
		message = message.replaceAll("&", "\u00a7");
		message = message.replaceAll("§", "\u00a7");

		Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(message));
	}

}
