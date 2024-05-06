package org.example;

public interface Mareva extends TypeFlux {
    @Override
    default void affiche() {
        System.out.println("Mareva.affiche");
    }

}
