package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to factor? ");
        int number = scanner.nextInt();
        Factorizer factorizer = new Factorizer(number);
        factorizer.printfactorizationResults();
    }
}