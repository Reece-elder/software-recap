ArrayLists are collection types in Java, using the List interface + an array. 

ArrayLists are resizable, benefit over regular arrays


# Implenting array list

import java.util.arraylist;
import java.util.list;

// Make it public
// Creating a List and specifying what object type will be in the List
// The name of the list (better to make this plural)
// = new ArrayList<>() which is the name of the object, making it resizable
public List<String> pizzas = new ArrayList<>()
ctrl shift o should add imports 

## ArrayList methods

### add ()
pizzas.add("Pepperoni");

### get ()
syso(pizzas.get(2));

### set()
pizzas.set(1, "mushroom");

### remove()
pizzas.remove(1);

### size() - Grabs length of the array
pizzas.size()

### clear()
pizzas.clear();



public List<String> printOutArray() {
    syso(pizzas);
}

## for loops

for (int i = 0; i < pizzas.size(); i++){
    syso(pizzas.get(i));
}

for (String pizza : pizzas){
    syso("Pizza flavour: " + pizza);
}

### Sorting

ArrayList is a `collection` meaning you can use collection methods, such as sort()

Collections.sort(pizzas);

Exercises:
- Convert basic array exercises into array lists
- With the following list of orders, create methods that can do the following (as ArrayList):
    - Add a new order to the orders array
    - Return the name of the order
    - Modify the order (passing in a string)
    - Remove the order from the orders array
    - Add the order to the doneOrders array
    - Prints out the size of the orders and doneOrders array
    - clears either or both of the arrays
    

Small Espresso w/ Chocolate
Large Cold Brew w/ double shot
Medium Cappucino w/ Oat Milk
Medium Flat White 
Large Choc Cookie Frappe w/ sugar free syrup
Small Caramel Iced Latte w/ honeycomb dust
Small Americano
Large Cafe Au Lait w/ extra milk
Medium Strawberry Iced Tea

- Stretch goals create an order object with size, type and extras and pass that in instead of a string



