package exercises.classTwoPrep;
import java.util.ArrayList;
import java.util.Arrays;

public class FiveLetterStrings {
    public static void main (String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("all", "happy", "bonbon", "money", "maybe", "and", "quiet", "senses"));
        int numStrings = wordList.size();
        for (int i = 0; i < numStrings; i++) {
            String tempWord = wordList.get(i);
            if (tempWord.length() == 5) {
                System.out.println(tempWord);
            }
        }
    }
}
