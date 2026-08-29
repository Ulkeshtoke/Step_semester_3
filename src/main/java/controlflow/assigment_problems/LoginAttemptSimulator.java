package controlflow.assigment_problems;

import java.util.Scanner;

public class LoginAttemptSimulator {

    public void loginWithAttempts() {
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "1234";

        for (int attempt = 1; attempt <= 3; attempt++) {

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful");
                break;
            }

            if (attempt == 3) {
                System.out.println("Account locked");
            } else {
                System.out.println("Invalid credentials");
            }
        }

        scanner.close();
    }

    public static void main(String[] args) {
        LoginAttemptSimulator login = new LoginAttemptSimulator();
        login.loginWithAttempts();
    }
}