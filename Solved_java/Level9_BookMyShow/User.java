package Level9_BookMyShow;

import java.util.ArrayList;

public class User {
    private String userName;
    private String userId;

    ArrayList<Booking> allBookings = new ArrayList<>();



    public User(String userName) {
        this.userName = userName;
    }




    public void addBookings(Booking booking){
        allBookings.add(booking);
    }

    public void giveRating(Movie m, Booking b, double rating){
        if(this.allBookings.contains(b)){
            m.addRating(rating);
        }
        else{
            System.out.println("You have not booked tickets for " + m.getMovieName());
        }
    }

    public void displayAllBookings(){
        for(Booking booking : allBookings){
            booking.setViewerName(userName);
            booking.displayBookingDetails();
        }
    }


    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    public String getUserId(){
        return this.userId;
    }

    
}
