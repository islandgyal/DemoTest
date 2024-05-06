package org.example.Car;

public interface Essence2 extends Moteur {
    @Override
    public default void start() {
        System.out.println("Started Diesel...");
    }

}