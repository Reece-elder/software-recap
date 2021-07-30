Forging a Sword out of a sword mould

public class Sword {

    private int length;
    private String style;
    private boolean hilt

    // Constructor of the Sword class within
    // Called the same thing as the class, but called as a method NO RETURN
    public Sword(){
        this.flavour = "Battenburg";
        this.colour = "Pink";
    }

    // Constructors can take in paramaters to allow customisable objects
    public Cake(String flavour, String colour) {
        this.flavour = flavour;
        this.colour = colour;
    }
}

// Main method
public static void main(String[] args) {
    // Object of type/class Cake called bestCake = new Object with certain strings passed in
    Cake bestCake = new Cake("Marzipan", "Pink");
    syso(bestCake.flavour);
}