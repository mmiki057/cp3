public class Main {
    public static void main(String[] args) {

        Book physicalBook = new Book("1984", "George Orwell");
        physicalBook.display();
        System.out.println();

        Audiobook audiobook1 = new Audiobook("The Alchemist", "Paulo Coelho", 200, 30);
        Audiobook audiobook2 = new Audiobook("Becoming", "Michelle Obama", 150, 45);

        audiobook1.display();
        System.out.println();
        audiobook2.display();

        Library library = new Library(5);

        library.displayLibrary();
    }
}
