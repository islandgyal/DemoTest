package org.example;

import java.io.File;

public class MessageMareva extends File implements Mareva {
    Message mesage;
    public MessageMareva(File f){
        super(f.getPath());
     }
}
