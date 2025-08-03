package Level9_BookMyShow;

import java.util.ArrayList;

public class Theatre {
    private String theatreName;
    private String location;
    private String theatreId;

    ArrayList<Show> shows = new ArrayList<>();
    int totalShows = 0;


    public Theatre(String theatreName, String location) {
        this.theatreName = theatreName;
        this.location = location;
    }



    public void addShow(Show s){
        shows.add(s);
    
    }

    public void displayTheatreDetails(){
        System.out.println("Theatre name : " + theatreName);
        System.out.println("Theatre id : " + theatreId);
        System.out.println("Location : " + location);
        System.out.println();
    }

    public void displayShowsWhereThisMovieIsPlaying(Movie m){
        for (Show show : shows) {
            if(show.getMovieName().toLowerCase().equals(m.getMovieName())){
                show.displayShowDetails();
            }
        }
    }

    public void displayAvailableShows(){
        for (Show show : shows) {
            show.displayShowDetails();
        }
    }

    public int searchShow(String showTime){
        int index = -1;
        for (Show show : shows) {
            if(show.getShowTime().toLowerCase().equals(showTime.toLowerCase())){
                index = shows.indexOf(show);
            }
        }
        return index;
    }



    public String getTheatreName() {
        return this.theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTheatreId() {
        return this.theatreId;
    }

    public void setTheatreId(String theatreId) {
        this.theatreId = theatreId;
    }

    public int getTotalShows() {
        return this.totalShows;
    }

    public void setTotalShows(int totalShows) {
        this.totalShows = totalShows;
    }



}
