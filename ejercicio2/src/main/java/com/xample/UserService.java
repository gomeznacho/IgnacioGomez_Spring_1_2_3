package com.xample;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    com.xample.NotificationService notificationService;
    public UserService(NotificationService notificationService){
        this.notificationService = notificationService;
        //System.out.println("user");
    }

}
