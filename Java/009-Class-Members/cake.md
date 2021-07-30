# Instanced class members

public class Cake {

    private String flavour // Instanced attribute, only usable by an instance of Cake
    private String colour

    public Cake(String flavour, String colour) { // When the object is created the flavour and colour are unique to this object
        this.flavour = flavour;
        this.colour = colour;
    }

}

// Two seperate objects created out of the same class referncing the same class members
Cake chocCake = new Cake("Choc", "Brown"); 
Cake iceCreamCake = new Cake("Vanilla", "White");

# Static Class members

Static class members are attributes or methods which BELONG to the class NOT the object. 
Static class members are universal across all instances of a class

public class Cake {

    private String flavour

    private static int mouldSize = 5;
    private static int cakesMade = 0;

    public Cake(String flavour, String colour, int mouldSize){
        this.flavour = flavour;
        this.colour = colour;
        this.cakeSize = mouldSize
        numberOfPeople++;
    }

    
}