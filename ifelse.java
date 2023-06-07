import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        // age
        System.out.print("Enter your age:");
        Scanner ask = new Scanner(System.in);
        int age = ask.nextInt();
        if (age < 18) {
            System.out.println("You are under 18");
        } else {
            System.out.println("You are adult");
        }
        ;

        // even odd
        System.out.print("Enter the number: ");
        Scanner num = new Scanner(System.in);
        int find = num.nextInt();
        if (find % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd.");
        }

        // greater or lesser
        System.out.print("Enter the num1: ");
        Scanner asknum = new Scanner(System.in);
        int num1 = asknum.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = asknum.nextInt();
        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println("Both numbers are equal");
        }

    }
}