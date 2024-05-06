package org.example.Car;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DiamondOperatorUnitTest {
    @Test
    public void whenCreateCarUsingDiamondOperator_thenSuccess() {
        Car<Diesel> a = new Car<>();
        a.method();
        Car<Essence> b = new Car<>();
        b.method();
        assertNotNull(a);
    }
}
