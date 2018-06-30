package Room;

import Hotel.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {

    private String name;
    private Allergen allergen;


    public DiningRoom(int capacity, String name, Allergen allergen) {
        super(capacity);
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

    public void checkInGuests(ArrayList<Guest> guestsToCheckIn) {
        if (guestsToCheckIn.size() <= getCapacity()) {

            for (Guest guest : guestsToCheckIn) {

                if (allergen == guest.getAllergies())
                    System.out.println("Please watch out for allergens: " + allergen);

                guestsIn.add(guest);
            }

        } else
            System.out.println("SEATING INSIDE IS NOT ENOUGH FOR A GROUP OF "+guestsToCheckIn.size()+" PLEASE CHOOSE ANOTHER DINING ROOM");
    }
}
