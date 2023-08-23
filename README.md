# observerPatternProject
CS370 spring 2023 project 
Task: choose a Design Pattern and implement it using a mock-system in Java


- My code utilized the Observer Pattern by having the Expedia Website implement an Observer Interface which notifies expedia with the number of Seats available on the flight
- In Main() I added expedia to my list of listeners which made sure it was notified when seats were bought or refunded
- I created two methods in a Plane class:
1) seatBought() if no seats available would add user to waitlist. Otherwise it would update the number of seats to be one less
2) seatRefunded() if the user doesn’t want their seat anymore, their seat is refunded and  it would update the number of seats to be one more

- I created a Unit Test for each of these methods

