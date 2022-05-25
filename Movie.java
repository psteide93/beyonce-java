public class Movie{
    private String title;
    private int year; 
    private int rating;
    
    public Movie(String title, int year, int rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

 

    public int getYear() {
        return year;
    }


    public int getRating() {
        return rating;
    }

}