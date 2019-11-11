package org.launchcode.java.studios.charactercounts;

// import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharCounter {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);

        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        char[] charactersInString = testString.toCharArray();

        HashMap<Character, Integer> charactersUsed = new HashMap<>();

        for (char i : charactersInString) {
            //if (Character.isLetter(i)) {
                i = Character.toUpperCase(i);
                if (charactersUsed.containsKey(i)) {
                    charactersUsed.replace(i, charactersUsed.get(i) + 1);
                } else {
                    charactersUsed.put(i, 1);
                }
           // }
        }

        System.out.println("\nCharacters used:");

        for (Map.Entry<Character, Integer> character : charactersUsed.entrySet()) {
            System.out.println(character.getKey() + " (" + character.getValue() + ")");
        }
    }
}
