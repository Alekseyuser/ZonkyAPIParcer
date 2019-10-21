package com.Zonky.APIParcer;

import org.springframework.scheduling.annotation.Scheduled;

public class Receiver {



    @Scheduled(fixedRate = 30000)
    public void checkAPI(){

    }
}
