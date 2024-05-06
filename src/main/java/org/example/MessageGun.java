package org.example;

import java.io.File;

public class MessageGun extends File implements Gun {
    Message mesage;
    public MessageGun(File f){
        super(f.getPath());
    }
}
