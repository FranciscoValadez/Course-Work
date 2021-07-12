import java.util.Scanner;

public class Compound 
{
    public static void main(String[] args)
    {   double amount, rate, months, total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the savings of an accound");
        System.out.print("Enter the amount: $");
        amount = input.nextDouble();
        System.out.print("Enter the interest rate: ");
        rate = input.nextDouble();
        System.out.print("Enter the number of months: ");
        months = input.nextDouble();

        rate = (rate/100.0)/12.0;

        for(int i = 0; months > i; i++)
        {
            total = (amount + total) * (1 + rate);
        }

        System.out.println("The total savings is $" + total);

    }    
}
