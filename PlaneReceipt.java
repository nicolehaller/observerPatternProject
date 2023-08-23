import java.time.LocalDateTime;

/*
@author Emily Haller
 */
public class PlaneReceipt {
    static int  _ticketNumber = 0; // was _number
    static int  _seatNumber = 0;

    private int ticketNumber, seatNumber = 0;
    private final LocalDateTime localDateTime;
    private PlaneReceipt()
    {
        localDateTime = LocalDateTime.now();
    }
    static public PlaneReceipt getTicket()
    {
        PlaneReceipt planeReceipt = new PlaneReceipt();
        _ticketNumber+=2;
        planeReceipt.ticketNumber = _ticketNumber;
        _seatNumber+=1;
        planeReceipt.seatNumber = _seatNumber;
        return planeReceipt;
    }
    public int getTicketNumber() {
        return ticketNumber;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}

