

abstract class Delivery {

    protected double weight;
    protected double distance;

    public Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public abstract double calculateFee();
}

class StandardDelivery extends Delivery {

    public StandardDelivery(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateFee() {
        return 5 + (0.50 * weight) + (0.10 * distance);
    }
}

class ExpressDelivery extends Delivery {

    public ExpressDelivery(double weight, double distance) {
        super(weight, distance);
    }

    @Override
    public double calculateFee() {
        return 15 + (1.00 * weight) + (0.20 * distance);
    }
}

class InternationalDelivery extends Delivery {

    private double customsFee;

    public InternationalDelivery(double weight, double distance,
                                 double customsFee) {
        super(weight, distance);
        this.customsFee = customsFee;
    }

    @Override
    public double calculateFee() {
        return 25 + (2.00 * weight)
                + (0.50 * distance)
                + customsFee;
    }
}

public class DeliveryFee {

    public static void main(String[] args) {

        Delivery[] deliveries = {
            new StandardDelivery(10, 50),
            new ExpressDelivery(5, 20),
            new InternationalDelivery(20, 100, 30)
        };

        double total = 0;

        System.out.printf("STANDARD: %.2f%n",
                deliveries[0].calculateFee());

        System.out.printf("EXPRESS: %.2f%n",
                deliveries[1].calculateFee());

        System.out.printf("INTERNATIONAL: %.2f%n",
                deliveries[2].calculateFee());

        for (Delivery delivery : deliveries) {
            total += delivery.calculateFee();
        }

        System.out.printf("Total: %.2f%n", total);
    }
}

