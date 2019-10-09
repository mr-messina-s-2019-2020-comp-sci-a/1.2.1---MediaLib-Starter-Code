
/**
 * Write a description of class MediaLib here.
 *
 * @author (Garrett Harper)
 * @version (8/19/19)
 */
public class MediaLib
{
    public static void main()
    {
        System.out.println("Welcome to your Media Library");

        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        song1.setCost(1.25);
        Song song2 = new Song();
        song2.setTitle("EEEE");
        song2.setCost(1.50);
        Song song3 = new Song();
        song3.setTitle("h");
        song3.setCost(1.00);
        Book book1 = new Book();
        book1.setTitle("breh");
        Movie movie1 = new Movie();
        movie1.setTitle("e");
        
        Song [] songArray = new Song[5];
        songArray[0] = song1;
        songArray[1] = song2;
        songArray[2] = song3;
        System.out.println("The total cost of all the songs is $" + songArray[1].getCost() + songArray[0].getCost() + songArray[2].getCost());
        System.out.println(songArray[1].getTitle());
    }
}

