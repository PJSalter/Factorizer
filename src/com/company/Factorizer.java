package com.company;


import java.util.ArrayList;
import java.util.List;

// Creating a Factorizer class that encapsulates the factorization logic.
public class Factorizer {
    private int number;
    private List<Integer> factors;

    // Creating a constructor that initializes the number and factors list.
    public Factorizer(int number) {
        this.number = number;
        this.factors = new ArrayList<>();
        factorize();
    }

    // Created a private method that calculates the factors of the number.
    private void factorize() {
        // Iterate from 1 to the square root of the number to find all factors.
        for (int i = 1; i <= Math.sqrt(number); i++){
            //If i is a factor of number, add it to the factors list.
            if(number % i == 0) {
                factors.add(i);
                // If the quotient of number / i is not i, add it to the factors list as well.
                if(number / i != i){
                    factors.add(number / i);
                }
            }

        }
    }
}
