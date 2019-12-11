
/**
 * This is where you can find the lit of songs that go into the MediaLib project
 *
 * @author (Mathew Haywood)
 * @version (8/19/2019)
 */
public class Songs
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorites;
    /**
     * Constructor for objects of class Songs
     */
    public Songs()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        price = 0.0;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String t) {
        title = t;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }
    public void setPrice(double p) {
        price = p;
    }
    public double getPrice() {
        return price;
    }
    public void addToFavorites() {
        favorites = true;
    }
    public Songs(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public Songs(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
    }
}

