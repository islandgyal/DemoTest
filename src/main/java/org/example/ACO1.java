package org.example;

public class ACO1<T extends TypeFlux> extends MessagePablo<T>{
     public ACO1(T elem) {
        super(elem);

    }
    @Override
    public void affiche(){
        System.out.println("ACO1.affiche");
    }
}
