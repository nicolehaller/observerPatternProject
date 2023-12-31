import org.junit.jupiter.api.Assertions;

class PlaneTest {
    //1) check that seatBought method works
    @org.junit.jupiter.api.Test
    void checkSeatBought(){
        Plane plane = new Plane();
        //check that you begin with 200 seats
        Assertions.assertEquals(200, plane.getNumberOfSeats());
        //check that after one seat is bought, the number of seats left is now 199
        PlaneReceipt planeReceipt = plane.seatBought();
        Assertions.assertEquals(199, plane.getNumberOfSeats());
    }

    //2) check that seatRefunded method works
    @org.junit.jupiter.api.Test
    void checkSeatRefunded(){
        Plane plane2 = new Plane();
        PlaneReceipt planeReceipt = plane2.seatBought(); //one seat is bought
        plane2.seatRefunded(planeReceipt); //that seat is refunded
        //check that after seat 200 is refunded the total seats is back to 200 total
        Assertions.assertEquals(200, plane2.getNumberOfSeats());
    }
}

