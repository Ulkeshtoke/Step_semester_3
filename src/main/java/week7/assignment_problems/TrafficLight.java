

public class TrafficLight {

    private String currentColor;
    private final int lightId;

    public TrafficLight(int lightId) {
        this.lightId = lightId;
        this.currentColor = "RED";
    }

    public void next() {
        if (currentColor.equals("RED")) {
            currentColor = "GREEN";
        } else if (currentColor.equals("GREEN")) {
            currentColor = "YELLOW";
        } else {
            currentColor = "RED";
        }
    }

    public String getColor() {
        return currentColor;
    }

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight(101);

        System.out.println("Color: " + light.getColor());

        light.next();
        System.out.println("Color: " + light.getColor());

        light.next();
        System.out.println("Color: " + light.getColor());

        light.next();
        System.out.println("Color: " + light.getColor());
    }
}

