package Room;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private boolean isbooked;
    private int bookingLength;
    private RoomType roomType;
    private int roomNumber;

    public Bedroom(int roomNumber, boolean booked, RoomType roomType) {
        super();
        this.setCapacity(roomType.getValue());
        this.roomNumber = roomNumber;
        this.isbooked = booked;
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType newRoomType) {
        this.roomType = newRoomType;
    }


    public void checkInGuest(ArrayList<Guest> guestsToCheckIn, int lengthOfStay) {
        if (guestsToCheckIn.size() <= getCapacity() && isbooked==false) {
            //possible room payment spot
            for (Guest guest : guestsToCheckIn) {
                guest.setRoomNumber(roomNumber);
                guestsIn.add(guest);
            }
            bookingLength = lengthOfStay;
            this.isbooked=true;
        }
    }


}
