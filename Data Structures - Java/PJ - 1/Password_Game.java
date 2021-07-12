//Author:       Francisco Valadez
//Date:         4/22/2021
//Purpose:      This program checks a users password to see if it is secure!

import java.util.Scanner;
public class Password_Game 
{ 
    static String pw; // global variable to hold password for security checking
    static boolean r1,r2,r3,r4,r5,r6,r7; //7 rules’ satisfaction indicators: true | false 
    
    public static void main(String[] args) 
    { // begin of main( ) ----------------------------------------
        int counter = 0;
        
        System.out.println("Welcome to play the Password game designed by Francisco Valadez!");
        
        do
        {
            ++counter;
            System.out.println(counter + "===================================================="); 
            Scanner scan = new Scanner(System.in);
            System.out.print("Please enter a password >");
            pw = scan.nextLine();   // scan to get the password in pw
            
            if(pw.equals("quit"))
            {
                break;
            }
            
            System.out.println("You just entered password \"" + pw + "\"");
            s1(); s2(); s3(); s4();
            s5(); s6(); s7();  // call 7 methods to check all 7 rules for satisfaction 

            if (r1 && r2 && r3 && r4 && r5 && r6 && r7) // all 7 rules are satisfied
            {
                System.out.println("Congratulations! Your passowrd \"" + pw +"\" is very secure!");
            }
            else // insecure password because at least one rule got violated
            {
                System.out.println("The password \"" + pw + "\" violates the following rule(s):");
                if (!r1)
                System.out.println("Rule 1: Length invalid - The length of the password must be 8 to 12 only.");
                if (!r2)
                System.out.println("Rule 2: No Space - The password must not contain any space or blank character.");
                if (!r3)
                System.out.println("Rule 3: At least 2 digits - The password must contain at least 2 digits.");
                if (!r4)
                System.out.println("Rule 4: At least 1 upper-case letter - The password must contain at least one upper-case letter.");
                if (!r5)
                System.out.println("Rule 5: At least 1 lower-case letter - The password must contain at least one lower-case letter.");
                if (!r6)
                System.out.println("Rule 6: At least 1 special character - The password must contain at least one \nspecial character, which can be one of the following 7 choices: '$', '#', '@', '&', '*', '?', '!'");
                if (!r7) 
                System.out.println("Rule 7: No special numbers - The password must not contain any of the following 4 numbers: 2021, 2020, \n2019, or 2018.");
            } // print all the violated rules
        }while(pw != "quit");
        
        System.out.println("Thank you for playing the Password game designed by Francisco Valadez!");
        System.out.println(++counter + "==========================================================================");
        
    } // end of main( )  -------------------------------------------
    
    // The following are 7 static methods to check those 7 rules: 
    static void s1() // checks if the password is between 7 to 12 characters
    { 
        r1=false; /* if (check r1 ok) r1=true; */ 
        if ((pw.length() > 7) && (pw.length() < 13))
        {
            r1 = true;
        }

        //System.out.println("length: "+r1 + " length: " + pw.length());

    }
    static void s2() // Checks if the password has any spaces or blank characters
    { 
        char c;
        int countspace = 0;
        
        r2=true; /* if (check r2 ok) r2=true; */ 
        
        for(int i = 0; i < pw.length(); i++)
        {
            c = pw.charAt(i);
            if (Character.isWhitespace(c)) // c is a digit  
            {   
                ++countspace; // increment countDigits by 1
            }
        }
        
        if ("".equals(pw) || countspace > 0)
            r2 = false;

        //System.out.println("spaces: " +r2 + "\t total: " + countspace);
        
    }
    static void s3() // Checks if the password has at least 2 digits
    { 
        r3=false; /* if (check r3 ok) r3=true; */
        
        int countnum = 0;
        int[] numbers = {'1','2','3','4','5','6','7','8','9','0'};
        
        for(int i = 0; i < pw.length(); i++)
            for(int x = 0; x < numbers.length; x++)
               if (numbers[x] == pw.charAt(i))
               {
                  ++countnum;
               }

        if (countnum > 1)
            r3 = true;
        
        //System.out.println("digits: "+r3 + " countnum: " + countnum);

    }
    static void s4() // Checks if the password has at least 1 upper-case character
    { 
        r4=false; /* if (check r4 ok) r4=true; */
        
        int countUpper = 0;
        char[] letters = {'A','B','C','D','E','F','G','H','I','J','H','I',
                          'J','K','L','M','N','N','O','P','Q','R','S','T','U','V','X','Y','Z'};
        
        for(int i = 0; i < pw.length(); i++)
         for(int x = 0; x < letters.length; x++)
            if (letters[x] == pw.charAt(i))
               countUpper++;
        if (countUpper > 0)
            r4 = true;
        
        //System.out.println("upper: "+r4 + " countUpper: " + countUpper); 
   }
    static void s5() // Checks if the password has at least 1 lower-case letter
    { 
        r5=false; /* if (check r5 ok) r5=true; */
        
        int countLower = 0;
        char[] letters = {'a','b','c','d','e','f','g','h','i',
                          'j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'};
        
        for(int i = 0; i < pw.length(); i++)
         for(int x = 0; x < letters.length; x++)
            if (letters[x] == pw.charAt(i))
               countLower++;
        if (countLower > 0)
            r5 = true;
        
        //System.out.println("lower: "+r5 + " countLower: " + countLower);  
    }
    static void s6() // Checks if the password has at least 1 special character
    { 
        r6=false; /* if (check r6 ok) r6=true; */
        
        int specialAmount = 0;
        char[] special = {'$','#','@','&','*','?','!'};
        
        for(int i = 0; i < pw.length(); i++)
         for(int x = 0; x < special.length; x++)
            if (special[x] == pw.charAt(i))
               specialAmount++;
        if (specialAmount > 0)
         r6 = true;
        
        // System.out.println("special: "+r6 + " specialAmount: " + specialAmount); 
    }
    static void s7() // Checks to make sure that the pasword does not contain '2021', '2020', '2019', '2018'
    { 
        r7=true; /* if (check r7 ok) r7=true; */
        
        //string[] year = {"2021", "2020","2019","2018"};
        
        if (pw.contains("2018") || pw.contains("2019") || pw.contains("2020") || pw.contains("2021"))
            r7 = false;
        
        //System.out.println("year: "+r7);
    }

} // end of class Password
