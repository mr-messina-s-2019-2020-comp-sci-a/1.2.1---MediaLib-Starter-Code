
/**
 * we are making a library for probably media stuff
 *
 * @author (Matthew Haywood)
 * @version (version 1.0.0, 8/19/2019)
 */
public class MediaLib{
    
    public static void main()
{
    
        System.out.println ("Welcome to your Media Library, the one stop spot for memes");
        Songs song1 = new Songs();
        System.out.println(song1);
        song1.setTitle("Howard the Alien ten hour remix");
        System.out.println(song1.getTitle());
        song1.setRating(10);
        System.out.println("this song scored a " + song1.getRating() + " on the meme charts");
        song1.setPrice(10.99);
        System.out.println(song1.getPrice() + " plus shipping and handiling");
        
        
        System.out.println("");
        System.out.println("");
        
        
        Songs song2 = new Songs();
        System.out.println(song2);
        song2.setTitle("ocean man");
        System.out.println(song2.getTitle());
        song2.setRating(10);
        System.out.println("this song scored a " + song2.getRating() + "on the meme charts");
        song2.setPrice(9.99);
        System.out.println(song2.getPrice() + " plus shipping and handiling");
        
        System.out.println("");
        System.out.println("");
        
        Songs song3 = new Songs();
        System.out.print(song3);
        song3.setTitle("We are Number One");
        System.out.println(song3.getTitle());
        song3.setRating(9);
        System.out.println("this song scored a " + song3.getRating() + " on the meme scale");
        song3.setPrice(29.99);
        System.out.println(song3.getPrice() + "plus shipping and handling");
        
        System.out.println("");
        System.out.println("");
        
        Songs song4 = new Songs();
        System.out.println(song4);
        song4.setTitle("megalovania");
        System.out.println(song4.getTitle());
        song4.setRating(8);
        System.out.println("this song scored a " + song4.getRating() + "on the meme charts");
        song4.setPrice(100000000);
        System.out.println(song4.getPrice() + "plus shipping and handling");
        
        System.out.println("");
        System.out.println("");
        
        
        Songs song5 = new Songs();
        System.out.println(song5);
        song5.setTitle("all star");
        System.out.println(song5.getTitle());
        song5.setRating(5);
        System.out.println(" this song scored a " + song5.getRating() + "on the meme charts");
        song5.setPrice(109281);
        System.out.println(song5.getPrice() + "plus shipping and handling");
        
        System.out.println("");
        System.out.println("");
        
        Songs song6 = new Songs();
        System.out.println(song6);
        song6.setTitle("cholcolate rain");
        System.out.println(song6.getTitle());
        song6.setRating(6);
        System.out.println(" this song scored a " + song6.getRating() + "on the meme charts");
        song6.setPrice(190);
        System.out.println(song6.getPrice() + "plus shipping and handling");
        
        System.out.println("");
        System.out.println("");
        
        Songs song7 = new Songs();
        System.out.println(song7);
        song7.setTitle("Take on me");
        System.out.println(song7.getTitle());
        song7.setRating(8);
        System.out.println(" this song scored a " + song7.getRating() + "on the meme charts");
        song7.setPrice(2350);
        System.out.println(song7.getPrice() + "plus shipping and handling");
        
        System.out.println("");
        System.out.println("");
        
        
        
        /*MediaFile.writeString(song1.getTitle() + "|" + song1.getRating() + song2.getTitle() + "|" + song2.getRating() 
        + song3.getTitle() + "|" + song3.getRating() + song4.getTitle() + "|" + song4.getRating() + song5.getTitle() + "|" + song5.getRating()
        + song6.getTitle() + "|" + song6.getRating() + song7.getTitle() + "|" + song7.getRating());*/
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());
        MediaFile.saveAndClose();
        
       
    }
}
