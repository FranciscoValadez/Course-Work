//Written by: Francisco Valadez
//Assignment: HW05 - Pg. 193 - #5.15
//Class: CS 113
//Date: 5/12/2021
//Description: This program prints all the ascii characters between '!' and '~'

public class Ascii 
{
    public static void main(String[] args)
    {
        int counter = 0;
        
        System.out.println("This program prints all the ascii characters between '!' and '~'\n");
        //loops until all the ascii characters required are printed
        for(int num = 33; num <= 126; num++)  
        { 
            ++counter;
            System.out.print((char)num + " ");
            //once 10 characters are printed in a new line is inserted
            if (counter == 10)
            {
                counter = 0;
                System.out.println();
            }
        }      
    }
}