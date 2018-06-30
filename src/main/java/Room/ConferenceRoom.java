package Room;

public class ConferenceRoom extends Room{

    private boolean isbooked;
    private int bookingLength;
    private String roomName;
    private int rate;

    public ConferenceRoom(int capacity, String roomName, int rate){
        super(capacity);
        this.roomName = roomName;
        this.rate = rate;
    }


    public void book(int length) {
        if (isbooked==false){
            isbooked=true;
            bookingLength=length;
        }
        else
        {
            System.out.println("SORRY CONFERENCE ROOM IS BOOKED FOR THE DURATION, PLEASE CHOOSE ANOTHER");
        }
    }

    public int getBookingLength() {
        return this.bookingLength;
    }

    public int getRate() {
        return this.rate;
    }
}

