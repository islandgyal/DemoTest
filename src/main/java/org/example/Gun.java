package org.example;

public interface Gun  extends TypeFlux {
    @Override
    default void affiche() {
        System.out.println("Gun.affiche");
    }
}
