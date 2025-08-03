package Level9_BookMyShow;

import java.util.ArrayList;

public class Movie {
    private String movieName;
    private String movieId;
    private String language;
    private int duration;

    ArrayList<Theatre> runningInTheatres = new ArrayList<>();

    private double rating;
    private int ratingsCount = 0;
    

    public Movie(String movieName, String language, int duration) {
        this.movieName = movieName;
        this.language = language;
        this.duration = duration;
        this.rating = 0;
    }

    public void displayMovieDetails(){
        System.out.println("Movie name : " + movieName);
        System.out.println("Movie id : " + movieId);
        System.out.println("Language : " + language);
        System.out.println("Duration : " + duration);
        System.out.println("Ratings : " + rating / ratingsCount);
        System.out.println();
    }

    public void showTheatres(){
        for (Theatre theatre : runningInTheatres) {
            theatre.displayTheatreDetails();
        }
    }

    public void addRating(double rating){
        this.rating += rating;
        ratingsCount++;
    }


    public double getRating(){
        if(ratingsCount == 0){
            return 0;
        }
        return rating / ratingsCount;
    }


    public int searchTheatre(String theatreName){
        int index = -1;
        for (Theatre theatre : runningInTheatres) {
            if(theatre.getTheatreName().toLowerCase().equals(theatreName.toLowerCase())){
                index = runningInTheatres.indexOf(theatre);
            }
        }

        return index;
    }













    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieId() {
        return this.movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    public int getRatingsCount() {
        return this.ratingsCount;
    }




}
