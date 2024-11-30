package steam;

public class SteamLocomotive implements SteamEngine{
    @Override
    public void startSteam() {
        System.out.println("Steam locomotive is starting steam.");
    }

    @Override
    public void stopSteam() {
        System.out.println("Steam locomotive has stopped steam.");
    }
}
