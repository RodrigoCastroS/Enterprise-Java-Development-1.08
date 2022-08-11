package MovieFactory;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Video{

    private ArrayList<String> cinemasDisplayed;
    private ArrayList<String> mainCharacters;
    private Date releasedOn;


    public Movie(String title, String genre, int length,
                 ArrayList<String> cinemasDisplayed,
                 ArrayList<String> mainActors,
                 Date releasedOn) {
        super(title, genre, length);
        this.cinemasDisplayed = cinemasDisplayed;
        this.mainCharacters = mainActors;
        this.releasedOn = releasedOn;
    }

    public ArrayList<String> getCinemasDisplayed() {
        return cinemasDisplayed;
    }

    public void setCinemasDisplayed(ArrayList<String> cinemasDisplayed) {
        this.cinemasDisplayed = cinemasDisplayed;
    }

    public ArrayList<String> getMainCharacters() {
        return mainCharacters;
    }

    public void addNewActor(String actor) {
        // Check if the actor is on the array list
        if(mainCharacters.contains(actor)){ return;}

        this.mainCharacters.add(actor);
    }


    @Override
    public Date dateReleased() {
        return this.releasedOn;
    }
}
