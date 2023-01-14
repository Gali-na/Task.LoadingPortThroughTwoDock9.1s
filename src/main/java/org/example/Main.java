package org.example;

public class Main {
    public static void main(String[] args) {
        Port port = new Port();
        Ship ship = new Ship("1",port);
        Ship ship2 = new Ship("2",port);
        Ship ship3 = new Ship("3",port);
        Thread thread = new Thread(ship);
        Thread thread2 = new Thread(ship2);
        Thread thread3 = new Thread(ship3);
        thread3.start();
        thread.start();
        thread2.start();


    }
}
