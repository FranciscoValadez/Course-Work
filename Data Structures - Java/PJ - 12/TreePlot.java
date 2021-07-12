//    Author:       Francisco Valadez
//    Date:         6/7/2021
//    Purpose:      This program prints a binary tree!

public class TreePlot 
{
    public static int[][] T1 = 
    {
        {5, 1, 2},
        {3, 3, 4},
        {7, 5, 6},
        {2, -1, -1},
        {4, -1, -1},
        {6, -1, -1},
        {9, -1, -1}
        
    };

    public static int[][] T2 = 
    {
        {8, 1, 2},
        {4, 3, 4},
        {12, 5, 6},
        {2, 7, 8},
        {6, 9, 10},
        {10, 11, 12},
        {14, 13, 14},
        {1, -1, -1},
        {3, -1, -1},
        {5, -1, -1},
        {7, -1, -1},
        {9, -1, -1},
        {11, -1, -1},
        {13, -1, -1},
        {15, -1, -1}
        
    };
    public static int[][] T3 = 
    {
        {5, 1, 2},
        {3, 3, 4},
        {7, 5, 6},
        {2, 7, -1},
        {4, -1, -1},
        {6, 8, 9},
        {9, -1, -1},
        {1, -1, -1},
        {8, -1, -1},
        {10, -1, -1},
        
    };

    public static void print(int[][] array, int counter)
    {
        System.out.println("Binary tree #" + counter + " has " + array.length + " nodes.");
        System.out.println("Its array dump is as follows: ");
        System.out.println("\nIndex\tData\tLeft-link\tRight-link");
        System.out.println("------\t-----\t---------\t----------");
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(i + "\t" + array[i][0] + "\t" + array[i][1] + "\t\t" + array[i][2]);
        }

        System.out.println("\nThe binary tree is plotted as follows:");
        printTree(array, counter);
    }

    public static void printTree(int[][] array, int counter)
    {
        System.out.println("___________________" + array[0][0] + "____________________");
        System.out.println("_________" + array[1][0] + "__________________" + array[2][0] + "___________");
        System.out.println("_____" + array[3][0] + "_______" + array[4][0] + "__________" + array[5][0] + "_________" + array[6][0] + "_____");
        if(counter == 2)
            System.out.println("___" + array[7][0] + "___" + array[8][0] + "___" + array[9][0] + "___" + array[10][0] + "_____" + array[11][0] + "____" + array[12][0] + "_____" + array[13][0] + "_____" + array[14][0] + "_");
        if(counter == 3)
            System.out.println("___" + array[7][0] + "____________________________" + array[8][0] + "___" + array[9][0] + "__");
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to play this Binary Tree Plot Tool of Francisco Valadez!");
        System.out.println("1========================================================");
        print(T1, 1);
        System.out.println("\n2========================================================");
        print(T2, 2);
        System.out.println("\n3========================================================");
        print(T3, 3);
        System.out.println("\n4========================================================");
        System.out.println("Thank you for using this Binary Tree Plot Tool of Francisco Valadez");
        System.out.println("5========================================================");


    }
}
