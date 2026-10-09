
import java.util.Scanner;

abstract class Ticket {
    protected int count;
    private static final double CONVENIENCE_FEE = 20.0;

    Ticket(int count) {
        this.count = count;
    }

    abstract double calculatePrice();

    double calculateTotal() {
        return calculatePrice() + (count * CONVENIENCE_FEE);
    }
}

class RegularTicket extends Ticket {
    RegularTicket(int count) {
        super(count);
    }

    @Override
    double calculatePrice() {
        return count * 150.0;
    }
}

class PremiumTicket extends Ticket {
    PremiumTicket(int count) {
        super(count);
    }

    @Override
    double calculatePrice() {
        return count * 250.0;
    }
}

class ReclinerTicket extends Ticket {
    ReclinerTicket(int count) {
        super(count);
    }

    @Override
    double calculatePrice() {
        return count * 400.0;
    }
}

public class MovieTicketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalCollected = 0.0;

        for (int i = 0; i < n; i++) {
            String seat = sc.next().toUpperCase();
            int count = sc.nextInt();

            Ticket ticket;

            switch (seat) {
                case "REGULAR":
                    ticket = new RegularTicket(count);
                    break;
                case "PREMIUM":
                    ticket = new PremiumTicket(count);
                    break;
                case "RECLINER":
                    ticket = new ReclinerTicket(count);
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown seat type: " + seat
                    );
            }

            double amount = ticket.calculateTotal();
            System.out.printf("%s: %.2f%n", seat, amount);
            totalCollected += amount;
        }

        System.out.printf("Total: %.2f%n", totalCollected);
        sc.close();
    }
}
