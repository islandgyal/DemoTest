package org.example;

public class ATO1<T extends TypeFlux> extends MessagePablo<T>{
    String id="ATO1";


    public ATO1(T elem) {
        super(elem);
    }

    @Override
    public void affiche(){
        System.out.println("ATO1.affiche");
    }
}
