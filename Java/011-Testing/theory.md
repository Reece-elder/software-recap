# Testing

Testing adds quality assurance to products, ensuring that the code always works and no silent errors are occuring when new code is used.

Three categories of testing 
- Functional        - If I push data to a repo, does the data get pushed? 
- Non functional    - If 10,000 people push the data, does it keep working and how well?
- Maintenance       - If new methods have been added, can I still push data to the repo?

JUnit focuses on unit tests Java Unit.. But is very flexible for our use

## How to implement

1) Make the project a maven project
2) Add this dependancy 
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.12</version>
        <scope>test</scope>
    </dependency>

## Annotations

@Test
public void test1(){
    "first test"
}

@Test
public void test2(){
    "second test"
}

@Test
public void test3(){
    "third test"
}

@BeforeClass
public static void setup(){
    "done first"
}

@AfterClass
public static void setup(){
    "done last"
}