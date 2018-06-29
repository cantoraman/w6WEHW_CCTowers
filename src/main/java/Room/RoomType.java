package Room;

public enum RoomType {
    Single(1),
    Double(2),
    Suite(4);

    private final int value;

    RoomType(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

}
