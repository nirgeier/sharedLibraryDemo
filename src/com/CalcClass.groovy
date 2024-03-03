#!/usr/bin/env groovy

### Shared library function that implemt a basic calculator
### The "call" function contains the main logic of the shared library 

### Package name
package com.codewizard

### Class Declaration
Class SimpleCalc{

    # Simple add function
    def add(int numA, int numB) {
        echo numA, numB
        return numA + numB
    }    
}
