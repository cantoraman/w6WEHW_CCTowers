import Hotel.Guest;
import Room.Allergen;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;
    ArrayList<Guest> guests;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void setup(){
        diningRoom = new DiningRoom("Ocean Front", Allergen.Shellfish);
        diningRoom.setCapacity(25);
        guests = new ArrayList<>();
        guest1= new Guest ("John Doe", Allergen.none);
        guest2= new Guest ("Jane Doe", Allergen.Shellfish);
        guest3= new Guest ("Jane Doe", Allergen.Dairy);
        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);
    }

    @Test
    public void canChangeName(){
        diningRoom.setName("Ocean Side");
        assertEquals("Ocean Side", diningRoom.getName());
    }

    @Test
    public void hasAllergens(){
        assertEquals(Allergen.Shellfish, diningRoom.getAllergen());
    }

    @Test
    public void canCheckInGuest__enoughRoom(){
        diningRoom.checkInGuests(guests);
        assertEquals(3, diningRoom.getCheckedInCapacity());
    }


}
