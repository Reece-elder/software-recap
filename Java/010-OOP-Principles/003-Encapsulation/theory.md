# Encapsulation

Data (vars) should be bundled together with code that operates on them (methods) rather than allowing `direct access`

By only allowing methods of x class to modify x vars of x class by using private class variables

public class bankDetails {

    public String bankNumber = 1234567890;

}

public class H4CK3R extends bankDetails {

    public void HACKING(){
        syso(super.bankNumber)
    }

}

Issues:
- Less control over vars and methods that use them
- Classes which don't need to use will still see them
- Classes in same package have full access to vars, including read and write


## Getters and setters

// Create getters and setters shift alt s AND make vars private

Classes can be read only by only allowing getters and likewise with setters

## Benefits of setters

private int favNumber = 5;

Allows validation of getters and setters

public void setFavNumber(int number) {
    if (number < 1 || number > 10) {
        syso "cant set number"
    } else {
        this.number = number; 
    }
}

Exercise
Create a Person class with the following traits
- Age
- Name
- Favourite Colour
- Favourite String

Make the vars private 
