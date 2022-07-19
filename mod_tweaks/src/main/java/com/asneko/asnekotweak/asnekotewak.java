package com.asneko.asnekotweak;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("asnekotweak")
public class asnekotewak {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "asnekotweak";
	
	public asnekotewak() {		
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}
}
