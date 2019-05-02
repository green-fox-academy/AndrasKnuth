abstract class Book {
    String title;
    String author;
    int releaseYear;
    int pageNumber;
    Double weight;

    public Double getWeight() {
        return weight;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}

/*
Write a program which can store books in a bookshelf.
There are two types of books.
•	Hardcover book
o	It should have the following fields: title, author, release year, page number and weight.
o	The weight must be calculated from the number of pages (every page weighs 10 grams) plus the weight of the cover which is 100 grams.
o	It must have a method that returns a string which contains the following information about the book: author, title and year.
•	Paperback book
o	It should have the following fields: title, author, release year, page number and weight.
o	The weight must be calculated from the number of pages (every page weighs 10 grams) plus the weight of the cover which is 20 grams.
o	It must have a method that returns a string which contains the following information about the book: author, title and year.
You must be able to add books to the bookshelf and must have methods to answer the following problems.
•	Who is the author of the lightest book?
•	Which author wrote the most pages?

 */