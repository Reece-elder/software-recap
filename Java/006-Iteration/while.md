

int housePlants = 0;
boolean tooManyPlants = false;

while(!tooManyPlants) {
    syso("Another plant);
    housePlants++;

    if(housePlants > 30) {
        tooManyPlants = true;
    }
}

syso("too many plants :(")

While loops run the loop WHILE the conditional we've set is true (or in this case is false)
What happens if tooManyPlants = true?