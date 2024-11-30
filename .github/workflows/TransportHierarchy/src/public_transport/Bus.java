package public_transport;

public class Bus implements PublicTransport{
    @Override
    public void startRoute(){
        System.out.println("Bus is starting its route");
    }

    @Override
    public void stopRoute(){
        System.out.println("Bus is stopped its route");
    }

}
