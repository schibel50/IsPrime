package edu.up.cs371.primetester;

/**
 * Created by vegdahl on 7/17/2015.
 *
 * The purpose of this class is to define a static method, isPrime, that determines whether an
 * integer is a prime number.
 */
public class PrimeTester {
    /**
     * Tells whether an integer is prime.
     *
     * @param n the number to test
     * @return true iff n is prime
     */
    static boolean isPrime(long n) {
        // for now, return a random result
        long number = 2;
        if (n == 0 || n == 1) {
            return false;
        }
        while (number < n - 1) {
           // Log.i("isPrime",""+k)
            if (n % number == 0) {
                return false;
            }
            number = number + 1;
        }
        return true;
    }
}
