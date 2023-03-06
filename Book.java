public class Book {
    private String title;
    private int yearOfPublishing;

    public Book() {
    }

    public Book(String title, int yearOfPublishing) {
        this.title = title;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", yearOfPublishing='" + yearOfPublishing + '\'' +
                '}';
    }
}
