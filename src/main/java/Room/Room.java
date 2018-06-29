package Room;

public abstract class Room {

private int capacity;

public void room (int capacity){

this.capacity=capacity;

}

public int getCapacity(){
    return capacity;
}

public void setCapacity(int newCapacity){
    this.capacity = newCapacity;
}

}
