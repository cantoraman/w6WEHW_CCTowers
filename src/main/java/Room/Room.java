package Room;

import Hotel.Guest;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    protected ArrayList<Guest> guestsIn;

    public Room(int capacity) {
        this.capacity = capacity;
        guestsIn = new ArrayList<>();
    }


    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getGuestsIn(){
        return guestsIn;
    }

    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }


    public int getCheckedInCapacity() {
        return guestsIn.size();
    }

    public void checkOutGuestByName(Guest guest) {

        if (guestsIn.contains(guest)) {
           guestsIn.remove(guest);
        }

    }

    public ArrayList<Guest> checkOutAllGuests() {

        ArrayList<Guest> checkingOut = new ArrayList<>();

        for(int i = guestsIn.size(); i > 0; i--){
            checkingOut.add(guestsIn.get(i-1));
            guestsIn.remove(i-1);
        }

        return checkingOut;
    }


}
