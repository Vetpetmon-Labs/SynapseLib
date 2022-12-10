# SynapseLib
A Minecraft: Java Edition code library for 1.12.2

## Features:
- RNG helper functions
- Proximity block detection
- Material type checking
- Configuration file helpers
- Clamp functions
- Block blacklist generation 

## How to use
SynapseLib really only requires that you add this into your mod constructor's preInt method:
```
InitializeSynLib(expectedLibVersion, yourModName);
```
This notifies users (and you) if versions do not match what is expected.

After including this, you are free to code your mod using SynapseLib.