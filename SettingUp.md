# How to make 1.8.9 Forge Mods in IntelliJ Idea
I'm assuming you've already installed Java and IntelliJ Idea. I will be using Community Edition but any other version is fine.
If you havent already you should setup a WorkspaceFolder in about this structure 
./ForgeWorkspace/yourmodname/
and
./ForgeWorkspace/Downloads/

## Setting it up
You can download the Forge MDK from 
https://files.minecraftforge.net/net/minecraftforge/forge/ 
or if you want it preconfigured from
https://github.com/rayorsomething/intellijmodtemplate

1. Download the MDK to your ForgeWorkspace (which I will from now on call FWS) Downloads folder and extract it into your FWS Mods folder that we set up earlier.
2. Right-click on the build.gradle file and select Open with -> IntelliJ Idea
3. Change the build.gradle and mcmod.info (./ForgeWorkspace/yourmodname/src/main/resources) to your linking 
- IMPORTANT! CHANGE YOUR MODID TO SOMETHING ELSE THAN THE PRESET!
4. Refactor the existing packages to your stuff (for example: change yourname to your name) 
5. Start coding!

## The Basics of Forge Mods
[NEXT TUTORIAL](TheBasics.md)