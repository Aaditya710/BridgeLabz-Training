package com.day2.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    private static final Pattern CHAT_PATTERN =
            Pattern.compile("\\[(.*?)\\]\\s(.*?):\\s(.*)");

    private MessageFilter<String> filter;

    public ChatLogParser(MessageFilter<String> filter) {
        this.filter = filter;
    }

    public Map<String, List<String>> parse(String filePath) throws IOException {

        // TreeMap → users automatically sorted alphabetically
        Map<String, List<String>> userMessages = new TreeMap<>();

        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;

        while ((line = br.readLine()) != null) {
            Matcher matcher = CHAT_PATTERN.matcher(line);

            if (matcher.matches()) {
                String time = matcher.group(1);
                String user = matcher.group(2);
                String message = matcher.group(3);

                if (filter.allow(message)) {
                    userMessages
                        .computeIfAbsent(user, k -> new ArrayList<>())
                        .add("[" + time + "] " + message);
                }
            }
        }
        br.close();
        return userMessages;
    }
}

