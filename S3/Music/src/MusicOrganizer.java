import java.util.ArrayList;
import java.util.Iterator;

public class MusicOrganizer {
    private ArrayList<String> tracks = new ArrayList<String>();
    public void removeTrack(String nameLike) {
        Iterator<String> it =tracks.iterator();
        while(it.hasNext()) {
            String temp = it.next();
                it.remove();
        }
    }




}
