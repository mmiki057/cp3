import java.util.ArrayList;
import java.util.List;

class Writer{
    private String name;
    private int age;
    private int number_of_books;

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
        this.number_of_books = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber_of_books() {
        return number_of_books;
    }

    public void setNumber_of_books(int number_of_books) {
        this.number_of_books = number_of_books;
    }

    public void addBook(Book book) {
        books.add(book);
        number_of_books++;
        System.out.println(name + " has added the book: " + book.getTitle());
    }

    public void showBooks() {
        System.out.println(name + " has written the following books:");
        for (Book book : books) {
            System.out.println("- " + book.getTitle() + " (" + book.getYear_of_publishing() + ")");
        }
    }

    private List<Book> books = new ArrayList<>();

    public void writeBook(){
        System.out.println("I'm writing!");
    }

    public void readBook(){
        System.out.println("I'm reading!");

    }

    public void drink(){
        System.out.println("I'm drinking!");

    }

    public void postBook(){
        System.out.println("I posted my book!");
    }
}