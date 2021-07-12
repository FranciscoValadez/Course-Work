//    Author:       Francisco Valadez
//    Date:         5/28/2021
//    Purpose:      This program is a array based stack and queue game!

import java.util.Scanner;

public class Queue_Game
{
    public static String[] stackArray = new String[30];
    public static String[] queueArray = new String[30];
    public static int linecounter = 1;
    
    //this function removes elements from the queue array
    public static void pop()
    {
        int counter = 0;
        for(int i = 0; i < stackArray.length; ++i)
        {
            if(stackArray[i] == null)
                ++counter;
        }

        //checks if queue is empty and if not then removes the elements
        if(counter == stackArray.length)
        {
            System.out.println("** The Stack is empty!");
        }
        else
        {
            for(int i = stackArray.length - 1; i >= 0; --i)
            {
                if(stackArray[i] != null)
                {
                    System.out.println(stackArray[i]);
                    stackArray[i] = null;
                    break;
                }
            }
        }
    }

    //this function adds elemets to the queue array
    public static void push(String num)
    {        
        
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < stackArray.length; i++)
        {
            if(stackArray[i] == null)
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
            for(int i = 0; i < stackArray.length; i++)
            {
                if(stackArray[i] == null)
                {
                    stackArray[i] = num;
                    break; //breaks after filling the elemt to null or else it will overwrite the other elements!
                }
            }
        }
    }

    //This function prints out the stack
    public static void showStack()
    {
        String stackReverse = "";
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < stackArray.length; i++)
        {
            if(stackArray[i] == null)
                ++counter;
        }

        if(counter == stackArray.length)
        {
            System.out.println("** The Stack is empty!");
        }
        else
        {
            //This for loops goes through the whole array in order to find the elemts that arent null
            for(int i = stackArray.length -1 ; i >= 0; --i)
            {
                if(stackArray[i] != null)
                {
                    stackReverse += " " + stackArray[i];
                }
            }
            System.out.println(stackReverse);
        }
    }

    //This function prints out the queue
    public static void showQueue()
    {
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < queueArray.length; i++)
        {
            if(queueArray[i] == null)
                ++counter;
        }

        if(counter == queueArray.length)
        {
            System.out.println("** The queue is empty!");
        }
        else
        {
            //This for loops goes through the w hole array in order to find the elemts that arent null
            for(int i = 0; i < stackArray.length; ++i)
            {
                if(queueArray[i] != null)
                {
                    System.out.print(queueArray[i] + " ");;
                }
            }
            System.out.println();
        }
    }
    
    //this function adds elemets to the queue array
    public static void enq(String num)
    {        
        
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < queueArray.length; i++)
        {
            if(queueArray[i] == null)
                ++counter;
        }

        //if there are 0 null elemets left then the array is full!
        if(counter == 0)
        {
            System.out.println("** The queue is full!");
        }
        else
        {
            //This for loop goes through the array in order to find the number bieng removed then sets it to null
            for(int i = 0; i < queueArray.length; i++)
            {
                if(queueArray[i] == null)
                {
                    queueArray[i] = num;
                    break; //breaks after filling the elemt to null or else it will overwrite the other elements!
                }
            }
        }
    }

    public static void deq()
    {
        int counter = 0;
        for(int i = 0; i < queueArray.length; ++i)
        {
            if(queueArray[i] == null)
                ++counter;
        }

        //checks if queue is empty and if not then removes the elements
        if(counter == queueArray.length)
        {
            System.out.println("** The queue is empty!");
        }
        else
        {
            for(int i = 0; i < queueArray.length; i++)
            {
                if(queueArray[i] != null)
                {
                    System.out.println(queueArray[i]);
                    queueArray[i] = null;
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        //stackArray[0] = "5";
        
        String command = "", num = "";
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
                        num = input.next();
                        push(num);
                        break;
                    }
                case "pop":
                    {
                        pop();
                        break;
                    }
                
                case "showstack":
                    {
                        showStack();
                        ++linecounter;
                        System.out.println(linecounter + "============================================");
                        break;
                    }
                    case "enq":
                    {
                        num = input.next();
                        enq(num);
                        break;
                    }
                    case "deq":
                    {
                        deq();
                        break;
                    }
                    case "showqueue":
                    {
                        showQueue();
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
