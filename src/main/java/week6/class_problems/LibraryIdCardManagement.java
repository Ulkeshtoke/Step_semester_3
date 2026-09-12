

public class LibraryIdCardManagement {

    static class IdCard {

        String name;
        int booksIssued;

        IdCard(String name, int booksIssued) {
            this.name = name;
            this.booksIssued = booksIssued;
        }
    }

    public static void main(String[] args) {

        IdCard card1 = new IdCard("Ravi", 2);

        IdCard card2 = card1;

        card2.booksIssued = 3;

        System.out.println(card1.booksIssued);
        System.out.println(card1 == card2);

        IdCard card3 = new IdCard("Ravi", 3);

        System.out.println(card1 == card3);
    }
}