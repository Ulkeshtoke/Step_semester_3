

import java.time.LocalDate;

abstract class LibraryItem {

    protected String title;

    public LibraryItem(String title) {
        this.title = title;
    }

    public abstract LocalDate getDueDate(LocalDate currentDate);
}

class Book extends LibraryItem {

    public Book(String title) {
        super(title);
    }

    @Override
    public LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(14);
    }
}

class DVD extends LibraryItem {

    public DVD(String title) {
        super(title);
    }

    @Override
    public LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(7);
    }
}

class Magazine extends LibraryItem {

    public Magazine(String title) {
        super(title);
    }

    @Override
    public LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(3);
    }
}

public class LibraryDueDate {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        LibraryItem[] items = {
            new Book("1984"),
            new DVD("The Matrix"),
            new Magazine("Forbes Issue 500")
        };

        for (LibraryItem item : items) {
            System.out.println(
                item.title + ": " + item.getDueDate(currentDate)
            );
        }
    }
}

