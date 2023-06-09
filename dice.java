import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        System.out.print("> ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        int num1 = rand.nextInt(6) + 1;
        int num2 = rand.nextInt(6) + 1;

        int total = num1 + num2;

        System.out.println("Rolling the dice...");
        System.out.println("Die 1: " + num1);
        System.out.println("Die 2: " + num2);
        System.out.println("Total value: " + total);

        if (total > 7) {
            System.out.println(name + " won!");
        } else {
            System.out.println(name + " lost!");
        }
    }
}