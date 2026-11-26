package comparable;

public class Book implements Comparable<Book> {

    private String title;
    private Integer pages;

    public Book(String title, Integer pages) {
        this.title = title;
        this.pages = pages;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.pages, this.pages);
    }
}
