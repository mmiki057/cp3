class Library {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void displayLibrary() {
        System.out.println("Library Contents:");
        for (int i = 0; i < count; i++) {
            books[i].display();
            System.out.println();
        }
    }
}

