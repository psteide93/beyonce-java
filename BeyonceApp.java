import java.util.ArrayList;
import java.util.HashMap;

public class BeyonceApp {

    private static   HashMap<String, ArrayList<?>> beyonceData;
    public static void main(String[] args) {
        initializeData();
        printAllSongs();

        System.out.println(beyonceData.toString());
    }

    private static void printAllSongs(){
        System.out.println("PRINT ALL SONGS");
        beyonceData.get("hits").stream().forEach(song -> System.out.println(song));

    }

    private static void initializeData(){
        ArrayList<Song> songsList = new ArrayList<Song>();
        ArrayList<String> bootyliciousHair = new ArrayList<String>();
        bootyliciousHair.add("straight");
        bootyliciousHair.add("blonde");
        bootyliciousHair.add("pink tips");
        Song bootylicious = new Song(
                "Bootylicious",
                true,
                "destinysChild", bootyliciousHair,
                "fedora with yellow feather",
                "dressing room dance",
                "Move your body up and down, make your booty touch the ground",
                7,
                false,
                20);
        songsList.add(bootylicious);

        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        Movie goldmember = new Movie(
                "Austin Power's Goldmember",
                2002,
                5);
        moviesList.add(goldmember);

       
        beyonceData = new HashMap<String, ArrayList<?>>();
        beyonceData.put("movies", moviesList);
        beyonceData.put("hits", songsList);

    }
}