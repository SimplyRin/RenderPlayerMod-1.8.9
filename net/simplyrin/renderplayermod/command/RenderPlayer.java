package net.simplyrin.renderplayermod.command;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.simplyrin.renderplayermod.ChatHandler;
import net.simplyrin.renderplayermod.RenderPlayerMod;

public class RenderPlayer extends CommandBase {

	public String getCommandName() {
		return "renderplayer";
	}

	public String getCommandUsage(ICommandSender sender) {
		return "/renderplayer <right|left>";
	}

	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
	}

	public int getRequiredPermissionLevel() {
		return 0;
	}

	public void processCommand(ICommandSender sender, String[] args) {
		if(args.length > 0) {
			if(args[0].equalsIgnoreCase("right")) {
			}

			if(args[0].equalsIgnoreCase("left")) {
			}
		}
		ChatHandler.send(RenderPlayerMod.getPrefix() + "&cUsage: /renderplayer <right|left>");
		return;
	}

}
