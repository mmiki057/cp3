public class Main {
    public static void main(String[] args) {
        Writer writer = new Writer("Alice", 35);

        Book book1 = new Book("Romeo & Juliet", 1997, "Tragedy");
        Book book2 = new Book("Metro 2033", 2014, "Dystopian Fiction");

        writer.addBook(book1);
        writer.addBook(book2);

        writer.showBooks();
    }
}
