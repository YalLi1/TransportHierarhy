package steam;

public class SteamBoat implements SteamEngine{
    @Override
    public void startSteam() {
        System.out.println("Steamboat is starting steam.");
    }

    @Override
    public void stopSteam() {
        System.out.println("Steamboat has stopped steam.");
    }
}
