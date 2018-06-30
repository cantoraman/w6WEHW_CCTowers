package Room;

import Hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room {

    private boolean isbooked;
    private int bookingLength;
    private RoomType roomType;
    private int roomNumber;

    public Bedroom(int capacity, int roomNumber, boolean booked, RoomType roomType) {
        super(capacity);
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
        if (guestsToCheckIn.size() <= getCapacity() && isbooked == false) {
            //possible room payment spot
            for (Guest guest : guestsToCheckIn) {
                guest.setRoomNumber(roomNumber);
                guestsIn.add(guest);
            }
            bookingLength = lengthOfStay;
            this.isbooked = true;
        }
        else
            System.out.println("THE ROOM IS FULL, PLEASE CHOOSE ANOTHER ROOM");
    }


    public ArrayList<Guest> checkOutGuests() {
        this.isbooked = false;
        bookingLength = 0;
        ArrayList<Guest> checkingOut = new ArrayList<>();


        for(int i = guestsIn.size(); i > 0; i--){
            guestsIn.get(i-1).setRoomNumber(0);
            checkingOut.add(guestsIn.get(i-1));
            guestsIn.remove(i-1);

        }


         return checkingOut;
    }

    public ArrayList<Guest> getGuestsIn() {
        return guestsIn;
    }
}
