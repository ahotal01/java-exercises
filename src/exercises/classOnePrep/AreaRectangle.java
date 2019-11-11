package exercises.classOnePrep;
import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in;
        int height;
        int width;
        int area;

        in = new Scanner(System.in);
        System.out.println("What is the height?");
        height = in.nextInt();
        System.out.println("What is the width?");
        width = in.nextInt();

        area = height * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
