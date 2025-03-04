public class Project {
    private String title;
    private int pages;
    
    public Project(String newTitle, int newPages) {
        title = newTitle;
        pages = newPages;
    }
    
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    public int getPages() {
        return pages;
    }
    
    public void addPages(int morePages) {
        pages += morePages;
    }
   
    public String toString() {
        return "Project Title: " + title + ", Number of pages: " + pages;
    }

    public boolean equals(Project p2) {
        return pages == p2.getPages();
    }
}
