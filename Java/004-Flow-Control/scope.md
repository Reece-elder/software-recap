## Class level / instance scope

Variables defined inside a class BUT outside of methods are referable throughout the class

public class HelloWorld{
    
    public static int numberVar = 123

    publis static void firstMethod() {
        syso(numberVar)
    }

}

## Method / Local Scope 

Variables defined inside of a METHOD are *generally* only used in the method
When the method ends all vars declared inside are no longer referenced and not accessible


    publis static void firstMethod() {
        int numberVar = 123
        syso(numberVar)
    }

