import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.prefs.BackingStoreException;

public class Queue_Game
{
    public static String[] itemsArray = new String[30];
    public static int linecounter = 1;
    public static String stackOrder = "";

    //This function prints out the stack
    public static void showStack()
    {
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < itemsArray.length; i++)
        {
            if(itemsArray[i] == null)
                ++counter;
        }

        if(counter == itemsArray.length)
        {
            System.out.println("** The stack is empty!");
        }
        else
        {
            System.out.println(stackOrder);
        }
    }

    public static void pop()
    {
        //System.out.println("stackfind: " + stackFind(stackOrder));//tesssssssssssssssssssssssssssssssst
         
        int counter = 0;
        int breakcounter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < itemsArray.length; i++)
        {
            if(itemsArray[i] == null)
                ++counter;
        }

        //checks if the stack is empty if not then it prints thea pops the element
        if(counter == itemsArray.length)
        {
            System.out.println("** The stack is empty!");
        }
        else
        {
            //This for loop goes through the array in order to find the number bieng removed then sets it to null
            for(int i = 0; i < itemsArray.length; i++)
            {
                String check = stackFind();
                if(itemsArray[i].equals(check))
                {
                    itemsArray[i] = null;
                    break;
                }
            }
        }
        for(int i = 0; i < itemsArray.length; ++i)
        {
            System.out.println(i + " : " + itemsArray[i]);
        }
    }
    
    public static void push(String numStack)
    {        
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < itemsArray.length; i++)
        {
            if(itemsArray[i] == null)
                ++counter;
        }

        //if there are 0 null elemets left then the array is full!
        if(counter == 0)
        {
            System.out.println("** The stack is full!");
        }
        else
        {
            //This for loop goes through the array in order to find the number bieng removed then sets it to null
            for(int i = 0; i < itemsArray.length; i++)
            {
                if(itemsArray[i] == null)
                {
                    itemsArray[i] = numStack;
                    break; //breaks after filling the elemt to null or else it will overwrite the other elements!
                }
            }
        }
    }

    public static String stackFind()
    {
        String number = "", stackBackup = "";;

        //This for loop looks through the string and keeps adding the characters at the end until it finds a space
        for(int i = 0; stackOrder.charAt(i) != ' '; i++)
        {
                number += stackOrder.charAt(i);
        }
        System.out.println("number: \'" + number + "\'");
        //this loop removes the deleted numbers from the stackOrder string
        for(int i = number.length() + 1; i < stackOrder.length(); ++i)
        {
            stackBackup += stackOrder.charAt(i);
        }
        stackOrder = stackBackup;

        return number;
    }

    public static void main(String[] args)
    {
        //itemsArray[0] = "5";
        
        String command = "", numStack = "", stackTemp = "", stackTemp2 = "", numQueue = "", queueOrder = "";
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Stack Queue Game World of Francisco Valadez!");
        System.out.println(linecounter + "============================================");
        command = input.next();
        
        while(!command.equals("quit"))
        {
            switch(command)
            {
                case "push":
                    {
                        numStack = input.next();
                        stackOrder = numStack + " " + stackOrder;
                        push(numStack);
                        break;
                    }
                case "pop":
                    {
                        pop();
                        break;
                    }
                case "enq":
                    {
                        numQueue = input.next();
                        break;
                    }
                case "deq":
                    {
                        
                        break;
                    }
                case "showstack":
                    {
                        showStack();
                        ++linecounter;
                        System.out.println(linecounter + "============================================");
                        break;
                    }
                case "showqueue":
                    {
                        ++linecounter;
                        System.out.println(linecounter + "============================================");
                        break;
                    }
                default:
                    System.out.println(command + " is an invalid command.");
            }
            command = input.next();
        }
        
        System.out.println("Thank you for playing the Stack Queue Game designed by Francisco Valadez!");
        System.out.println(linecounter + 1 + "============================================");
    }    
}
