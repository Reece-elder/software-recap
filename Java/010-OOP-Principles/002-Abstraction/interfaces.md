# Interfaces

Completely abstract by design, multiple interfaces can be implemented



public interface freshWater {
    public void currentDirection()
    public void isFished();
}

public interface saltWater {
    public void hasBeenDiscovered();
    public void isEaten();
}

// Implements all methods from the interfaces
public class Salmon implements freshWater, saltWater {

    @override
    public void currentDirection(){
        "goes with current"
    };

    @override 
    public void isEaten(){
        "is very tasty"
    }

}

