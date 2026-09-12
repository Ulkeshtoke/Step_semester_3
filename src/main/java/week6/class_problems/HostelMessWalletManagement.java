

public class HostelMessWalletManagement {

    static class Wallet {

        private double balance;

        public Wallet(double openingBalance) {
            if (openingBalance < 0) {
                System.out.println("Invalid opening balance: setting balance to 0");
                this.balance = 0;
            } else {
                this.balance = openingBalance;
            }
        }

        public void topUp(double amount) {
            if (amount <= 0) {
                System.out.println("Top-up rejected: invalid amount");
            } else {
                balance += amount;
            }
        }

        public void deduct(double amount) {
            if (amount <= 0) {
                System.out.println("Deduction rejected: invalid amount");
            } else if (amount > balance) {
                System.out.println("Deduct rejected: insufficient balance");
            } else {
                balance -= amount;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {

        Wallet wallet = new Wallet(500);

        wallet.topUp(200);

        System.out.println("Balance after top-up: " + wallet.getBalance());

        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}