
import java.util.Scanner;

abstract class ElectricityConnection {
    abstract double calculateBill(double units);
}

class HomeConnection extends ElectricityConnection {
    @Override
    double calculateBill(double units) {
        if (units <= 100) {
            return units * 5;
        }
        return (100 * 5) + ((units - 100) * 7);
    }
}

class ShopConnection extends ElectricityConnection {
    @Override
    double calculateBill(double units) {
        return (units * 8) + 100;
    }
}

class FactoryConnection extends ElectricityConnection {
    @Override
    double calculateBill(double units) {
        return Math.max(units * 6, 1000);
    }
}

public class ElectricityConnectionBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalBill = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double units = sc.nextDouble();

            ElectricityConnection connection;

            switch (type) {
                case "HOME":
                    connection = new HomeConnection();
                    break;
                case "SHOP":
                    connection = new ShopConnection();
                    break;
                case "FACTORY":
                    connection = new FactoryConnection();
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown connection type: " + type
                    );
            }

            double bill = connection.calculateBill(units);
            System.out.printf("%s: %.2f%n", type, bill);
            totalBill += bill;
        }

        System.out.printf("Total Bill: %.2f%n", totalBill);
        sc.close();
    }
}
