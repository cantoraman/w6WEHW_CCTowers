import Room.Allergen;
import Room.DiningRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setup(){
        diningRoom = new DiningRoom("Ocean Front", Allergen.Shellfish);
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



}
