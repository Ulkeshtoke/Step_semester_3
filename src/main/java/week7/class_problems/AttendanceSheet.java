public class AttendanceSheet {

    private final boolean[] present;

    public AttendanceSheet(int totalStudents) {
        present = new boolean[totalStudents];
    }

    public void markPresent(int studentIndex) {
        if (studentIndex >= 0 && studentIndex < present.length) {
            present[studentIndex] = true;
        }
    }

    public boolean isPresent(int studentIndex) {
        if (studentIndex >= 0 && studentIndex < present.length) {
            return present[studentIndex];
        }

        return false;
    }

    public int getPresentCount() {
        int count = 0;

        for (boolean studentPresent : present) {
            if (studentPresent) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        AttendanceSheet sheet = new AttendanceSheet(5);

        sheet.markPresent(0);
        sheet.markPresent(2);
        sheet.markPresent(2);

        System.out.println("Student 1 present: " + sheet.isPresent(0));
        System.out.println("Student 3 present: " + sheet.isPresent(2));
        System.out.println("Total present: " + sheet.getPresentCount());
    }
}