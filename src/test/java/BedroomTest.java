import Room.Bedroom;
import Room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;


    @Before
    public void setup() {

        bedroom = new Bedroom(4, false, RoomType.Single);

    }


    @Test
    public void canChangeCapacity(){
        bedroom.setCapacity(5);
        assertEquals(5, bedroom.getCapacity());
    }

}
