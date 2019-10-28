package com.company;

import com.company.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String[] ArrUrl = args;
        UrlThread[] tread = new UrlThread[ArrUrl.length];
        for (int i = 0; i < ArrUrl.length; i++) {
            tread[i] = new UrlThread(ArrUrl[i]);
            tread[i].start();
        }
        for (int i = 0; i < ArrUrl.length ; i++) {
            tread[i].join();
        }
    }
}
