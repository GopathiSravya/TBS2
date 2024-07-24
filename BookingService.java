import java.util.ArrayList;
import java.util.List;

public class BookingService {
    public List<Booking>bookings=new ArrayList<>();
    public void addBooking(Booking booking){
        bookings.add(booking);
        System.out.println("bboking added"+booking);
    }
    public List<Booking>getAllBookings(){
        return bookings;
    }
}