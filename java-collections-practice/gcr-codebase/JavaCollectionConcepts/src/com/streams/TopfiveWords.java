package com.streams;

import java.io.*;
import java.util.*;

public class TopfiveWords {

    public static void main(String[] args) {

        String fileName = "input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Reading file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            while ((line = br.readLine()) != null) {

                // Remove punctuation and convert to lowercase
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word,
                                wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            return;
        }

        // Sorting words by frequency
        List<Map.Entry<String, Integer>> list =
                new ArrayList<>(wordCount.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        // Display top 5 words
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            System.out.println(
                    list.get(i).getKey() + " : " + list.get(i).getValue());
        }
    }
}
