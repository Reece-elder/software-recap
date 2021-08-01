# Single Dimension Array

public int[] numArray;

public int[] numArray = {1,2,3,4,5};

public int[] numArray = new int[5];

# Multi Dimension Array

public int[][] newNumArray;

public int[][] newNumArray = {{1,2},{3,4},{5}}

public int[][] newNumArray = new int[3][2]

# Indexing

Arrays start at index 0, first entry is index 0

syso(numArray[0])
syso(numArray[1])

length does not start at 0, delcaring an array of length 1 means the only index of the array will be point 0

# Assigning Array values

public int[] testArray = new int[4]

testArray[2] = 12

# For each Loops

public String letterList[] = {a,b,c,d,e,f,g,h,i,j};

for(int i : letterList){
    syso("Letter is: " + i);
}

"for every interger i in letterList do this"

Exercise: 

public int numListAsc[] = {1,2,3,4,5,6,7,8,9,};

1) With the above array, use loops and indexing to create a new array which is the squared result of each of the numbers in the original list
2) Create a two dimensional array with each child in the array containing the original number and the squared result
3) Do the same as above but any odd values multiply them by 2
