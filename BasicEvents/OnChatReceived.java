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