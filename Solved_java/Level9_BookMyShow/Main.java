package Level9_BookMyShow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookingSystem app = new BookingSystem();

        Scanner sc = new Scanner(System.in);

        while(true){
            String userOrAdmin;
            System.out.println("(User / admin / exit) : ");

            userOrAdmin = sc.next();

            if(userOrAdmin.toLowerCase().equals("user")){

                while(true){
                    int choice;
                    System.out.println("1. Book ticket");
                    System.out.println("2. Give rating");
                    System.out.println("3. Booking details");
                    System.out.println("4. Display theatres");
                    System.out.println("5. Display movies : ");
                    System.out.println("6. Display theatre details");
                    System.out.println("7. Display movie details");
                    System.out.println("8. Display shows");
                    System.out.println("9. Exit");
                    System.out.println();

                    choice = sc.nextInt();

                    if(choice == 1){
                        String userName;
                        System.out.println("Enter your username : ");
                        userName = sc.nextLine();
                        userName = sc.nextLine();

                        User user = new User(userName);
                        app.addUser(user);


                        String movieName;
                        app.displayAllMoviesInBMS();
                        System.out.println("Which movie to watch ? : ");
                        movieName = sc.nextLine();

                        int movieIndex = app.searchMovie(movieName);
                        while(movieIndex == -1){
                            System.out.println("Such movie name not exist");
                            app.displayAllMoviesInBMS();
                            System.out.println("Which movie to watch ? : ");
                            movieName = sc.nextLine();

                            movieIndex = app.searchMovie(movieName);
                        }
                        Movie movie = app.movies.get(movieIndex);


                        String theatreName;
                        app.displayAllTheatresInBMS();
                        System.out.println("Which theatre to watch " + movie.getMovieName() + " : ");
                        theatreName = sc.nextLine();

                        int theatreIndex = app.searchTheatre(theatreName);
                        if(theatreIndex == -1){
                            System.out.println("Such theatre name not exist");
                            continue;
                        }
                        Theatre theatre = app.theatres.get(theatreIndex);
                        theatre.displayShowsWhereThisMovieIsPlaying(movie);

                        String showTime;
                        theatre.displayAvailableShows();
                        System.out.println("Which show : ");
                        showTime = sc.nextLine();

                        int showTimeIndex = theatre.searchShow(showTime);
                        while(showTimeIndex == -1){
                            System.out.println("Such show does not exist");
                            System.out.println("Which show : ");
                            showTime = sc.nextLine();

                            showTimeIndex = theatre.searchShow(showTime);
                        }

                        Show s = theatre.shows.get(showTimeIndex);

                        Booking booking = new Booking(movie, theatre, user, s);

                        app.bookings.add(booking);
                        user.addBookings(booking);

                        
                    }
                    else if(choice == 2){
                        String userName;
                        System.out.println("Enter your username : ");
                        userName = sc.nextLine();
                        userName = sc.nextLine();

                        int userIndex;
                        userIndex = app.searchUser(userName);
                        User u = app.users.get(userIndex);

                        u.displayAllBookings();

                        String movieName;
                        app.displayAllMoviesInBMS();
                        System.out.println("Which movie to give ratings ? : ");
                        movieName = sc.nextLine();

                        int movieIndex = app.searchMovie(movieName);
                        while(movieIndex == -1){
                            System.out.println("Such movie name not exist");
                            app.displayAllMoviesInBMS();
                            System.out.println("Which movie to give ratings ? : ");
                            movieName = sc.nextLine();

                            movieIndex = app.searchMovie(movieName);
                        }
                        Movie m = app.movies.get(movieIndex);

                        double ratings;
                        System.out.println("Enter ratings for " + m.getMovieName());

                        ratings = sc.nextDouble();

                        m.addRating(ratings);

                    }
                    else if(choice == 3){
                        String userName;
                        System.out.println("Enter your username : ");
                        userName = sc.nextLine();
                        userName = sc.nextLine();

                        int userIndex;
                        userIndex = app.searchUser(userName);
                        User u = app.users.get(userIndex);

                        u.displayAllBookings();
                    }
                    else if(choice == 4){
                        app.displayAllTheatresInBMS();
                    }
                    else if(choice == 5){
                        app.displayAllMoviesInBMS();
                    }
                    else if(choice == 6){
                        String theatreName;
                        app.displayAllTheatresInBMS();
                        System.out.println("Which theatre details : ");
                        theatreName = sc.nextLine();
                        theatreName = sc.nextLine();               

                        int theatreIndex = app.searchTheatre(theatreName);
                        while(theatreIndex == -1){
                            System.out.println("Such theatre name not exist");
                            app.displayAllTheatresInBMS();
                            System.out.println("Which theatre details : ");
                            theatreName = sc.nextLine();

                            theatreIndex = app.searchTheatre(theatreName);
                        }
                        Theatre t = app.theatres.get(theatreIndex);
                        t.displayTheatreDetails();
                    }
                    else if(choice == 7){
                        String movieName;
                        app.displayAllMoviesInBMS();
                        System.out.println("Which movie details : ");
                        movieName = sc.nextLine();
                        movieName = sc.nextLine();

                        int movieIndex = app.searchMovie(movieName);
                        while(movieIndex == -1){
                            System.out.println("Such movie name not exist");
                            app.displayAllMoviesInBMS();
                            System.out.println("Which movie details : ");
                            movieName = sc.nextLine();

                            movieIndex = app.searchMovie(movieName);
                        }
                        Movie m = app.movies.get(movieIndex);
                        m.displayMovieDetails();
                    }
                    else if(choice == 8){
                        String theatreName;
                        app.displayAllTheatresInBMS();
                        System.out.println("Enter theatre name to display shows : ");
                        theatreName = sc.nextLine();
                        theatreName = sc.nextLine();

                        int theatreIndex = app.searchTheatre(theatreName);
                        while(theatreIndex == -1){
                            System.out.println("Such theatre name not exist");
                            app.displayAllTheatresInBMS();
                            System.out.println("Enter theatre name to display shows : ");
                            theatreName = sc.nextLine();
                            theatreIndex = app.searchTheatre(theatreName);
                        }
                        Theatre t = app.theatres.get(theatreIndex);
                        t.displayAvailableShows();
                    }
                    else if(choice == 9){
                        break;
                    }
                    else{
                        System.out.println("Enter only available options");
                        
                    }

                    
                }
            }
            else if(userOrAdmin.toLowerCase().equals("admin")){
                int choice;
                    System.out.println("1. Add Movie");
                    System.out.println("2. Add theatre");
                    System.out.println("3. Add Show");
                    System.out.println("4. Exit");
                    System.out.println();

                    

                    choice = sc.nextInt();

                    if(choice == 1){
                        String movieName;
                        String movieLanguage;
                        int movieDuration;

                        System.out.println("Enter movie name : ");
                        movieName = sc.nextLine();
                        movieName = sc.nextLine();

                        System.out.println("Enter language : ");
                        movieLanguage = sc.nextLine();

                        System.out.println("Enter duration : ");
                        movieDuration = sc.nextInt();


                        Movie m = new Movie(movieName, movieLanguage, movieDuration);

                        app.addMovie(m);

                    }
                    else if(choice == 2){
                        String theatreLocation;
                        String theatreName;
                        System.out.println("Enter theatre name : ");
                        theatreName = sc.nextLine();
                        theatreName = sc.nextLine();

                        System.out.print("Enter location : ");
                        theatreLocation = sc.next();


                        Theatre t = new Theatre(theatreName, theatreLocation);

                        app.addTheatre(t);
                    }
                    else if(choice == 3){
                        String theatreName;
                        app.displayAllTheatresInBMS();
                        System.out.println("Enter theatre name to add show : ");
                        theatreName = sc.nextLine();
                        theatreName = sc.nextLine();

                        int theatreIndex = app.searchTheatre(theatreName);
                        while(theatreIndex == -1){
                            System.out.println("Such theatre name not exist");
                            app.displayAllTheatresInBMS();
                            System.out.println("Enter theatre name to add show : ");
                            theatreName = sc.nextLine();
                            theatreIndex = app.searchTheatre(theatreName);

                        }
                            Theatre t = app.theatres.get(theatreIndex);

                            String showTime;
                            String movieName;

                            app.displayAllMoviesInBMS();
                            System.out.println("Which movie to add ? ");

                            movieName = sc.nextLine();

                            int movieIndex = app.searchMovie(movieName);

                            while(movieIndex == -1){
                                System.out.println("Such movie not exist");

                                app.displayAllMoviesInBMS();
                                System.out.println("Which movie to add ? ");

                                movieName = sc.nextLine();

                                movieIndex = app.searchMovie(movieName);
                            }
                            Movie m = app.movies.get(movieIndex);

                            System.out.println("Enter show time : ");
                            showTime = sc.nextLine();

                            Show s = new Show(showTime, movieName, 50, m, t);
                            t.addShow(s);
                    }
                    else if(choice == 4){
                        break;
                    }
                    else{
                        System.out.println("Enter only available options");
                        continue;
                    }

            }
            else if(userOrAdmin.toLowerCase().equals("exit")){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Enter only (user / admin / exit)");
                continue;
            }
        }

        sc.close();
    }
}
