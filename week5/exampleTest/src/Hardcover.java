public class Hardcover extends Book{

    public Hardcover() {
    }

    public Hardcover(String title, String author, int releaseYear, int pageNumber) {
        this.title = title;
        this.author = author;
        this.releaseYear = releaseYear;
        this.pageNumber = pageNumber;
        this.weight = pageNumber * 0.001 + 0.1;
    }

    public String toString() {
        String toString = this.author + this.title + this.releaseYear;
        return toString;
    }
}
/*
•	Hardcover book
o	It should have the following fields: title, author, release year, page number and weight.
o	The weight must be calculated from the number of pages (every page weighs 10 grams) plus
the weight of the cover which is 100 grams.
o	It must have a method that returns a string which contains the following information about the book:
author, title and year.
 */