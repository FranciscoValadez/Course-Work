import java.util.Scanner;

public class GFG
{
    // Java recursive function to solve tower of hanoi puzzle
    static void towerOfHanoi(int n, char tower1, char tower3, char tower2)
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  tower1 + " to rod " + tower3);
            return;
        }
        towerOfHanoi(n-1, tower1, tower2, tower3);
        System.out.println("Move disk " + n + " from rod " +  tower1 + " to rod " + tower3);
        towerOfHanoi(n-1, tower2, tower3, tower1);
    }
      
    //  Driver method
    public static void main(String args[])
    {
        int n = 3; // Number of disks
        towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods
    }
}