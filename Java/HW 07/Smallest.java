//Written by: Francisco Valadez
//Assignment: HW05 - Pg. 193 - #5.12
//Class: CS 113
//Date: 5/12/2021
//Description: This program finds the smallest number that is smallest number that is bigger than 1200
//             when used in n^2

public class Smallest 
{
    public static void main(String[] args)
    {
        int num = 0;
        System.out.println("This program finds the smallest integer in n^2 that is greater than 1200");
        //loop that finds the smallest number
        while(Math.pow(num, 2) < 1200)
        {
            num++;
        }
        System.out.println("The smallest number is " + num);
    }
}
