import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files=new ArrayList<String>();
    // A player for the music files.
    MusicPlayer player = new MusicPlayer();
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {

    }
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }



    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index>files.size())
        {
            System.out.println("Erorr!!!");
            return;
        }

        System.out.println(files.get(index)+"\n");
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (int i=0;i<files.size();i++)
            System.out.println(i+1+")"+files.get(i)+"\n");
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index>files.size())
        {
            System.out.println("Erorr!!!");
            return;
        }
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(index>files.size())
        {
            System.out.println("Erorr!!!");
            return;
        }
        player.startPlaying(files.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(index>files.size())
        {
            System.out.println("Erorr!!!");
            return false;
        }
        return true;
    }


    public void search(String Sname){
        for (int i=0;i<files.size();i++){
            if ( files.get(i).contains(Sname))
                System.out.println(i+1+")"+files.get(i)+"\n");
        }

    }







}
