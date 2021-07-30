# Java Naming conventions

PascalCase / UpperCamelCase
camelCase / lowerCamelCase
snake_case
UPPERCASE
lowercase

General rules for ALL
- begins with standard alphabetical OR $ or _
- subesequent characters alphanumeric a-z/0-9
- cannot use reserved word, lots of Java reserved words

## Classes

nouns written in PascalCase

public class NewClass{ }

## Test Classes

should be the same as the class being tested prededed or followed with 'test'

## Methods

should be verbs written in camelCase

public string printMessage(){

}

## Variables

local / instance / class written in camelCase and ideally not start with _ or $
Short but Meaningful, if its not obvious what it is doing it is not named properly 

finalString testNum returnMethod laptopGroup 

## Temp variables

one character variables should be avoided EXCEPT for iteration, indexing etc
i, j, k, m, x for ints

## Constants and Enums 

Constants (never changing) and enums written in UNDERSCORE_SEPERATED_UPPERCASE

static final int WEBSITE_URL = "http://google.com"

## Packages 

packages named in period.seperated.lowercase format

package com.qa.main.test

Top_level_domain_name.organisation_name.project_name.other_naming_conventions