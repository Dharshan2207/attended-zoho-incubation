package Level9_BookMyShow;

import java.util.ArrayList;


public class BookingSystem {
    
    ArrayList<Movie> movies = new ArrayList<>();
    ArrayList<Theatre> theatres = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    private int moviesCount = 0;
    private int theatreCount = 0;
    private int usersCount = 0;
    private int bookingsCount = 0;
    



    public void addMovie(Movie m){
        if(moviesCount < 10){
            movies.add(m);
            moviesCount++;
            String movieIdGenerator = "MOVIE" + (moviesCount);
            m.setMovieId(movieIdGenerator);
            System.out.println(m.getMovieName() + " addedd successsfully.");
        }
        else{
            System.out.println("maximum movies reached. ");
        }
    }

    public void addTheatre(Theatre t){
        if(theatreCount < 10){
            theatres.add(t);
            theatreCount++;
            String theatreIdGenerator = "THEATRE" + (theatreCount);
            t.setTheatreId(theatreIdGenerator);
            System.out.println(t.getTheatreName() + " addedd successsfully.");
        }
        else{
            System.out.println("maximum movies reached. ");
        }
    }

    public void addUser(User u){
        users.add(u);
        usersCount++;
        String userIdGenerator = "USER" + (usersCount);
        u.setUserId(userIdGenerator);
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
        bookingsCount++;
        String bookingId = "BOOKING" + (bookingsCount);
        booking.setBookingId(bookingId);
    }

    public int searchMovie(String movieName){
        int index = -1;
        for (Movie movie : movies) {
            if(movie.getMovieName().toLowerCase().equals(movieName.toLowerCase())){
                index = movies.indexOf(movie);
            }
            
        }
        return index;
    }

    public int searchTheatre(String theatreName){
        int index = -1;
        for (Theatre theatre : theatres) {
            if(theatre.getTheatreName().toLowerCase().equals(theatreName.toLowerCase())){
                index = theatres.indexOf(theatre);
            }
            
        }
        return index;
    }

    public int searchUser(String userName){
        int index = -1;
        for (User user : users) {
            if(user.getUserName().toLowerCase().equals(userName.toLowerCase())){
                index = users.indexOf(user);
            }
            
        }
        return index;
    }

    public void displayAllTheatresInBMS(){
        for(Theatre theatre : theatres){
            theatre.displayTheatreDetails();
        }
    }

    public void displayAllMoviesInBMS(){
        for(Movie movie : movies){
            movie.displayMovieDetails();
        }
    }

    public void displayAllBookings(){
        for(Booking booking : bookings){
            booking.displayBookingDetails();;
        }
    }

}
