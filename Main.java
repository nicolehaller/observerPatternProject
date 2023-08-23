package org.example;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.addListener(new Expedia());
        PlaneReceipt planeReceipt = plane.seatBought();
        plane.seatRefunded(planeReceipt);
    }
}