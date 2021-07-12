//Author:       Francisco Valadez
//Date:         5/26/2021
//Purpose:      This program converts from infix to postfix!

import java.util.Scanner;
import java.util.Stack;

public class Postfix 
{
    //converts User input to post fix
    public static String Convert(String userInput)
    {
        String post = "";
        int counter = 0; //keeps track of spaces

        Stack<Character> items = new Stack<Character>();

        for(int i = 0; i < userInput.length(); i++)
        {
            if((userInput.charAt(i) == '+') || (userInput.charAt(i) == '-') || (userInput.charAt(i) == '*') || (userInput.charAt(i) == '/'))
            {
                while((items.peek() != '(') && (items.isEmpty() == false))
                {
                    post += items.peek();
                    post += " ";
                    items.pop();
                }

                items.add(userInput.charAt(i));
                counter = 0;
            }
            else if((userInput.charAt(i) >= '0') && (userInput.charAt(i) <= '9'))
            {
                post += userInput.charAt(i);
                counter = 0;
            }               
            else if (userInput.charAt(i) == '(')
            {
                items.add(userInput.charAt(i));
            }
            else if (userInput.charAt(i) == ')')
            {
                while(( items.isEmpty() == false) && ( items.peek() != '('))
                {
                    post += items.peek();
                    post += " ";
                    items.pop();
                }

                items.pop();
            }
            else if(userInput.charAt(i) == ' ')
            {
                if(counter < 1)
                {
                    post += " ";
                }
                counter++;
            }
        }
        while(items.isEmpty() == false)
        {
            post += items.peek();
            items.pop();
        }
        return post;
    }

    //Calculates the total
    public static double Total(String userInput)
    {
        String post = Convert(userInput);
        int var1, var2, postTotal = 0;
        
        Stack<Character> items = new Stack<Character>();
        
        for(int i = 0; i < userInput.length(); i++)
        {
            if((userInput.charAt(i) == '+') || (userInput.charAt(i) == '-') || (userInput.charAt(i) == '*') || (userInput.charAt(i) == '/'))
            {
                var1 = (int)items.pop();
                var2 = (int)items.pop();

                if (postTotal == 0)
                {
                    switch (userInput.charAt(i))
                    {
                        case '+':
                            postTotal = var1 + var2; break;
                        case '-':
                            postTotal = var1 - var2; break;
                        case '*':
                            postTotal = var1 * var2; break;
                        case '/':
                            postTotal = var1 / var2; break;
                    }
                }
                else
                {
                    switch (userInput.charAt(i))
                    {
                        case '+':
                            postTotal = postTotal + var2; break;
                        case '-':
                            postTotal = postTotal - var2; break;
                        case '*':
                            postTotal = postTotal * var2; break;
                        case '/':
                            postTotal = postTotal / var2; break;
                    }
                }
                   
            }
            else if ((userInput.charAt(i) >= '0') && (userInput.charAt(i) <= '9'))
            {
                items.add(userInput.charAt(i));
            }
            
                
        }

        return 0;
    }
    public static void main(String[] args)
    {
        int counter = 1;
        double total = 0;

        Scanner input = new Scanner(System.in);
        String userInput = "";
        System.out.println("Welcome to the Postfix Expression Tool of Francisco Valadez!");
        System.out.println(counter + "===============================================");
        System.out.println("Please enter a fully-parenthesized infix expression: ");
        userInput = input.nextLine();

        while (userInput.equals("0") != true)
        {
            counter++;

            System.out.println("Postfix expression: " + Convert(userInput) );
            //total = Total(userInput);
            System.out.println("Final result: " + total);

            System.out.println(counter + "===============================================");
            System.out.println("Please enter a fully-parenthesized infix expression: ");
            userInput = input.nextLine();
        }

        System.out.println(counter + 1 + "===============================================");
        System.out.println("Thank you for using this Postfix Evalutaion Tool of Francisco Valadez!");
        System.out.println(counter + 2 + "===============================================");

    }    
}
