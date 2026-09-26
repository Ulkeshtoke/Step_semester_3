

public class PasswordChecker {

    private final String password;

    public PasswordChecker(String password) {
        this.password = password;
    }

    public String getStrength() {
        if (password.length() < 6) {
            return "Weak";
        } else if (password.length() < 10) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {

        PasswordChecker password1 =
                new PasswordChecker("abc");

        PasswordChecker password2 =
                new PasswordChecker("abcdef");

        PasswordChecker password3 =
                new PasswordChecker("abcdefghij");

        System.out.println("Password 1: " + password1.getStrength());
        System.out.println("Password 2: " + password2.getStrength());
        System.out.println("Password 3: " + password3.getStrength());
    }
}
