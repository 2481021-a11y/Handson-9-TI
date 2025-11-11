package latihan4.product;

public class Book extends Product {
    private String author;
    private int pages;
    private String isbn;

    public Book(String productId, String name, double price, int stock,
                String author, int pages, String isbn) {
        super(productId, name, price, stock);
        this.author = author;
        this.pages = pages;
        this.isbn = isbn;
    }

    @Override
    public void displayDetails() {
        System.out.println("BOOK PRODUCT");
        System.out.printf("│ ID: %-35s │%n", productId);
        System.out.printf("│ Title: %-32s │%n", name);
        System.out.printf("│ Price: Rp %-28.0f │%n", price);
        System.out.printf("│ Stock: %-32d │%n", stock);
        System.out.printf("│ Author: %-31s │%n", author);
        System.out.printf("│ Pages: %-32d │%n", pages);
        System.out.printf("│ ISBN: %-33s │%n", isbn);
    }

    @Override
    public String getCategory() {
        return "Book";
    }
}