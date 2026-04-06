import java.util.Scanner;
public class PasswordValidator {
    public static boolean validatePassword(String password) {

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        if (password.length() < 8) {
            System.out.println("It's Too Short, Password must be 8 characters.");
        }

        for (int i = 0; i < password.length(); i++) {

            char currentChar = password.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                hasUpperCase = true;
            }

            if (Character.isDigit(currentChar)) {
                hasDigit = true;
            }
        }

        if (!hasUpperCase) {
            System.out.println("Missing an uppercase letter.");
        }

        if (!hasDigit) {
            System.out.println("Missing a digit.");
        }

        return password.length() >= 8 && hasUpperCase && hasDigit;
    }

    public static void main(String[] args) {

        Scanner nk = new Scanner(System.in);
        while (true) {

            System.out.print("Enter your password: ");
            String password = nk.nextLine();

            if (validatePassword(password)) {
                System.out.println("Password accepted. Strong password!");
                break;
            }

            System.out.println("Please try again.\n");
        }

    }
}