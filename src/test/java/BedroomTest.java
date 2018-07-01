import Hotel.Guest;
import Room.Allergen;
import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;
    Guest guest2;
    ArrayList<Guest> guestsToCheckIn;

    @Before
    public void setup() {
        bedroom = new Bedroom(2,101, false, RoomType.Double, 40);
        guest= new Guest ("John Doe", Allergen.Shellfish);
        guest2= new Guest ("Jane Doe", Allergen.Dairy);
        guestsToCheckIn= new ArrayList<Guest>();
        guestsToCheckIn.add(guest);
        guestsToCheckIn.add(guest2);

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

    @Test
    public void canCheckOutGuests(){
        bedroom.checkInGuest(guestsToCheckIn,3);
        bedroom.checkOutAllGuests();
        assertEquals(0, bedroom.getCheckedInCapacity());
    }

    @Test
    public void hasVariableRate(){
        assertEquals(80, bedroom.getRate());
    }

}
