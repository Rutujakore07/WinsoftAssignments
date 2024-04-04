// Q3:Write a Java Program to count the number of words in a string using HashMap.

import java.util.HashMap;

public class WordCountQue3 {
    public static void main(String[] args) {
        String str = "hello winsoft these Assignmrnts are very very good";
        str = str.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        String[] words = str.split("\\s+");// splitting string to word
        HashMap<String, Integer> wordCountMap = new HashMap<>();// hashmap creation for counting words
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);// word already present increment by 1
            } else {
                wordCountMap.put(word, 1);// ifword is new add it
            }
        }
        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
        int totalWords = words.length;
        System.out.println("Total number of words: " + totalWords);
    }
}

