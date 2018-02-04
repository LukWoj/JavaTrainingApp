package data;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        super(year, title, publisher);
        setLanguage(language);
        setMonth(month);
        setDay(day);
    }

   /* public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getYear() + "-"
                + getMonth() + "-" + getDay() + "; " + getLanguage();
        System.out.println(info);
    }*/
   @Override
   public String toString() {
       StringBuilder sb = new StringBuilder(32);
       sb.append(getTitle());
       sb.append("; ");
       sb.append(getPublisher());
       sb.append("; ");
       sb.append(getYear());
       sb.append("; ");
       sb.append(getMonth());
       sb.append("; ");
       sb.append(getDay());
       sb.append("; ");
       sb.append(getLanguage());
       return sb.toString();
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        if (month != magazine.month) return false;
        if (day != magazine.day) return false;
        return language.equals(magazine.language);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + month;
        result = 31 * result + day;
        result = 31 * result + language.hashCode();
        return result;
    }
}