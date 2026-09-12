

public class CourseCreditManagement {

    static class Course {

        String code;
        String title;
        int credits;
        int labCredits;

        public Course(String code, String title, int credits, int labCredits) {
            this.code = code;
            this.title = title;
            this.credits = credits;
            this.labCredits = labCredits;
        }

        public Course(String code, String title, int credits) {
            this(code, title, credits, 0);
        }

        public int totalCredits() {
            return credits + labCredits;
        }
    }

    public static void main(String[] args) {

        Course course1 =
                new Course("CS101", "Java Programming", 4);

        Course course2 =
                new Course("CS102", "Data Structures", 3, 1);

        System.out.println(course1.title + " - Total Credits: "
                + course1.totalCredits());

        System.out.println(course2.title + " - Total Credits: "
                + course2.totalCredits());
    }
}