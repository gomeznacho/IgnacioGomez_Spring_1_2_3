package com.xample;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        //System.out.println("notification");
    }

    public void imprimirSaludo() {
        System.out.println("Hola Mundo");
    }
}
