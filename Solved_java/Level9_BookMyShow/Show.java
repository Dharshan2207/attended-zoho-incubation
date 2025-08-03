package Level9_BookMyShow;

public class Show {
    private String showTime;
    private String movieName;
    Movie movie;
    Theatre theatre;

    private int totalTickets;
    private int availableTickets;
    private int bookedCount = 0;


    public Show(String showTime, String movieName, int totalTickets, Movie m, Theatre t) {
        this.showTime = showTime;
        this.movieName = movieName;
        this.totalTickets = totalTickets;
        this.movie = m;
        this.theatre = t;
        System.out.println("New show created");
        System.out.println();
    }



    public boolean seatsAvailable(){
        if(availableTickets > bookedCount){
            return true;
        }
        return false;
    }

    public void displayShowDetails(){
        System.out.println("Movie name : " + movieName);
        System.out.println("Show time : " + showTime);
        System.out.println("Available tickets : " + (totalTickets - bookedCount));
        System.out.println();
    }



    public String getShowTime() {
        return this.showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public String getMovieName() {
        return this.movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getTotalTickets() {
        return this.totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public int getAvailableTickets() {
        return this.availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public int getBookedCount() {
        return this.bookedCount;
    }

    public void setBookedCount(int bookedCount) {
        this.bookedCount = bookedCount;
    }


}
