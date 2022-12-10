package com.vetpetmon.synapselib;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

@Mod(modid = SynapseLib.MOD_ID, name = SynapseLib.MOD_NAME, version = SynapseLib.VERSION, dependencies = SynapseLib.DEPENDENCIES)
public class SynapseLib {
    public static final String MOD_ID = "synlib";
    public static final String MOD_NAME = "SynLib";
    public static final String VERSION = "1.0";
    public static final String DEPENDENCIES = "required-after:forge@[14.21.1.2387,)";

    public static final String PROXY_COMMON = "com.vetpetmon.SynapseLib.CommonProxy";
    public static final String PROXY_CLIENT = "com.vetpetmon.SynapseLib.ClientProxy";
    public static Logger logger = LogManager.getLogger(MOD_ID);// I am hopefully assuming everyone is using an up-to-date Forge. Otherwise, we're going to run into problems

    @Mod.Instance(MOD_ID)
    public static SynapseLib instance;

    @SidedProxy(serverSide = PROXY_COMMON, clientSide = PROXY_CLIENT)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    public static void InitializeSynLib(String expectedVersion, String modName) {
            if (!(Objects.equals(expectedVersion, VERSION)))
                SynapseLib.logger.error("SynapseLib is on version " + VERSION + ", but " + modName + " expected version " + expectedVersion + ". Any reported errors you experience will be invalidated.");
    }
}
