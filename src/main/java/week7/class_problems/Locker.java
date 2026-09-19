public class Locker {

    private String combination;
    private final String lockerNumber;

    public Locker(String lockerNumber, String combination) {
        this.lockerNumber = lockerNumber;
        this.combination = combination;
    }

    public boolean changeCombination(String currentCode, String newCode) {
        if (combination.equals(currentCode)) {
            combination = newCode;
            return true;
        }

        return false;
    }

    public String getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {

        Locker locker = new Locker("L-101", "1234");

        System.out.println("Locker number: " + locker.getLockerNumber());

        boolean wrongChange =
                locker.changeCombination("9999", "5678");

        System.out.println("Wrong code accepted: " + wrongChange);

        boolean correctChange =
                locker.changeCombination("1234", "5678");

        System.out.println("Correct code accepted: " + correctChange);
    }
}