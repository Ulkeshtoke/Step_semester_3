
import java.util.Scanner;

abstract class Plot {
    abstract double calculateArea();
}

class CirclePlot extends Plot {
    private final double radius;

    CirclePlot(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectanglePlot extends Plot {
    private final double length;
    private final double width;

    RectanglePlot(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class TrianglePlot extends Plot {
    private final double base;
    private final double height;

    TrianglePlot(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class GardenPlotAreaReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalArea = 0;

        for (int i = 0; i < n; i++) {
            String shape = sc.next().toUpperCase();
            String owner = sc.next();

            Plot plot;

            switch (shape) {
                case "CIRCLE":
                    plot = new CirclePlot(sc.nextDouble());
                    break;

                case "RECTANGLE":
                    plot = new RectanglePlot(
                        sc.nextDouble(), sc.nextDouble()
                    );
                    break;

                case "TRIANGLE":
                    plot = new TrianglePlot(
                        sc.nextDouble(), sc.nextDouble()
                    );
                    break;

                default:
                    throw new IllegalArgumentException(
                        "Unknown shape: " + shape
                    );
            }

            double area = plot.calculateArea();

            System.out.printf(
                "%s (%s): %.2f%n", owner, shape, area
            );

            totalArea += area;
        }

        System.out.printf("Total Area: %.2f%n", totalArea);
        sc.close();
    }
}
