class Book{
    private String title;
    private int year_of_publishing;
    private String genre;

    public Book(String title, int year_of_publishing, String genre) {
        this.title = title;
        this.year_of_publishing = year_of_publishing;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear_of_publishing() {
        return year_of_publishing;
    }

    public void setYear_of_publishing(int year_of_publishing) {
        this.year_of_publishing = year_of_publishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    } 
    
    public void openBook(){
        System.out.println("The book is opened");
    }

    public void closeBook(){
        System.out.println("The book is closed");
    }

    public void makeBookMark(){
        System.out.println("The bookmark is put");
    }

    public void buyBook(){
        System.out.println("The book is bought");
    }
}