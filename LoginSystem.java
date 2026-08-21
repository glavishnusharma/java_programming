import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int password = 230126;
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Enter password: ");
            int Password = sc.nextInt();

            if (Password == password) {
                System.out.println("Access Granted");
                break;
            } 
            else {
                System.out.println("Incorrect Password");
            }

            if (i == 3) {
                System.out.println("You are locked out");
            }
        }

        sc.close();
    }
}