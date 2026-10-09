
import java.util.Scanner;

abstract class Appliance {
    abstract double getPowerWatts();

    double calculateUnits(double hours) {
        return getPowerWatts() * hours / 1000.0;
    }
}

interface SaverMode {
    double applySaver(double units);
}

class Fridge extends Appliance {
    @Override
    double getPowerWatts() {
        return 150.0;
    }
}

class AirConditioner extends Appliance implements SaverMode {
    @Override
    double getPowerWatts() {
        return 1500.0;
    }

    @Override
    public double applySaver(double units) {
        return units * 0.75;
    }
}

class Television extends Appliance {
    @Override
    double getPowerWatts() {
        return 100.0;
    }
}

class WashingMachine extends Appliance implements SaverMode {
    @Override
    double getPowerWatts() {
        return 500.0;
    }

    @Override
    public double applySaver(double units) {
        return units * 0.75;
    }
}

public class HomeApplianceEnergyReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double totalCost = 0.0;

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");

            String type = parts[0].toUpperCase();
            double hours = Double.parseDouble(parts[1]);
            boolean saverRequested =
                parts.length >= 3
                && parts[2].equalsIgnoreCase("SAVER");

            Appliance appliance;

            switch (type) {
                case "FRIDGE":
                    appliance = new Fridge();
                    break;
                case "AC":
                    appliance = new AirConditioner();
                    break;
                case "TV":
                    appliance = new Television();
                    break;
                case "WASHER":
                    appliance = new WashingMachine();
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown appliance: " + type
                    );
            }

            if (saverRequested && !(appliance instanceof SaverMode)) {
                System.out.println(
                    type + ": saver mode not supported"
                );
                continue;
            }

            double units = appliance.calculateUnits(hours);

            if (saverRequested) {
                units = ((SaverMode) appliance).applySaver(units);
            }

            double cost = units * 8.0;

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                type, units, cost
            );

            totalCost += cost;
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}
