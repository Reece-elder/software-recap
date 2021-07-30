# Operators

Java uses basic operators for arithmetic calculations 

Assign Value    =
Plus            +
Minus           -
Divide          /
Multiply        *
Modulus         %
Increments 1    ++
Decrements 1    --


int num = 5
int result = num * num
syso(result)

## Modulus

Modulus divides one number by another then returns the remainder
Used to workout if something is divisible / even etc

int num1 = 7
int num2 = 3
int result = num1 % num2

## Conditionals

Conditionals allow developers to check values and make decisions based off of answers that check. 
If something is something.. do something.. else do something else.

### If / Else

boolean isKettleOn = true;

if (isKettleOn) {
    syso("Kettle is on")
} else {
    syso ("kettle is off")
}

### Conditional Operators

Is Equal to         ==
Not Equal to        !=
Less than           <
More than           >
Less than or Equal  <=
AND                 &&
OR                  ||

int number = 7

if(number < 7){
    number less than 7
} else if (number == 7){
    number is 7
} else if (number > 7){
    number greater than 7
}

int number = 10;
int string = "red";

if(number > 15 && colour == "red") {
    Greater than 15 and red 
} else {
    els
}

### Switch case

int lyric = "Doe"

switch(lyric) {
    case "doe":
        A deer, A female deer
        break;

    case "ray":
        A drop of golden sun
        break;
    
    case "me":
        A name I call myself
        break;
    
    case "far":
        A long, long way to run
        break;
    
    default:
        i cant sing :(
        break;

} 

Exercises

FizzBuzz Create method(s) which do the following:
- Returns Fizz for multiples of 3
- Returns Buzz for multiples of 5
- Returns FizzBuzz for numbers that are both
- Returns the number for numbers that are neither







