//Written by: Francisco Valadez
//Assignment: HW12 - Pg. 150 - #4.16
//Class: CS 113
//Date: 5/31/2021
//Description: This program prints a random letter

public class letter 
{
    public static void main(String[] args)
    {
        int random;
        System.out.println("This program prints a random letter");
        do
        {
            random = (int)(Math.random() * 91);
        }while(random < 65);
        System.out.println("Random letter: " + (char)random);
    }    
}
