import java.util.ArrayList;
import java.util.*;
public class Plane {
    public int getNumberOfSeats(){
        return numberOfSeats;
    }
    public void setNumberOfSeats(int numberOfSeats){
        notify(numberOfSeats);
        this.numberOfSeats = numberOfSeats;
    }
    private int numberOfSeats = 200; //starts with total number of 200 seats
    private List <Observer> listeners = new ArrayList<>();
    //to be observable need three:
    public void addListener(Observer observer) {//pass in observer object
        listeners.add(observer); //add the observers to the list of observers
    }
    public void removeListener(Observer observer){
        listeners.remove(observer);
    }
    public void notify(int numberOfSeats){ //interface requires this parameter
        for(Observer o: listeners)
            o.notify(numberOfSeats); //goes through list of listeners and notifies them with seats available
    }

    public PlaneReceipt seatBought(){
        if (getNumberOfSeats()==0)
            //add user to waitlist
            return null;
        setNumberOfSeats(getNumberOfSeats()-1);
        return PlaneReceipt.getTicket();
    }

    public void seatRefunded(PlaneReceipt planeReceipt){
        //add one seat back to total
        setNumberOfSeats(getNumberOfSeats()+1);
        //observers automatically notified
    }
}
