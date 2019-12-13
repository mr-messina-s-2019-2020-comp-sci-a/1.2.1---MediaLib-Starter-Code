
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (Matthew haywood)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib
{
    public static void main()
    {
        String songInfo = MediaFile.readString();
        int start = 0;
        int end = songInfo.indexOf("|");
        String name = "";
        String rating = "";
        while (songInfo.length() > end){ 
        //System.out.println(start);
        //System.out.println(end);
        if (end == -1){
            break;}
        name = songInfo.substring(start,end);
        start = end+1;
        //System.out.println(start);
        end = songInfo.indexOf("|", start+1);
        //System.out.println("Final update of end: "+ end);
        rating = songInfo.substring(start,end);
        start = end+1;
        //System.out.println(start);
        end = songInfo.indexOf("|", start+1);
        //System.out.println("Final update of end: "+ end);
        String num = "10";
        if(Integer.valueOf(rating) > 7){
        System.out.println(name + " " + rating);
        }
    }
    }
    //int highestRating = 7;
    
      // if(songInfo.Rating() >= highestRating){
           //System.out.println(songInfo);
      //  }
           
            
            
            
            
    
}