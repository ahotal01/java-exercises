package exercises.classTwoPrep;
import java.util.ArrayList;
import java.util.Arrays;

public class SumEven {
    public static int evenSum(ArrayList<Integer> nums) {
        int numNums;
        numNums = nums.size();

        int sumEvens = 0;

        for (int i = 0; i < numNums; i++) {
            int tempNum = nums.get(i);
            if(tempNum % 2 == 0) {
                sumEvens += tempNum;
            }
        }

        return sumEvens;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144));

        System.out.println(evenSum(numbers));
    }
}
