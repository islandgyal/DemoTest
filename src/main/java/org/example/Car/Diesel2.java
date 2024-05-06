package org.example.Car;

public interface Diesel2 extends Moteur {
    @Override
    public default void start() {
        System.out.println("Started Diesel...");
    }

}