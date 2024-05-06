package org.example;

public class ASO1 <T extends Object & TypeFlux> extends MessagePablo<T>{

    public ASO1(T elem) {
        super(elem);
    }

    @Override
    public void affiche(){
        System.out.println("ASO1.affiche");
    }

    public void affiche2() {
    }
}
