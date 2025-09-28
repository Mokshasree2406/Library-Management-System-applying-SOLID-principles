import Item.*;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter", "B001", "J.K. Rowling", 500);
        CD cd1 = new CD("Thriller", "C001", "Michael Jackson", 300);
        DVD dvd1 = new DVD("Inception", "D001", "Christopher Nolan", 700);

        LibraryItem[] items = {book1, cd1, dvd1};
        Library library = new Library(items);

        System.out.println("Total Library Value: " + library.calaculateTotalValue());

        LateFeeCalculate[] borrowedItems = {book1, cd1, dvd1};
        LateFeeCalculator calculator = new LateFeeCalculator();
        System.out.println("Total Late Fee for 5 days: " + calculator.totalLateFee(borrowedItems, 5));
    }
}
