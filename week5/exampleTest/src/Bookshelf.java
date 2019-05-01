import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

public class Bookshelf {
    public List<Book> bookshelf = new ArrayList<>();

    public void lighttestBookAuthor(List bookshelf){
        bookshelf.stream().max(comparing(Book::getWeight)).get();

    }


    public static void main(String[] args) {
    }
}

/*
You must be able to add books to the bookshelf and must have methods to answer the following problems.
•	Who is the author of the lightest book?
•	Which author wrote the most pages?
 */