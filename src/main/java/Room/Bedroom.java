package Room;

public class Bedroom extends Room {

    private boolean isbooked;
    private RoomType roomType;

    public Bedroom(int capacity, boolean booked, RoomType roomType) {
        super();
        this.isbooked = booked;
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public void setRoomType(RoomType newRoomType) {
        this.roomType = newRoomType;
    }
}
