import java.util.Date;

public class Booking {
    public int bookingId;
    public int userId;
    public int movieId;
    public Date bookingDate;

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", userId=" + userId +
                ", movieId=" + movieId +
                ", bookingDate=" + bookingDate +
                '}';
    }

    public Booking(int bookingId, int userId, int movieId, Date bookingDate){
        this.bookingDate=bookingDate;
        this.bookingId=bookingId;
        this.movieId=movieId;
        this.userId=userId;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}