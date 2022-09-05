/*
 * Author Name: Aditya Chaurasia
 * Date: 05-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class PrimeNumberChecker {
    public static void main(String[] args) {

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