package com.day2.chatlogparser;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        MessageFilter<String> filter = new IdleChatFilter();
        ChatLogParser parser = new ChatLogParser(filter);

        Map<String, List<String>> result =
                parser.parse("chatlog.txt");

        for (Map.Entry<String, List<String>> entry : result.entrySet()) {
            System.out.println("User: " + entry.getKey());
            for (String msg : entry.getValue()) {
                System.out.println("  " + msg);
            }
        }
    }
}

