import java.util.Deque;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import org.w3c.dom.css.Counter;

public class Queue_Gamev3
{
    public static String[] stackArray = new String[30];
    public static String[] deqArray = new String[30];
    public static int linecounter = 1;
    public static String stackOrder = "";
    public static String queueOrder = "";
    
    //this function removes elements from the queue array
    public static void deq(String numQueue, int queueCount)
    {
        int counter = 0;
        for(int i = 0; i < deqArray.length; ++i)
        {
            if(deqArray[i] == null)
                ++counter;
        }

        //checks if queue is empty and if not then removes the elements
        if(counter == deqArray.length)
        {
            System.out.println("** The Queue is empty!");
        }
        else
        {
            for(int i = deqArray.length - 1; i >= 0; --i)
            {
                if(deqArray[i] != null)
                {
                    System.out.println("deleted");
                    deqArray[i] = null;
                    break;
                }
            }
        }
    }

    //this function adds elemets to the queue array
    public static void enq(String numQueue, int queueCount)
    {        
        
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < deqArray.length; i++)
        {
            if(deqArray[i] == null)
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
            for(int i = 0; i < deqArray.length; i++)
            {
                if(deqArray[i] == null)
                {
                    deqArray[i] = numQueue;
                    break; //breaks after filling the elemt to null or else it will overwrite the other elements!
                }
            }
        }
    }

    //This function prints out the queue
    public static void showQueue()
    {
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < deqArray.length; i++)
        {
            if(deqArray[i] == null)
                ++counter;
        }

        if(counter == deqArray.length)
        {
            System.out.println("** The queue is empty!");
        }
        else
        {
            //This for loops goes through the w hole array in order to find the elemts that arent null
            System.out.println("dequeue length: " + deqArray.length );
            for(int i = 0; i < deqArray.length; i++)
            {
                if(deqArray[i] != null)
                {
                    System.out.print(deqArray[i] + " ");
                }
            }
            System.out.println();
        }
    }

    //This function prints out the stack
    public static void showStack()
    {
        int counter = 0;
        //this checks if the array is empty since by default a string array sets the elemts to null
        for(int i = 0; i < stackArray.length; i++)
        {
            if(stackArray[i] == null)
                ++counter;
        }

        if(counter == stackArray.length)
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
        for(int i = 0; i < stackArray.length; i++)
        {
            if(stackArray[i] == null)
                ++counter;
        }

        //checks if the stack is empty if not then it prints thea pops the element
        if(counter == stackArray.length)
        {
            System.out.println("** The stack is empty!");
        }
        else
        {
            //This for loop goes through the array in order to find the number bieng removed then sets it to null
            for(int i = 0; i < stackArray.length; i++)
            {
                String check = stackFind();
                if(stackArray[i].equals(check))
                {
                    stackArray[i] = null;
                    break;
                }
            }
        }
        for(int i = 0; i < stackArray.length; ++i)
        {
            System.out.println(i + " : " + stackArray[i]);
        }
    }
    
    public static void push(String numStack)
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
                    stackArray[i] = numStack;
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
        //stackArray[0] = "5";
        
        String command = "", numStack = "", numQueue = "", queueOrder = "";
        int stackCount = 0, queueCount = 0;
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
                        queueOrder = queueOrder + " " + numQueue;
                        ++queueCount;
                        System.out.println(queueOrder);
                        enq(numQueue, queueCount);
                        
                        break;
                    }
                case "deq":
                    {
                        numQueue = input.next();
                        deq(numQueue, queueCount);
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
