
/**
 * The mutator and acessor for the movie titles
 *
 * @author (Matthew haywood)
 * @version (8/23/2019)
 */
public class Movies
{
    // instance variables - replace the example below with your own
    private String movieTitles;
    private int duration;

    /**
     * Constructor for objects of class Movies
     */
    public Movies()
    {
        // initialise instance variables
         movieTitles= "";
         duration = 0; 
    }
    public String getTitle() {
    return movieTitles;
}   
    public void setTitle(String movieTitles ){
        movieTitles = "";
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int x) {
        duration = x;
    }
    public static void main()
{
   movieTitles movie1 = new movieTitles();
   
    
    
}
}
