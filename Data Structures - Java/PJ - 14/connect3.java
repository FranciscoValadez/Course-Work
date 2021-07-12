import java.util.Scanner;

public class connect3 
{
    public static Scanner input = new Scanner(System.in);

    public static char[][] gameArray = 
    {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public static void OMove()
    {
        int row, column;
        System.out.print("Enter 2 integers (row and column): ");
        do
        {
            row = input.nextInt();
            column = input.nextInt();
        }while(MoveOK(row, column) == false);
        gameArray[row][column] = 'O';
    } 

    public static boolean MoveOK(int row, int col)
    {
        if(gameArray[row][col] == ' ')
            return true;
        else
            return false;
    }

    public static void StartGame()
    {
        System.out.print("Do you want to play the game? ('Y' or 'N'): ");
        if(!input.next().equals("N"))
        {
            System.out.println("Would you like to move first? ('Y' or 'N'):");
            if(input.next().equals("N"))
                System.out.println("TEST");//XMove();
            else
                OMove();
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome to this tic tac toe game!");
        System.out.println("===========================================");
        StartGame();
        System.out.println("Goodbye!");
    }    
}
