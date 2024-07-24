import java.util.Date;

public class Main {
    public static void main(String[] args) {
        UserService userService=new UserService();
        MovieService movieService=new MovieService();
        BookingService bookingService=new BookingService();
        User user=new User(1,"sravya","s@gmail.com");
        Movie movie=new Movie(1,"JLK","thril");
        movieService.addMovie(movie);
        Booking booking=new Booking(1,1,1,new Date());
        bookingService.addBooking(booking);
        System.out.println(userService.getAllUsers());
        System.out.println(movieService.getAllMovies());
        System.out.println(bookingService.getAllBookings());
    }
}