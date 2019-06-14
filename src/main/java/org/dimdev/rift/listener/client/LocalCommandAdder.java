package org.dimdev.rift.listener.client;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.command.CommandSource;

public interface LocalCommandAdder {
    void registerLocalCommands(CommandDispatcher<CommandSource> dispatcher);
}
