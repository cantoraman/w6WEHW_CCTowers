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

    public void setCapacity(int newCapacity) {
        this.capacity = newCapacity;
    }


    public int getCheckedInCapacity(){
        return guestsIn.size();
    }


}
