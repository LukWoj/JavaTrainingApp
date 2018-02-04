package data;

public class Publication {
    private int year;
    private String title;
    private String publisher;

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected Publication(int year, String title, String publisher) {
        setYear(year);
        setTitle(title);
        setPublisher(publisher);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publication that = (Publication) o;

        if (year != that.year) return false;
        if (!title.equals(that.title)) return false;
        return publisher.equals(that.publisher);
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + title.hashCode();
        result = 31 * result + publisher.hashCode();
        return result;
    }
}