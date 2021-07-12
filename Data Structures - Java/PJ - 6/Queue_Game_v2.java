import java.util.Scanner;

public class Queue_Game_v2 
{
    public static String[] itemsArray = new String[30];
    public static int linecounter = 1;

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
            //This for loops goes through the whole array in order to find the elemts that arent null
            for(int i = 0; i < itemsArray.length; i++)
            {
                if(itemsArray[i] != null)
                {
                    System.out.print(itemsArray[i] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void pop(String stackOrder)
    {
        String numStack = stackFind(stackOrder);
        
        
        //System.out.println("stackfind: " + stackFind(stackOrder));//tesssssssssssssssssssssssssssssssst
        
        
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
            //This for loop goes through the array in order to find the number bieng removed then sets it to null
            for(int i = 0; i < itemsArray.length; i++)
            {
                if(itemsArray[i] != null)
                {
                    if(itemsArray[i].equals(numStack))
                    {
                        System.out.println(itemsArray[i]);
                        itemsArray[i] = null;
                        break; //after the element is found, this breaks out of the loop so that you dont delete earlier elements
                    }
                }
            }
        }
    }
    
    public static void push(String stackOrder, String numStack)
    {
        //System.out.println("stackfind: " + stackFind(stackOrder));//tesssssssssssssssssssssssssssssssst
        
        
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

    public static String stackFind(String stackOrder)
    {
        String number = "", numberReversed = "";
        //This for loop looks through the string and keeps adding the characters at the end until it finds a space
        for(int i = stackOrder.length() - 1; i >=0; --i)
        {
            if(!stackOrder.equals(" "))
            {
                numberReversed += stackOrder.charAt(i);
            }
        }
        //this loop reverses the string
        for(int i = numberReversed.length() - 1; i >= 0; --i)
        {
            //sanitizes the end of the string when it finds a break
            if(numberReversed.charAt(i) == (' '))
                break;
            number += numberReversed.charAt(i); 
        }
        return number;
    }

    public static void main(String[] args)
    {
        //itemsArray[0] = "5";
        
        String command = "", numStack = "", stackOrder = "", numQueue = "", queueOrder = "";
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
                        stackOrder += numStack + " ";
                        push(stackOrder, numStack);
                        break;
                    }
                case "pop":
                    {
                        pop(stackOrder);
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
