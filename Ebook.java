public class Ebook extends Book {
    private String filename;

    public Ebook(String title, String author, String filename){
        super(title, author);
        this.filename = filename;
    }
}
