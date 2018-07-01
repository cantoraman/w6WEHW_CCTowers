package Hotel;


import Room.Bedroom;
import Room.ConferenceRoom;
import Room.DiningRoom;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;

    private ArrayList<Guest> guests;

    public Hotel(ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms, ArrayList<DiningRoom> diningRooms){
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public int getBedroomCount(){
        return bedrooms.size();
    }


    public int getConferenceRoomCount() {
    return conferenceRooms.size();
    }

    public int getDiningRoomCount() {
        return diningRooms.size();
    }


    public void checkGuestsToBedroom(ArrayList<Guest> guests, int roomNumber, int nights) {
        for (Bedroom bedroom : bedrooms)
        {
            if(bedroom.getRoomNumber() == roomNumber)
                        bedroom.checkInGuest(guests, nights);
        }

    }

    public int getGuestNumberInBedroom(int roomNumber) {
        for (Bedroom bedroom : bedrooms)
            if(bedroom.getRoomNumber() == roomNumber)
                return bedroom.getCheckedInCapacity();
        return 0;

    }

    public void checkGuestsToDiningRoom(ArrayList<Guest> guestGroup1, String diningRoomName) {
        for (DiningRoom diningRoom : diningRooms)
        {
            if (diningRoomName == diningRoom.getName())
                diningRoom.checkInGuests(guestGroup1);
        }
    }

    public int getDiningRoomSpace(String diningRoomName) {
        for (DiningRoom diningRoom : diningRooms)
        {
            if (diningRoomName == diningRoom.getName())
                return diningRoom.getCheckedInCapacity();
        }
        return 0;
    }

    public void checkGuestsToConferenceRoom(ArrayList<Guest> guestGroup, String conferenceRoomName) {
        for (ConferenceRoom conferenceRoom : conferenceRooms)
        {
            if (conferenceRoomName  == conferenceRoom.getConferenceRoomName())
                conferenceRoom.checkInGuests(guestGroup);
        }
    }

    public int getGuestNumberInConferenceRoom(String conferenceRoomName) {
        for (ConferenceRoom conferenceRoom : conferenceRooms)
        {
            if (conferenceRoom.getConferenceRoomName()== conferenceRoomName)
                return conferenceRoom.getCheckedInCapacity();
        }
        return 0;
    }

    public void checkGuestsOutFromBedroom(int roomNumber) {
        for (Bedroom bedroom : bedrooms)
            if(bedroom.getRoomNumber() == roomNumber)
                bedroom.checkOutAllGuests();
    }


    public void checkGuestOutFromDiningRoom(String diningRoomName, Guest guest) {
        for (DiningRoom diningRoom : diningRooms) {
            if (diningRoom.getName() == diningRoomName && diningRoom.getGuestsIn().contains(guest))
                diningRoom.checkOutGuestByName(guest);
        }
    }


    public void checkGuestOutFromConferenceRoom(String conferenceRoomName, Guest guest) {
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.getName() == conferenceRoomName && conferenceRoom.getGuestsIn().contains(guest))
                conferenceRoom.checkOutGuestByName(guest);
        }
    }

    public void showGuestList() {

        for (Bedroom bedroom : bedrooms){

            for (Guest guest : bedroom.getGuestsIn())
            {
                System.out.println(guest.getName() + " " + guest.getRoomNumber());
            }
        }
    }

}
