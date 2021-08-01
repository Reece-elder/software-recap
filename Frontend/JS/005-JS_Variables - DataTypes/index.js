// Ways to declare variables

let a = true        // Can change over time
const b = "String"  // Can't change, will always be "String"
var c = 123         // DON'T USE, has global scope by default

// d = 123             // Will work.. but dont do it

let d;              
d = 123;            // Is fine

// Variable name rules

let newVar = "starts with letter";
let _newVar = "starts with _";
let $newVar = "starts with $";

// Best Practice

let camelCase = "camelCaseIsTheBest";

// let else = "wontWork"

// Dynamic Typing
// JS data types are worked out/initialised at run time, and can change, its why let d = 123 is fine


// Data Types
const string = "String";
const number = 123;
const bigNumber = 123456789123456789123456789n;
const bool = true;
const nullExample = null;
const undefExplicit = undefined;
let undef;
const object = {firstName:"Reece", lastName:"Elder"};
const number2 = 1.23;
const array = ["Hawiaan", "Pepperoni", "BBQ Chicken"];

// String concatenation
// Strings can be added to other values

let stringSum = "10 + 10 = ";
let numSum = 10 + 10;
console.log(stringSum + numSum);

let finalSum = stringSum + numSum;
console.log(typeof(finalSum));
console.log(finalSum);

// Template Literals

let myName = "Reece";
let quickString = `Hey ${myName} did you know ${stringSum}${numSum} and that 5 times 5 is ${5*5}? `;
console.log(quickString);