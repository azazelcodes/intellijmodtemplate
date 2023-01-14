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
</br>

   *Basics of registering events* </br>
   It is really easy to register events, you just have to start with `@SubscribeEvent(priority = EventPriority.HIGHEST)` and then `public void someForgeEvent(EventStuff event) { // Stuff }` </br>
</br>
*Example events* </br>
`OnChatReceived`, `OnTick` and `OnWorldJoin` are just a few of the many useful event within forge. </br>
</br>
   1. `OnChatReceived`: </br>
   This can be used to get a new API-Key, automatically warp somewhere or accept party invites. </br>
   ***Example:*** </br>
   ```java
   public class OnChatReceived {
       @SubscribeEvent(priority = EventPriority.HIGHEST)
	      public void chat(ClientChatReceivedEvent event) {
		         String message = event.message.getUnformattedText();
		         if (message.startsWith("Your new API key is ")) {
			            String key = message.split("key is ")[1];
                        Config.apiKey = key;
			            Utility.sendMsg("§aAPI Key set to " + key);
		         }
       }
   }
   ```
   </br>

   2. `OnTick`: </br>
   This can be used to get a players purse or just generally do something every second. **Note:** 20 Ticks = 1 Second </br>
   ***Example:*** </br>
   ```java
   public class OnTick {
       private static int ticks = 0;
   
       @SubscribeEvent
	      public void onTick(TickEvent.ClientTickEvent event) {
		         if (ticks % 20 == 0) {
               // Executes every second
           }
           ticks++;
       }
   }
   ```
   </br>
   
    3. `OnWorldJoin`: </br>
   This can be used to get which server the player joined or update your variables. </br>
   ***Example:*** </br>
   
   ```java
   public class OnWorldJoin {
       @SubscribeEvent
	      public void onEntityJoinWorld(FMLNetworkEvent.ClientConnectedToServerEvent event) {
		         // Do Stuff
       }
   }
   ``` 
   </br> </br>
</br>
