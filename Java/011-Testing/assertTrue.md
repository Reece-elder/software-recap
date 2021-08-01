# Asserts

JUnit tests are `validated` with asserts
One assert method used per test, assert method `should` be the last line

assertEquals(<Message to be displayed upon failure> , <Expected value> , <Actual value>);
assertEquals()

@Test
public void twoPlusTwoIsFour(){
    int sum = 2;
    sum + 2; 
    assertEquals("Expected: 2 + 2 is 4", 4, sum);
}

assert<True|False>(<Message to be displayed upon failure> , <Boolean to be evaluated>);
assertTrue()

@Test
public void boolIsTrue(){
    boolean bool = true;
    assertTrue("Expected: bool is true", bool)
}

Exercise - From Community make tests for the blackjack method

