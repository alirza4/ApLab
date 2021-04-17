
/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael K�lling.
 * @version 2011.07.31
 */
public class MusicPlayer
{
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }


    /**
     * Startplaying the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        if (isPlaying){
            System.out.println( "\n* music changed\t" + " "+filename + " is playing... *\n");
        }
        else{
            System.out.println("\n* "+filename + " is playing... *\n");
            isPlaying = true;
        }

    }

    /**
     * stop stoping auodio file
     */
    public void stop()
    {
        if (isPlaying) {
            System.out.println("\n* player is stopped! *\n");
            isPlaying = false;
        }
        else System.out.println("\n* player has already stopped *\n");

    }



}