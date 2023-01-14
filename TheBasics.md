# How to make 1.8.9 Forge Mods in IntelliJ Idea
This is a continuation to the [Setting Up](SettingUp.md) tutorial

## The Basics of Forge Mods
1. **The Core** </br>
When looking at the <u>Main.java</u> file you will see a bit of code. This is the so called Initialization Event (init for short) </br>
Inside there is the ProgressManager which, like the name implies, manages the progressbar. The ProgressManager.push function will show your mod when loading. </br>
To give your users a more "informative" loading experience you can use progressBar.step to add text to your bar, for example when youre loading the commands you could add progressBar.step("Initializing Commands"). </br>
Note that when you add a step you will also have to change the number of steps (the integer in ProgressManager.push) to the amount of step-lines you have. </br>
   </br>
2. **Registering Events** </br>
To use events I recommend creating a package called something like "Events" </br>
Click [here](Events.md) to learn more about events!
</br>
