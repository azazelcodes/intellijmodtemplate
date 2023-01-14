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