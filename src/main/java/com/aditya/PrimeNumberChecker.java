/*
 * Author Name: Aditya Chaurasia
 * Date: 05-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
         // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Create an object of PrimeNumberChecker class
        PrimeNumberChecker primeNumberChecker = new PrimeNumberChecker();

        // prompt the user to enter a number
        System.out.println("Enter a number to check if it is prime or not: ");

        // store the number entered by the user in a variable
        int num = sc.nextInt();

        // call the checkPrime method of PrimeNumberChecker class
        if (primeNumberChecker.isPrime(num)) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
    /**
     * This method checks if the given number is prime.
     *
     * @param number the number to check.
     * @return true if the number is prime, false otherwise.
     */
    public boolean isPrime(int number) {
        if(number>1){
            int counter = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    counter = 1;
                    break;
                }
            }
            return counter == 0;
        }
        else return false;
    }
}