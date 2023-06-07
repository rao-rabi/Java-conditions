import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class practice {
    public static void main(String[] args) {
        // Make a Calculator. Take 2 numbers (a & b) from the user and an operation as
        // follows :
        // 1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b
        // Calculate the result according to the operation given and display it to the
        // user.
        char operator;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2");
        int num2 = sc.nextInt();
        System.out.println("Enter operator with which you want to perform operation:");
        operator = sc.next().charAt(0);
        switch (operator) {
            case '+':
            result = num1 + num2;    
                System.out.println("Sum of a and b is: "+ result);
            break;
            case '-':
            result = num1 - num2;
                System.out.println("Difference of num1 ad num2 is "+ result);
            break;
            case '*':
            result = num1*num2;
                System.out.println("Product of a and b is: "+ result);
            break;
            case '/':
            result = num1 / num2;
                System.out.println("divsion of a and b is: "+ result);
            break;
            case '%':
            result = num1 % num2 ;
                System.out.println("modulus of a and b is: "+ result);
            break;
        }
        // Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        System.out.print("Enter month number");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("January");
                break;
                case 2:
                System.out.println("February");
                break;
                case 3:
                System.out.println("March");
                break;
                case 4:
                System.out.println("April");
                break;
                case 5:
                System.out.println("May");
                break;
                case 6:
                System.out.println("June");
                break;
                case 7:
                System.out.println("July");
                break;
                case 8:
                System.out.println("August");
                break;
                case 9:
                System.out.println("September");
                break;
                case 10:
                System.out.println("October");
                break;
                case 11:
                System.out.println("November");
                break;
                case 12:
                System.out.println("December");
                break;
            default:
            System.out.println("Invalid Input");
                break;
        }
        }
    }