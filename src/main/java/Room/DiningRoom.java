package Room;

public class DiningRoom {

    private String name;
    private Allergen allergen;

    public DiningRoom(String name, Allergen allergen) {

        this.name = name;
        this.allergen = allergen;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Allergen getAllergen() {
        return allergen;
    }
}
