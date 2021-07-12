import java.util.*;
import java.util.stream.IntStream;

public class Sorting 
{
    public static int[] randArray = new int[250];
    public static int[] sortedArray = new int[250];
    public static int[] reverseArray = new int[250];
    public static int[] partialArray = new int[250];
    public static int[] almostArray = new int[250];

    public static void sortedFunc() //This function fills a fully sorted array
    {
        for(int i = 0; i < sortedArray.length; i++)
        {
            sortedArray[i] = i;
        }
    }

    public static void reverseFunc() //This function fills a fully sorted array in reverse order
    {
        for(int i = 0; i < reverseArray.length; i++)
        {
            reverseArray[i] = reverseArray.length - i - 1;
        }
    }

    public static void randFunc() //This function fills the array randomly without repeating numbers
    {
        HashSet<Integer> used = new HashSet<Integer>();
        for (int i = 0; i < randArray.length; i++) 
        {
            int add = (int)(Math.random() * 251); //this is the int we are adding
            while (used.contains(add)) { //while we have already used the number
                add = (int) (Math.random() * 251); //generate a new one because it's already used
            }
            //by this time, add will be unique
            used.add(add);
            randArray[i] = add;
        }
    }

    public static void partialFunc() //This function is partially sorted from elemets 0 to 100, then unsorted for the rest
    {
        for (int i = 0; i < partialArray.length; i++) 
        {
            if(i < 100)
                partialArray[i] = i;
            else
            {
                int x = (int)(Math.random() * 251);
                do
                {
                    x = (int)(Math.random() * 251);
                }while((find(partialArray, x)));
                partialArray[i] = x;
            }
        }
    }

    public static void almostFunc() //This function is almost sorted from elemts 0 to 200, then unsorted for the rest
    {
        for (int i = 0; i < almostArray.length; i++) 
        {
            if(i < 200)
            almostArray[i] = i;
            else
            {
                int x = (int)(Math.random() * 251);
                do
                {
                    x = (int)(Math.random() * 251);
                }while((find(almostArray, x)));
                almostArray[i] = x;
            }
        }
    }

    public static boolean find(int[] array, int random) //Finds the random number generated in the array;
    {
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == random)
                return true;
        }
        return false;
    }
    
    public static void print(int[] array)//This fucntion prints the array passed to the function
    {
        int counter = 0;
        for(int i = 0; i < array.length; i++)
        {
            counter++;
            System.out.print(array[i] + " ");
                if(counter == 10)
                {
                    System.out.println();
                    counter = 0;
                }
        }
    }

    public static int radix(int[] array)
    {
        int[] radixArray = new int[250];
        radixArray = array;
        int result[] = new int[250];
        int count[] = new int[250];
        Arrays.fill(count, 0);
        int max = 0, counter = 0;
        
        //Gets the arrays max value
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > 0)
                max = array[i];
        }

        for(int i = 1; max / i > 0; i *= 10)
        {
            for (int x = 0; x < array.length; x++)
            {
                count[ (radixArray[x]/i)%10 ]++;
                counter ++;
            }
            for (int x = 1; x < 10; x++)
            {
                count[x] += count[x - 1];
                counter++;
            }
            for (int x = radixArray.length - 1; x >= 0; x--) 
            {
                result[count[ (radixArray[x]/i)%10 ] - 1] = radixArray[x];
                count[ (radixArray[x]/i)%10 ]--;
                counter++;
            }
            for (int x = 0; x < array.length; x++) //rebuilds sorted array
            {
                radixArray[x] = result[x];
                counter++;
            }
            counter++;
        }

        print(radixArray);
        return counter;
    }

    public static int merge(int[] array)
    {
        return 1;
    }

    public static int quick(int[] array)
    {
        return 1;
    }

    public static void main(String[] args)
    {
        //fills the arrays
        sortedFunc();
        reverseFunc();
        randFunc();
        partialFunc();
        almostFunc();

        System.out.println("Welcome to the Sorting Analysis System of Francisco Valadez!\n" + 
                            "1=========================================================\n");
        
        System.out.println("Test Case #\tRadix Sort\tMerge Sort\tQuickSort");
        System.out.println("----------\t----------\t----------\t---------");
        System.out.println("1\t\t\t" + radix(sortedArray) + "\t\t" + merge(sortedArray) + "\t\t" + quick(sortedArray));
        System.out.println("2\t\t\t" + radix(reverseArray) + "\t\t" + merge(reverseArray) + "\t\t" + quick(reverseArray));
        System.out.println("3\t\t\t" + radix(randArray) + "\t\t" + merge(randArray) + "\t\t" + quick(randArray));
        System.out.println("4\t\t\t" + radix(partialArray) + "\t\t" + merge(partialArray) + "\t\t" + quick(partialArray));

        System.out.println("Thank you for using the Sorting Analysis System of Francisco Valadez!\n" + 
                            "2=========================================================\n");
    }
}
