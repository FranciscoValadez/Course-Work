//Written by: Francisco Valadez
//Assignment: Final Projext
//Class: CS 113
//Date: 6/7/2021
//Description: This finds the oldest person and prints how long they have until they reach 100

public class Final_Sp2021 
{
    //This method initializes the array's elemetns and returns the array
    public static String[] getInfo()
    {
        String[] arrayString = {"lisA, 23", "JaMes, 8", "ROBERT, 38", "MAry, 30"};

        return arrayString;
    }

    //This method prints the array's elements
    public static void print(String[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    //This method returns a string data type 
    public static String infoType(String info, int part)
    {
        String value = "";
        if(part == 1)
        {
            for(int i = 0; i < info.length(); i++)
            {
                //returns the 1st word before the comma
                if(info.charAt(i) == ',')
                    return value;
                value += info.charAt(i);    
            }
        }
        else if(part == 2)
        {
            //returns the 2nd word after the space
            for(int i = 0; i < info.length(); i++)
            {
                //returns the 1st word before the comma
                if(info.charAt(i) == ' ')
                {
                    for(int x = i + 1; x < info.length(); x++)
                        value += info.charAt(x);
                    return value;
                }
            }
        }
        return "";
    }

    //This method finds the position in the array of the person with the oldest age
    public static int oldest(String[] array)
    {
        int oldestAge = 0, position = 0;

        for(int i = 0; i < array.length; i++)
        {
            if(Integer.valueOf(infoType(array[i], 2)) > oldestAge)
            {
                oldestAge = Integer.valueOf(infoType(array[i], 2));
                position = i;
            }
        }
        //This is the position in the array of the element that contains the oldest person's info
        return position;
    }

    public static void main(String[] args)
    {
        System.out.println("This program automatically adds my information to a precompiled list then finds the oldest person in that list.");
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("The list:");
        String myInfo = "Francisco, 24";
        String[] list = new String[getInfo().length + 1];

        print(getInfo());// Prtins the original list
        System.out.println(myInfo);//Prints my information

        list = getInfo(); //elements of the previos array are appended to the new array
        list[list.length -1] = myInfo; //adds my information to the new list

        //Prints the results
        System.out.println("------------------------------------------------------------------------------------------------------------------");
        System.out.println("The oldest person in the list is " + infoType(list[oldest(list)], 1) + ". " + infoType(list[oldest(list)], 1)+ " will be 100 in " + (100 - Integer.valueOf(infoType(list[oldest(list)], 2))) + " years.");
    }    
}