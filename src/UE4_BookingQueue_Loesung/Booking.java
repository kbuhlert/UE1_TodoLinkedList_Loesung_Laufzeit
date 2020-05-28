package UE4_BookingQueue_Loesung;

public class Booking
{
    public final String bookingText;
    public final double amount;

    //*** Konstruktor ***

    public Booking(String bookingText, double amount)
    {
        this.bookingText = bookingText;
        this.amount = amount;
    }

    //*** Getter-Methoden ***

    public String getBookingText()
    {
        return this.bookingText;
    }

    public double getAmount()
    {
        return amount;
    }
}
