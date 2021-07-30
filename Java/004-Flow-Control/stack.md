

public static void main(String[] args) {
    syso(firstLayer); // Calls firstlayer 
    // System prints the value
}

public static int firstLayer() { // Called By main
    int total = 5;
    total += secondLayer(3); // Calls secondLayer 
    total += secondLayer(4); // Calls secondLayer
    return total; // Leaves stack
}

public static int secondLayer(Int addNum) { // Called by second layer // Called by second layer again
    int subTotal = 4;
    subTotal += addNum;
    return subTotal; // Leaves stack once // leaves stack 2nd time
}

Exercise - Using `return new Random().nextInt(<max number>)` Create a method stack for doing:
- Rolling 4 six sided dice and getting the total number
- Rolling 3 six sided dice and getting the total, then rolling 2 eight sided dice and adding both totals together
- Roll a 2 sided dice, roll a 3 sided, roll a 4 sided, roll a 5, roll a 6 and add all totals together


