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


    public void checkGuestToBedroom(ArrayList<Guest> guests, int roomNumber, int nights) {
        for (Bedroom bedroom : bedrooms)
        {
            if(bedroom.getRoomNumber() == roomNumber)
                if (!bedroom.isRoomBooked())
                    if (bedroom.getCapacity()>=guests.size()) {
                        bedroom.checkInGuest(guests, nights);
                    }
                    else
                        System.out.println("Boarding is over capacity of this room. Please choose a larger room.");
            else
                    System.out.println("The room is already booked, please try another room.");

        }

    }

    public int getGuestNumberInBedroom(int roomNumber) {
        for (Bedroom bedroom : bedrooms)
            if(bedroom.getRoomNumber() == roomNumber)
                return bedroom.getCheckedInCapacity();
        return 0;

    }
}
