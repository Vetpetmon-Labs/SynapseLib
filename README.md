# SynapseLib
A Minecraft: Java Edition code library for 1.12.2

Full usage example can be found in mods like Wyrms of Nyrus.

## Features:
- RNG helper functions
- Proximity block detection
- Material type checking
- Configuration file helpers
- Clamp functions
- Block blacklist generation 

## Setup

[![Hosted By: Cloudsmith](https://img.shields.io/badge/OSS%20hosting%20by-cloudsmith-blue?logo=cloudsmith&style=for-the-badge)](https://cloudsmith.com)

We are hosted via [Cloudsmith](https://cloudsmith.com)!

In order to import SynapseLib into your IDE via gradle, add this to your build.gradle's repositories:
```
maven {
    url 'https://dl.cloudsmith.io/public/vetpetmon-labs/synlib/maven/'
}
```
Then add this to dependencies:
```
implementation fg.deobf('com.vetpetmon.synapselib:synlib:1.0')
```
These instructions are for the Gradle Wrapper, v4.9.

After that, run `buildDependents` and wait for it to finish.

## How to use
SynapseLib really only requires that you add this into your mod constructor's preInt method:
```
InitializeSynLib(expectedLibVersion, yourModName);
```
This notifies users (and you) if versions do not match what is expected.

After including this, you are free to code your mod using SynapseLib.