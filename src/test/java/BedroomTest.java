import Hotel.Guest;
import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    ArrayList<Guest> guestsToCheckIn;

    @Before
    public void setup() {
        bedroom = new Bedroom(4, 101, false, RoomType.Single);
        guest= new Guest ("John Doe", "Shellfish");
        guestsToCheckIn= new ArrayList<Guest>();
        guestsToCheckIn.add(guest);
    }


    @Test
    public void canChangeCapacity(){
        bedroom.setCapacity(5);
        assertEquals(5, bedroom.getCapacity());
    }

    @Test
    public void canChangeRoomType(){
        bedroom.setRoomType(RoomType.Suite);
        assertEquals(RoomType.Suite, bedroom.getRoomType());
    }

    @Test
    public void canCheckInGuests(){
       bedroom.checkInGuest(guestsToCheckIn,3);
        assertEquals(1, bedroom.getCheckedInCapacity());
    }


}
