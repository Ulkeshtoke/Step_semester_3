

abstract class Transport {
    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();
}

class Bus extends Transport {
    public Bus(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return Math.min(2 + (0.10 * distance), 10);
    }
}

class Train extends Transport {
    public Train(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 3 + (0.15 * distance);
    }
}

class Metro extends Transport {
    private double peakFactor;

    public Metro(double distance, double peakFactor) {
        super(distance);
        this.peakFactor = peakFactor;
    }

    @Override
    public double calculateFare() {
        return 1.50 + (0.20 * distance * peakFactor);
    }
}

public class PublicTransportFare {
    public static void main(String[] args) {

        Transport[] transports = {
            new Bus(50),
            new Train(50),
            new Metro(50, 1.5)
        };

        double total = 0;

        System.out.printf("BUS: %.2f%n",
                transports[0].calculateFare());

        System.out.printf("TRAIN: %.2f%n",
                transports[1].calculateFare());

        System.out.printf("METRO: %.2f%n",
                transports[2].calculateFare());

        for (Transport transport : transports) {
            total += transport.calculateFare();
        }

        System.out.printf("Total Fare: %.2f%n", total);
    }
}