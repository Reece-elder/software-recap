# Data-types

int myNum
float myFloatNum
char myLetter
boolean myBool
String myText

## Primitive

Primitives are smallest forms of data Java can handle. All other types of data are 'non-primitive', collections of primitive data to create an object

8 Primitive data types
- boolean   - True or False
- byte      - -128 to 127
- char      - single character
- short     - -32768 - 32768
- int       - medium length
- long      - Long length
- float     - decimal number
- double    - large decimal

Why is String not a primitive? 

## Return types

When executing a method a value is sometimes produced, this is the return type
Java, returns = strongly types so it must be explicit

Allowed:

public String stringReturn() {
    return "Hey World!";
}

public int intReturn() {
    return 123;
}

public void noReturn(){
    syso("No return")
}

Not allowed: 

public boolean stringReturn() {
    return "Hey World!";
}

public int intReturn() {
    return 123.45;
}

// Will this work??
public void noReturn(){
    syso("No return")
}
