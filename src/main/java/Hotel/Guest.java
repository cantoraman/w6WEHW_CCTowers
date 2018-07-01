package Hotel;

import Room.Allergen;

public class Guest {

    private String name;
    private Allergen allergies;
    private int roomNumber;

    public Guest(String name, Allergen allergies) {

        this.name = name;
        this.allergies = allergies;

    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public Allergen getAllergies() {
        return this.allergies;
    }

    public String getName() {
        return name;
    }
}
