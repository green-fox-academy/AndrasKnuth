import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Bookshelf {
    public List<Book> bookshelf = new ArrayList<>();

    public void lighttestBookAuthor(){
        System.out.println(bookshelf.stream().min(comparing(Book::getWeight)).get().getAuthor());
    }

    public void mostPagesAuthor() {
        System.out.println(bookshelf.stream().max(comparing(Book::getPageNumber)).get().getAuthor());
    }


    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Hardcover hardcover = new Hardcover("The Pooh", "Milne", 1989, 125);
        Paperback paperback = new Paperback("Zorro", "Francesco Hidalgo", 1976, 256);
        bookshelf.bookshelf.add(0, hardcover);
        bookshelf.bookshelf.add(1, paperback);
        bookshelf.lighttestBookAuthor();
        bookshelf.mostPagesAuthor();
    }
}

/*
You must be able to add books to the bookshelf and must have methods to answer the following problems.
•	Who is the author of the lightest book?
•	Which author wrote the most pages?
 */