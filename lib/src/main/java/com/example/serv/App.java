package com.example.serv;

/**
 * Created by Agneev on 22-04-2016.
 */
import com.example.server.vo.Content;

public class App {
    public static void main(String[] args) {

        System.out.println("Sending POST to GCM");

        String apiKey = "AIzaSyBuLwtwJAvbA9zDr7DDMJ2wl-EpMaUDuL4";
        Content content = createContent();

        Post2Gcm.post(apiKey, content);
    }

    public static Content createContent() {
        Content c = new Content();

        c.addRegId("APA91bFUlkTwzYpv2yDDYDIQV9z_-XFRWbvSc_XX2GgCo15hw8d652PA_lhVjtJubjOYQo5lCARPkh3jOaR_Qg0bql8rXnN5uQOIhbTPvVjcOneMagfuelkQ251Mp6FLlP5vD2_BhmuK");

        c.createData("Working!!", "Test message");

        return c;
    }
}

