//Written by: Francisco Valadez
//Assignment: Lab 05 - Pg. 109 - #3.4
//Class: CS 113
//Date: 5/4/2021
//Description: This program displays a random month


public class Month
{
    public static void main(String[] args)
    {
        int randommonth, num1, num2; 
         
        System.out.println("This program randomly generates a month:");
         
        do
        {
           num1 = (int)(Math.random() * 10);
           num2 = (int)(Math.random() * 10);
           
           randommonth = num1 + num2;
         }while(randommonth > 12);
                
        switch (randommonth)
          {
              case 0: 
                  System.out.println("January");
                  break;
              case 1: 
                  System.out.println("Febuary");
                  break;
              case 2: 
                  System.out.println("March");
                  break;
              case 3: 
                  System.out.println("April");
                  break;
              case 4: 
                  System.out.println("May");
                  break;
              case 5: 
                  System.out.println("June");
                  break;
              case 6: 
                  System.out.println("July");
                  break;
              case 7: 
                  System.out.println("August");
                  break;
              case 8: 
                  System.out.println("September");
                  break;
              case 9: 
                  System.out.println("October");
                  break;
              case 10: 
                  System.out.println("November");
                  break;
              case 11: 
                  System.out.println("December");
                  break;
           }
    }
}