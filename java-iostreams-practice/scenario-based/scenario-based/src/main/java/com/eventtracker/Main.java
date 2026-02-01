package com.eventtracker;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> logs =
                EventTracker.trackEvents(UserService.class);

        for (String json : logs) {
            System.out.println(json);
        }
    }
}
