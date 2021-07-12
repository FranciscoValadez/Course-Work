//Written by: Francisco Valadez
//Assignment: HW05 - Pg. 193 - #5.10
//Class: CS 113
//Date: 5/12/2021
//Description: This program prints the numbers between 100 and 100 that are divisible by 5 or 6

public class Division 
{
    public static void main(String[] args)
    {
        int counter = 0;
        System.out.println("This program shows the numbers that are divisible by 5 or 6\n" + 
                           "between the range of 100 to 1000");
        //runs from 100 to 1000
        for(int x = 100; x <= 1000; x++)
        {
            //checks if the remainder is 0
            if ((x % 5 == 0) || (x % 6 == 0))
            {
                //Prints the divisible number
                System.out.print(x + " ");
                ++counter;
                //sets the numbers in a new line after it reaches 10 integers in 1 line
                if (counter == 10)
                {
                    counter = 0;
                    System.out.println();
                }
            }
        }
    }
}
