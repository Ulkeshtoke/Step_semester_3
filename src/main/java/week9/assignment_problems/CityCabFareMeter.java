
import java.util.Scanner;

abstract class Cab {
    abstract double getRatePerKm();

    double calculateBaseFare(double km) {
        return Math.max(km * getRatePerKm(), 100.0);
    }
}

interface NightService {
    double applyNightFare(double fare);
}

class MiniCab extends Cab {
    @Override
    double getRatePerKm() {
        return 10.0;
    }
}

class SedanCab extends Cab implements NightService {
    @Override
    double getRatePerKm() {
        return 14.0;
    }

    @Override
    public double applyNightFare(double fare) {
        return fare * 1.20;
    }
}

class SUVCab extends Cab implements NightService {
    @Override
    double getRatePerKm() {
        return 18.0;
    }

    @Override
    public double applyNightFare(double fare) {
        return fare * 1.20;
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double km = sc.nextDouble();
            String time = sc.next().toUpperCase();

            Cab cab;

            switch (type) {
                case "MINI":
                    cab = new MiniCab();
                    break;
                case "SEDAN":
                    cab = new SedanCab();
                    break;
                case "SUV":
                    cab = new SUVCab();
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown cab type: " + type
                    );
            }

            if (time.equals("NIGHT")
                    && !(cab instanceof NightService)) {
                System.out.println(
                    type + ": night service not available"
                );
                continue;
            }

            double fare = cab.calculateBaseFare(km);

            if (time.equals("NIGHT")) {
                fare = ((NightService) cab).applyNightFare(fare);
            }

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
