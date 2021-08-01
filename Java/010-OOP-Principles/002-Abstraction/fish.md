// is an abstract class
// Abstract classes cannot be instantiated, cannot make objects from them, but can be inherited from. 
// Abstract classes are like blueprints of a mould, you can't directly use the blueprints to make an object, but use them to create moulds


public abstract class Fish {

    // Abstract methods ONLY exist in abstract classes and contain no body 
    public abstract void noise();

    public void swim() {
        "swimming!"
    };

}