//    Author:       Francisco Valadez
//    Date:         5/27/2021
//    Purpose:      This program checks if the string inputted by the user is a palindrome!

import java.util.Scanner;

public class Palindrome 
{
   // reverses the word in order to compare it to the original input
   public static String reverse(String word)
   {
      String reverseNum = "";
   
      for(int i = word.length() - 1; i != -1; i--)
      {
         reverseNum += word.charAt(i);
      }
      
      return reverseNum;
   }
   
   // Return true if number is a palindrome
   public static boolean isPalindrome(String word)
   {
      //sends the number to be reveresed and then is compared to see if its the same
      if (reverse(word).equals(word))
         return true;
      else 
         return false;
   }

   public static void main(String[] args)
   {
      String word;
      int counter = 1;
   
      Scanner input = new Scanner(System.in);
      System.out.println("Welcome to the Palindrome Game of Francisco Valadez!");
      System.out.println(counter + "=====================================");
      System.out.print("Please enter a word (@ to quit) >");
      word = input.next();
   
      while(word.equals("@") != true)
      {
         ++counter;
      
         //sends the user's number to be checked if its a palindrome
         if(isPalindrome(word) == true)
            System.out.println("The word \"" + word + "\" is a palindrome");
         else
            System.out.println("The word \"" + word + "\" is NOT a palindrome");
         
         System.out.println(counter + "=====================================");
         System.out.print("Please enter a word (@ to quit) > ");
         word = input.next();
      }
   
      System.out.println("Thank you for playing this Palindrome game of Francisco Valadez!");
      System.out.println(counter + 1 + "=====================================");
   }    
}
