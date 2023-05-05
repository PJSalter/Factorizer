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
    // Creating a public method that returns the number of factors.
    public int getNumFactors() {
        return factors.size();
    }
    // Creating a public method that checks if the number is perfect.
    public boolean isPerfect() {
        int sum = 0;
        // Iterate through the factors and add them up.
        for(int factor : factors) {
            sum += factor;
        }
        // If the sum of the factors equals the number,it is then perfect.
        return sum == number;
    }

    // Creating a public method that checks if number is prime.
    public boolean isPrime() {
        // If the number is less than 2, it is not prime.
        if (number < 2) {
            return false;
        }
        // Iterating from 2 to the square root of the number to check for divisors.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        // If no divisors were found, the number is prime.
        return true;
    }
}
