package transport;

import public_transport.Bus;
import public_transport.Trolleybus;
import steam.SteamLocomotive;
import steam.SteamBoat;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.startRoute();
        bus.stopRoute();
        Trolleybus trolleybus = new Trolleybus();
        trolleybus.startRoute();
        trolleybus.stopRoute();

        SteamLocomotive locomotive = new SteamLocomotive();
        locomotive.startSteam();
        locomotive.stopSteam();

        SteamBoat boat = new SteamBoat();
        boat.startSteam();
        boat.stopSteam();
    }
}
