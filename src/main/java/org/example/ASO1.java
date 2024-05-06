package org.example;

public class ASO1 <T extends TypeFlux> extends MessagePablo<T>{
    String id="ASO1";

    public ASO1(T elem) {
        super(elem);
    }

    @Override
    public void affiche(){
        System.out.println("ASO1.affiche");
    }

    public void affiche2() {
        System.out.println("ASO1.affiche2");
    }
}
