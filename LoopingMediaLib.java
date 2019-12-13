
/**
 * Write a description of class LoopingMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLib
{
    public static void main()
    {

        String songInfo = MediaFile.readString();
        //System.out.println(songInfo);
        
     
        //for (int x = 0; x < 6; x++)
        while (songInfo != null)
        {        
           System.out.println(songInfo);
           songInfo = MediaFile.readString();
           }
        
        

    }
}
