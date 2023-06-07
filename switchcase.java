import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("Hit the Button.");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Hy");
                break;
                case 2:
                System.out.println("Hello");
                break;
                case 3:
                System.out.println("kdhr mnh uthaya ha");
                break;
            default:
            System.out.println("Invalid input");
                break;
        }
    }
}
