package homework.HW3;

public class Book {
    // default initialization
    private String title = "Java Programming";
    private int pages = 200;

    public Book (String name, int pageCount) {
        title = name;
        pages = pageCount;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pages;
    }

    // Setter methods
    public void setTitle(String name) {
        title = name;
    }

    public void setPageCount(int pageCount) {
        pages = pageCount;
    }

    // toString method
    public String toString() {
        return "The book is called " + title + ", it has " + pages + " pages.";
    }

}
