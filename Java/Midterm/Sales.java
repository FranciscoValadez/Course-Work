//Name:         Francisco Valadez
//Date:         5/20/2021
//Assignment:   Midterm
//Description:  This program calculates the items sold in 4 weeks and their total for those 4 weeks as wells as
//              the weekly average and total for the end of the year

import java.util.Scanner;

public class Sales 
{
    //Checks if the user inputed a negative number and if so returns 0
    public static double check(double num)
    {
        if(num < 0)
            return 0;
        else return num;
    }
    public static void main(String[] args)
    {

        double mask = 13.95, shield = 6.49, gloves = 5.99, sanitizer = 2.85;
        double total = 0, mask_in = 0, shield_in = 0, gloves_in = 0, sanitizer_in = 0;
        String selection = " ";

        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the total number of items sold and the total cost.\n");

        do
        {
            //resets amount of items if looped
            total = 0;
            mask_in = 0;
            shield_in = 0; 
            gloves_in = 0; 
            sanitizer_in = 0;

            for(int i = 1; i <= 4; i++)
            {
                System.out.print("Number of face mask, face shield, gloves and hand sanitizers for week " + i + ": ");
                //grabs items and then sends them to be checked to see if they are less than 0
                mask_in += check(input.nextDouble());
                shield_in += check(input.nextDouble());
                gloves_in += check(input.nextDouble());
                sanitizer_in += check(input.nextDouble());
            }

            System.out.println("\nItems sold after 4 weeks - face masks: " + (int)mask_in + ", face shield: " + 
                                (int)shield_in + ", gloves: " + (int)gloves_in + ", and hand sanitizer: " + (int)sanitizer_in);
            total = mask_in * mask + shield_in * shield + gloves_in * gloves + sanitizer_in * sanitizer;
            System.out.println("Total amount for 4 weeks: $" + ((int)(total*100))/100.0);
            System.out.println("Weekly average amount: $" + total/4);
            System.out.println("Estimated end of the year amount: $" + (total/4)*52);
            System.out.print("\nAnother Calculation? (Enter any key to continue or enter \"Q\" or \"q\" to quit): ");
            selection = input.next();

        }while((selection.equals("Q") != true) && selection.equals("q") != true);

        System.out.println("Goodbye!!\n");

    }
}
