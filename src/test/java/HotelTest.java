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

    ArrayList<Guest> guestGroup1;
    ArrayList<Guest> guestGroup2;
    Guest guest1;
    Guest guest2;
    Guest guest3;
    Guest guest4;


    @Before
    public void setup(){
        bedrooms = new ArrayList<>();
        conferenceRooms = new ArrayList<>();
        diningRooms = new ArrayList<>();
        guestGroup1 = new ArrayList<Guest>();
        guestGroup2 = new ArrayList<Guest>();
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
        guest1 = new Guest("John Doe", Allergen.Shellfish);
        guest2 = new Guest("Jane Doe", Allergen.Dairy);
        guest3 = new Guest("Bob Smith", Allergen.Gluten);
        guest4 = new Guest("Sarah Smith", Allergen.none);
        Collections.addAll(guestGroup1, guest1, guest2);
        Collections.addAll(guestGroup2, guest3, guest4);
        hotel = new Hotel (bedrooms, conferenceRooms, diningRooms);


    }

    @Test
    public void hasBedrooms(){
        assertEquals(3, hotel.getBedroomCount());
    }
    @Test
    public void hasConferenceRooms(){
        assertEquals(2, hotel.getConferenceRoomCount());
    }
    @Test
    public void hasDiningRooms(){
        assertEquals(2, hotel.getDiningRoomCount());
    }

    @Test
    public void canCheckInGuests__toAvailableBedrooms(){
        hotel.checkGuestsToBedroom(guestGroup1,102, 3);
        assertEquals(2, hotel.getGuestNumberInBedroom(102));
    }

    @Test
    public void canCheckInGuests__toUnvailableBedrooms() {
        hotel.checkGuestsToBedroom(guestGroup1, 101, 3);
        assertEquals(0, hotel.getGuestNumberInBedroom(101));
    }

    @Test
    public void canCheckInGuests__toAvailableDiningRooms() {
        hotel.checkGuestsToDiningRoom(guestGroup1, "Ocean Front");
        assertEquals(2, hotel.getDiningRoomSpace("Ocean Front"));
    }

    @Test
    public void canCheckInGuests__toUnavailableDiningRooms() {
        diningRoom1.setCapacity(3);
        hotel.checkGuestsToDiningRoom(guestGroup1, "Ocean Front");
        hotel.checkGuestsToDiningRoom(guestGroup2, "Ocean Front");
        assertEquals(2, hotel.getDiningRoomSpace("Ocean Front"));
    }

    @Test
    public void canCheckInGuests__toAvailableConferenceRooms(){
        hotel.checkGuestsToConferenceRoom(guestGroup1, "Savoy Court");
        assertEquals(2, hotel.getGuestNumberInConferenceRoom("Savoy Court"));
    }

    @Test
    public void canCheckInGuests__toUnavailableConferenceRooms(){
        conferenceRoom1.setCapacity(3);
        hotel.checkGuestsToConferenceRoom(guestGroup1, "Savoy Court");
        hotel.checkGuestsToConferenceRoom(guestGroup2, "Savoy Court");
        assertEquals(2, hotel.getGuestNumberInConferenceRoom("Savoy Court"));
    }


    @Test
    public void canCheckOutGuestsFromBedroom(){
        hotel.checkGuestsToBedroom(guestGroup1,102, 3);
        hotel.checkGuestsOutFromBedroom(102);
        assertEquals(0, hotel.getGuestNumberInBedroom(102));
    }

    @Test
    public void canCheckOutGuestsFromDiningRoom(){
        hotel.checkGuestsToDiningRoom(guestGroup1, "Ocean Front");
        hotel.checkGuestsToDiningRoom(guestGroup2, "Ocean Front");
        hotel.checkGuestOutFromDiningRoom("Ocean Front", guest3);
        assertEquals(3, hotel.getDiningRoomSpace("Ocean Front"));
    }

    @Test
    public void canCheckOutGuestsFromConferenceRoom(){
        hotel.checkGuestsToConferenceRoom(guestGroup1, "Savoy Court");
        hotel.checkGuestOutFromConferenceRoom("Savoy Court", guest2);
        assertEquals(1, hotel.getGuestNumberInConferenceRoom("Savoy Court"));
    }


//    @Test
//    public void canCheckInGuests_toRoomsToDiningRoomCheckGuestOutCheckInDiningRoom(){
//        hotel.checkGuestsToBedroom(guestGroup1,102,3);
//        hotel.checkGuestsToDiningRoom(guestGroup1,"Maison Blanc");
//        hotel.checkGuestsToConferenceRoom(guestGroup1, "Savoy Court");
//
//        assertEquals(2, hotel.getGuestNumberInBedroom(102));
//    }

}
