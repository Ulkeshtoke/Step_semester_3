
import java.util.Scanner;

abstract class Student {
    protected String name;
    private static final double TRANSPORT_FEE = 12000.0;

    Student(String name) {
        this.name = name;
    }

    abstract double calculateBaseFee();

    boolean usesBus() {
        return false;
    }

    double calculateTotalFee() {
        return calculateBaseFee()
            + (usesBus() ? TRANSPORT_FEE : 0.0);
    }
}

class DayScholar extends Student {
    DayScholar(String name) {
        super(name);
    }

    @Override
    double calculateBaseFee() {
        return 40000.0;
    }

    @Override
    boolean usesBus() {
        return true;
    }
}

class Hosteller extends Student {
    Hosteller(String name) {
        super(name);
    }

    @Override
    double calculateBaseFee() {
        return 40000.0 + 60000.0;
    }
}

class ScholarshipStudent extends Student {
    ScholarshipStudent(String name) {
        super(name);
    }

    @Override
    double calculateBaseFee() {
        return 20000.0;
    }

    @Override
    boolean usesBus() {
        return true;
    }
}

public class CollegeFeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCollected = 0.0;

        for (int i = 0; i < n; i++) {
            String type = sc.next().toUpperCase();
            String name = sc.next();

            Student student;

            switch (type) {
                case "DAY_SCHOLAR":
                    student = new DayScholar(name);
                    break;
                case "HOSTELLER":
                    student = new Hosteller(name);
                    break;
                case "SCHOLAR":
                    student = new ScholarshipStudent(name);
                    break;
                default:
                    throw new IllegalArgumentException(
                        "Unknown student type: " + type
                    );
            }

            double fee = student.calculateTotalFee();
            System.out.printf("%s: %.2f%n", student.name, fee);
            totalCollected += fee;
        }

        System.out.printf(
            "Total Collected: %.2f%n", totalCollected
        );
        sc.close();
    }
}
