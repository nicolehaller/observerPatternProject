package cs370;

public class Expedia implements Observer{
    @Override
    public void notify(int numberOfSeats) {
        System.out.println("expedia: there are currently" + numberOfSeats + " seats left");
    }
}
