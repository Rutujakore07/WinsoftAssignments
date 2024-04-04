//Q4:Write a Java Program to find the duplicate characters in a string.
import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersQue4 {
    public static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>(); // hashmap creation
        str = str.toLowerCase();// converting string to lowercase
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (charCountMap.containsKey(ch)) {
                    charCountMap.put(ch, charCountMap.get(ch) + 1); // If the character already exists in the map, increment its count
                } else {
                    charCountMap.put(ch, 1); //for the character is encountered  first time, add it to the map with count 1
                }
            }
        }
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }    public static void main(String[] args) {
        String str = "this is the assignment of java programing";
        findDuplicateCharacters(str);
    }
}


