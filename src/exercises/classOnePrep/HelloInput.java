package exercises.classOnePrep;
import java.util.Scanner;

public class HelloInput {
    public static void main(String[] args) {
        Scanner in;
        String name;

        in = new Scanner(System.in);
        System.out.println("What is your name?");
        name = in.next();

        System.out.println("Hello, " + name + "!");
    }
}
