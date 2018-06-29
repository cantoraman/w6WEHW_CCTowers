package Room;
import Hotel.Guest;

import java.util.ArrayList;

public abstract class Room {

    private int capacity;

    public void room(int capacity) {

        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }

    public abstract void checkInGuest(ArrayList<Guest> guestsToCheckIn);
}
