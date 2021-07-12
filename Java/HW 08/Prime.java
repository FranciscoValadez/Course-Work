//Written by: Francisco Valadez
//Assignment: HW 08 - Pg. 194 - #5.20
//Class: CS 113
//Date: 5/19/2021
//Description: This program prints all the prime numbers between 2 and 1000
//             with 8 numbers max on each line

public class Prime 
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_PRIMES = 1000;
        final int NUMBER_OF_PRIMES_PER_LINE = 8;
        int count = 0; // Count the number of prime numbers
        int count2 = 0;
        int number = 2; // A number to be tested for primeness
        System.out.println("The prime numbers between 2 and 1000 are:\n");

        // Repeatedly find prime numbers
        while (count < NUMBER_OF_PRIMES) 
        {
            // Assume the number is prime
            boolean isPrime = true; // Is the current number prime?
            
            // Test whether number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) 
            {
                if (number % divisor == 0) 
                { // If true, number is not prime
                    isPrime = false; // Set isPrime to false
                    break; // Exit the for loop
                }
            }

            // Display the prime number and increase the count
            if (isPrime) 
            {
                if (count2 < 7)
                {
                    System.out.print(number + " ");
                    count2++;
                }
                else
                {
                    System.out.println (number);
                    count2 = 0;
                }
            }

            number++;
            count++;
        }
    }   
}
