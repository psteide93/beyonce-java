import java.util.ArrayList;

public class Song {
    private String title;
    private boolean group;
    private String groupName;
    private ArrayList<String> hair;
    private String signatureLook;
    private String videoTheme;
    private String bestLine;
    private int fierceness;
    private boolean formation;
    private int dancers;

    public Song(
        String title,
        boolean group,
        String groupName,
        ArrayList<String> hair,
        String signatureLook,
        String videoTheme,
        String bestLine,
        int fierceness,
        boolean formation,
        int dancers
    ) {
        this.title = title;
        this.group = group;
        this.groupName = groupName;
        this.hair = hair;
        this.signatureLook = signatureLook;
        this.videoTheme = videoTheme;
        this.bestLine = bestLine;
        this.fierceness = fierceness;
        this.formation = formation;
        this.dancers = dancers;
    }

    public String getTitle(){
        return title;
    }

    public boolean getGroup(){
        return group;
    }

    public String getGroupName(){
        return groupName;
    }

    public ArrayList<String> getHair(){
        return hair;
    }

    public String getSignatureLook(){
        return signatureLook;
    }

    public String getvideoTheme(){
        return videoTheme;
    }

    public String getBestLine(){
        return bestLine;
    }

    public int getFierceness(){
        return fierceness;
    } 

    public boolean getFormation(){
        return formation;
    } 
    
    public int getDancers() {
        return dancers;
    }

    public String toString(){
       return String.format("Title: %s", title);
    }
    
}