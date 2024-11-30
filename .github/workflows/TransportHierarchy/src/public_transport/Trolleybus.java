package public_transport;

public class Trolleybus implements PublicTransport {
    @Override
    public void startRoute() {
        System.out.println("Trolleybus is starting its route.");
    }

    @Override
    public void stopRoute() {
        System.out.println("Trolleybus has stopped its route.");
    }
}
