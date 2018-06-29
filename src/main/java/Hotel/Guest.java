package Hotel;

public class Guest {

    private String name;
    private String allergies;
    private int roomNumber;

    public Guest(String name, String allergies) {

        this.name = name;
        this.allergies = allergies;

    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

}
