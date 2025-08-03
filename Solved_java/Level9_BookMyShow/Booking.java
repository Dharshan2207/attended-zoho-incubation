package Level9_BookMyShow;

public class Booking {
    private String viewerName;
    private String bookingId;

    Movie bookedMovie;
    Theatre bookedTheatre;
    User bookedUser;
    Show bookedShow;


    public Booking(Movie m, Theatre t, User u, Show s){
        this.bookedMovie = m;
        this.bookedTheatre = t;
        this.bookedUser = u;
        this.bookedShow = s;
        System.out.println("Booking confirmed");
    }


    public void seeAvailableMovies(User u, BookingSystem system){
        system.displayAllMoviesInBMS();
    }

    public void displayBookingDetails(){
        System.out.println("Viewer name : " + viewerName);
        System.out.println("Movie name : " + bookedMovie.getMovieName());
        System.out.println("Theatre : " + bookedTheatre.getTheatreName());
        System.out.println("Show : " + bookedShow.getShowTime());
        System.out.println();
    }



    public String getViewerName() {
        return this.viewerName;
    }

    public void setViewerName(String viewerName) {
        this.viewerName = viewerName;
    }

    public String getBookingId() {
        return this.bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }


}
