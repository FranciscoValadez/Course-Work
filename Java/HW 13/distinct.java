//Written by: Francisco Valadez
//Assignment: HW13 - Pg. 278 - #7.3
//Class: CS 113
//Date: 6/3/2021
//Description: This program counts the number of occurences of each number a user inputs

import java.util.Scanner;

public class occurence 
{
    public static void main(String[] args)
    {
        int num, counter = 0;
        int[] numbersArray1 = new int[100];
        Scanner input = new Scanner(System.in);
        System.out.println("This program reads integers and counts their occurance");
        System.out.print("Enter the integers between 1 and 100: ");
        do
        {
            num = input.nextInt();
            numbersArray1[counter] = num; //adds the numbers to the first array
            ++counter;

        }while (num != 0);

        int[] numbersArray = new int[counter - 1]; //This array is for holding only the numbers before 0

        for(int i = 0; i < numbersArray.length; i++)
        {
            numbersArray[i] = numbersArray1[i];
        }

        //searches through the array to find number of times a number occurs
        for(int i = 0; i < numbersArray.length; i++)
        {
            int counter2 = 0;

            for(int x = 0; x < numbersArray.length; x++)
            {
                if(numbersArray[i] == numbersArray[x])
                    ++counter2;
                
            }
            //checks if it happens more than once
            if(counter2 == 1)
                System.out.println( numbersArray[i] + " occurs " + counter2 + " time");
            else
                System.out.println( numbersArray[i] + " occurs " + counter2 + " times");
        }    
    }    
}
