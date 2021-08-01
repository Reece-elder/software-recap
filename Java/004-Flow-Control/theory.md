# Flow of Control 

Order in which code is executed by Java within an application
Java is a compiled language meaning all code is compiled so the entire code *should* work before anything is outputted

## Main

Code execution begins in the *main* method, if you get error

`main method not found` your main method doesnt exist OR not declared correctly

public static void main(String[] args){ 

}

## Flow of Control

Main takes priority, top down FROM main to the end of the app. Jumping between methods if need be

Exercise - Create 3 methods that each return different strings, make your main method system print the returns of those methods in a different order than chronological

## Java Call Stack

Call stack used to keep track of method calls, if a method is called BEFORE the current method finishes it is pushed to the top of the stack
Last-in First-Out

## Scope

Exercise

Do the 'Results' Exercise in the exercise book