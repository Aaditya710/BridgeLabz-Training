package com.day2.chatlogparser;

import java.util.*;

public class IdleChatFilter implements MessageFilter<String> {

    private static final List<String> IDLE_KEYWORDS =
            Arrays.asList("lol", "brb", "haha", "ttyl");

    @Override
    public boolean allow(String message) {
        String lower = message.toLowerCase();
        for (String word : IDLE_KEYWORDS) {
            if (lower.contains(word)) {
                return false;
            }
        }
        return true;
    }
}

