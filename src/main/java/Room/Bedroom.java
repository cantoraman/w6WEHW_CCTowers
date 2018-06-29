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
        if (guestsToCheckIn.size() <= getCapacity() && isbooked == false) {
            //possible room payment spot
            for (Guest guest : guestsToCheckIn) {
                guest.setRoomNumber(roomNumber);
                guestsIn.add(guest);
            }
            bookingLength = lengthOfStay;
            this.isbooked = true;
        }
    }


    public ArrayList<Guest> checkOutGuests() {
        this.isbooked = false;
        bookingLength = 0;
        ArrayList<Guest> checkingout = new ArrayList<>();

//        for (Guest guest : guestsIn){
//            System.out.println(guestsIn.size());
//            System.out.println(guest);
//            guest.setRoomNumber(0);
//
//            checkingout.add(guest);
//            guestsIn.remove(guest);
//
//
//            System.out.println(checkingout);
//        }

        for(int i = 0; i < guestsIn.size(); i++){
            guestsIn.get(i).setRoomNumber(0);
            checkingout.add(guestsIn.get(i));
            guestsIn.remove(i);

        }


         return checkingout;
    }

    public ArrayList<Guest> getGuestsIn() {
        return guestsIn;
    }
}
