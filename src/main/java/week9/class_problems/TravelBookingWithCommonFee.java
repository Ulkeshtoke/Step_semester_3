
import java.util.Scanner;

abstract class TravelBooking {
    protected double distanceKm;

    TravelBooking(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    abstract double calculateFare();

    double getTotalFare() {
        return calculateFare() + 50;
    }
}

class BusBooking extends TravelBooking {
    BusBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    double calculateFare() {
        return distanceKm * 2;
    }
}

class TrainBooking extends TravelBooking {
    TrainBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    double calculateFare() {
        return distanceKm * 1.5;
    }
}

class FlightBooking extends TravelBooking {
    FlightBooking(double distanceKm) {
        super(distanceKm);
    }

    @Override
    double calculateFare() {
        return 2500 + (distanceKm * 4);
    }
}

public class TravelBookingWithCommonFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            double distance = sc.nextDouble();

            TravelBooking booking;

            switch (type) {
                case "BUS":
                    booking = new BusBooking(distance);
                    break;
                case "TRAIN":
                    booking = new TrainBooking(distance);
                    break;
                case "FLIGHT":
                    booking = new FlightBooking(distance);
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown booking type: " + type
                    );
            }

            System.out.printf("%s: %.2f%n",
                    type, booking.getTotalFare());
        }

        sc.close();
    }
}
