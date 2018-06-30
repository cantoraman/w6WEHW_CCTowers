import Room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {


    ConferenceRoom conferenceRoom;

    @Before
    public void setup()
    {
        conferenceRoom = new ConferenceRoom( 50,"Savoy Court", 20);

    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void canBook__unbooked(){
        conferenceRoom.book(5);
        assertEquals(5, conferenceRoom.getBookingLength());

    }

    @Test
    public void canBook__booked(){
        conferenceRoom.book(5);
        conferenceRoom.book(8);
        assertEquals(5, conferenceRoom.getBookingLength());

    }

    @Test
    public void hasRate(){
        assertEquals(20, conferenceRoom.getRate());
    }












}
