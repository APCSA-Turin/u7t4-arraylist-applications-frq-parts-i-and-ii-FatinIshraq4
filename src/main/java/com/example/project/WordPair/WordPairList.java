package com.example.project.WordPair;

import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words) {
        allPairs = new ArrayList<WordPair>();
        for (int i=0; i<words.length; i++) {
            for (int x = i + 1; x < words.length; x++) {
                allPairs.add(new WordPair(words[i], words[x]));
            }
        }

    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }

    public int numMatches() {
        /* to be implemented in part (b) */
        int count=0;
        for (int i=0; i<allPairs.size(); i++) {
            if (allPairs.get(i).getFirst().equals(allPairs.get(i).getSecond())) {
                count++;
            }
        }
        return count;

    }

    // The method below was added for testing;
    // it was not part of the original FRQ
    public String toString() {
        return allPairs.toString();
    }
}
