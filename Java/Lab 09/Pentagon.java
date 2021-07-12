//Written by: Francisco Valadez
//Assignment: Lab 09 - Pg. 234 - #6.1
//Class: CS 113
//Date: 5/17/2021
//Description: This program prints the first 100 pentagonal numbers

public class Pentagon 
{
    public static int getPentagonalNumber(int n)
    {
        return (n * (3*n - 1))/ 2;
    }

    public static void main(String[] args)
    {
        System.out.println("This program displays the first 100 pentagonal numbers");
        for(int i = 1; i < 101; i++)
        {
            System.out.print(getPentagonalNumber(i) + " ");
            if(i%10 == 0)
                System.out.println();
        }
    } 
    
}
