package org.example;


import java.io.File;

public class c {
    public static void main(String[] args) {
        MessageMareva msgm = new MessageMareva(new File("file.txt"));
        MessageGun msgg = new MessageGun(new File("file.txt"));

        System.out.println("1 Mesage ");
        ACO1<Mareva> m = new ACO1<>(msgm);
        m.affiche();
        m.defaultVoid();

        ASO1<Gun> n = new ASO1<>(msgg);
        n.affiche();
        n.defaultVoid();

        ATO1 o= new ATO1<>(msgm);
o.affiche();
o.defaultVoid();

        System.out.println("2 Message ");
        MessagePablo<Gun> p = new ASO1<>(msgg);
        p.affiche();
        MessagePablo<Mareva> l = new ACO1<>(msgm);
        l.affiche();
/**
        System.out.println("3 Message");
        MessagePablo<Gun> pm = new MessagePablo<>(msgg);
        pm.affiche();
        MessagePablo<Mareva> lm = new MessagePablo<>(msgm);
        lm.affiche();

**/
    }
}