import Room.*;
import org.junit.Before;
import org.junit.Test;
import Hotel.*;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    ArrayList<Bedroom> bedrooms;
    ArrayList<ConferenceRoom> conferenceRooms;
    ArrayList<DiningRoom> diningRooms;

    Bedroom bedroom1;
    Bedroom bedroom2;
    Bedroom bedroom3;

    ConferenceRoom conferenceRoom1;
    ConferenceRoom conferenceRoom2;

    DiningRoom diningRoom1;
    DiningRoom diningRoom2;

    @Before
    public void setup(){
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        bedroom1=new Bedroom(1, 101, false, RoomType.Single, 30);
        bedroom2=new Bedroom(1, 102, false, RoomType.Double, 30);
        bedroom3=new Bedroom(1, 103, false, RoomType.Suite, 30);
        Collections.addAll(bedrooms, bedroom1, bedroom2, bedroom3);
        conferenceRoom1 = new ConferenceRoom(20,"Savoy Court", 100);
        conferenceRoom2 = new ConferenceRoom(10,"Starlight", 100);
        Collections.addAll(conferenceRooms, conferenceRoom1,conferenceRoom2);
        diningRoom1 = new DiningRoom(10, "Ocean Front", Allergen.Shellfish);
        diningRoom2 = new DiningRoom(5 , "Maison Blanc", Allergen.Dairy);
        Collections.addAll(diningRooms, diningRoom1,diningRoom2);
        hotel = new Hotel (bedrooms, conferenceRooms, diningRooms);
    }

    @Test
    public void hasBedrooms(){
        assertEquals(3, hotel.getBedroomCount());
    }


}
