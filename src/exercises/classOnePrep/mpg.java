package exercises.classOnePrep;
import java.util.Scanner;

public class mpg {
    public static void main(String[] args) {
        Scanner in;
        float miles;
        float gasUsed;
        float mpg;

        in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = in.nextFloat();
        System.out.println("How many gallons of gas have you used?");
        gasUsed = in.nextFloat();

        mpg = miles / gasUsed;
        System.out.println("Your miles per gallon for this trip was " + mpg);
    }
}
