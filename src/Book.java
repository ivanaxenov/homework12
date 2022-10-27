public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(Author Author, String title, int year) {
        this.author = (Author) Author;
        this.title = title;
        this.year = year;

    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return (Author) this.author;
    }

    public void setYear(int year) {
        this.year = year;

    }

    public String toString() {
        return getAuthor().name + " " + getAuthor().lastName + " ";
    }


}
