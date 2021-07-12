//Written by: Francisco Valadez
//Assignment: Lab 12 - Pg. 150 - #4.19
//Class: CS 113
//Date: 5/29/2021
//Description: This program prompts the user for the first 9 ISBN numbers and puts it into a String 
//             in order to produce an ISBN-10 number

import java.util.Scanner;

public class Checksum 
{
 public static void main(String[] args)
 {
    int check, input;
    String input2 = "";

    //Welcome message
    Scanner scan = new Scanner(System.in);
    System.out.println("This program diplays the 10 digit ISBN");
    System.out.println("Enter the first 9 digits of an ISBN as integer: ");
    input2 = scan.next();//gets the string

    input = Integer.parseInt(input2);//converts the string to an integer
    
    //The checksum formula
    check = ((input / 100000000) * 1 + (input / 10000000) % 10 * 2 + 
    (input / 1000000) % 10 * 3 + (input / 100000) % 10 * 4 + (input / 10000) % 10 * 5 + 
    (input / 1000) % 10 * 6 + (input / 100) % 10 * 7 + (input / 10) % 10 * 8 +
    input % 10 * 9) % 11;
    
    //System.out.println(check);//prints the checksum value

    if (check == 10)
        System.out.print("The ISBN-10 number is " + input + "X");
    else
        System.out.println("The ISBN-10 number is " + input + "" + check);

 }   
}
