//    Author:       Francisco Valadez
//    Date:         6/6/2021
//    Purpose:      This program checks you have a winning sudoku game!

public class sudokuCheck 
{
    //Below are the 4 preloaded games
    public static int S1[][] =
    {
        {1, 2, 3, 4, 5, 6, 7, 8, 9},
        {2, 3, 4, 5, 6, 7, 8, 9, 1},
        {3, 4, 5, 6, 7, 8, 9, 1, 2},
        {4, 5, 6, 7, 8, 9, 1, 2, 3},
        {5, 6, 7, 8, 9, 1, 2, 3, 4},
        {6, 7, 8, 9, 1, 2, 3, 4, 5},
        {7, 8, 9, 1, 2, 3, 4, 5, 6},
        {8, 9, 1, 2, 3, 4, 5, 6, 7},
        {9, 1, 2, 3, 4, 5, 6, 7, 8},
    };

    public static int S2[][] =
    {
        {1, 2, 3, 4, 5, 6, 7, 8, 9},
        {4, 5, 6, 7, 8, 9, 1, 2, 3},
        {7, 8, 9, 1, 2, 3, 4, 5, 6},
        {2, 3, 4, 5, 6, 7, 8, 9, 1},
        {5, 6, 7, 8, 9, 1, 2, 3, 4},
        {8, 9, 1, 2, 3, 4, 5, 6, 7},
        {3, 4, 5, 6, 7, 8, 9, 1, 2},
        {6, 7, 8, 9, 1, 2, 3, 4, 5},
        {9, 1, 2, 3, 4, 5, 6, 7, 8}
    };

    public static int S3[][] =
    {
        {1, 2, 3, 4, 5 ,6 ,7, 8, 2},
        {4, 5, 6, 7, 8 ,9 ,1 ,2 ,3},
        {7, 8, 9, 1, 2, 3, 4, 5, 6},
        {2, 3, 4, 5, 6, 7, 8, 9, 1},
        {5, 6, 7, 8, 9, 1, 2, 3, 4},
        {8, 9, 1, 2, 3, 4, 5, 6, 7},
        {3, 4, 5, 6, 7, 8, 9, 1 ,2},
        {6, 7, 8, 9, 1, 2, 3 ,4 ,5},
        {9, 1, 2, 3, 4, 5, 6, 7, 8}
    };

    public static int S4[][] =
    {
        {1, 2, 3, 4, 5, 6, 7 ,8, 9},
        {4, 5, 6, 7, 8, 9, 1, 2, 3},
        {7, 8, 9, 1, 2, 3, 4, 5, 6},
        {2, 3, 4, 5, 6, 7, 8, 9, 1},
        {5, 6, 7, 8, 9, 1, 2, 3, 4},
        {8, 9, 1, 2, 3, 4, 5, 6, 7},
        {3, 4, 5, 6, 7, 8, 9, 1 ,2},
        {6, 7, 8, 9, 1, 8, 3, 4, 5},
        {9, 1, 2, 3, 4, 5, 6, 7, 8}
    };
    
    //This function prints the array
    public static void print(int[][] array) 
    { 
        for (int x = 0; x < 9; x++)
        {
            for (int y = 0; y < 9; y++)
            {
                System.out.print(array[x][y]);
            }
            System.out.println();
        }
        /* to print the game board 9x9 */ 
    }

    //This function checks the rows and columns
    public static void check(int[][] game)
    {
        int countProblems = 0;
        //if an error is found the error is printed and 
        //the value added to the varialbe countProblems
        for (int row = 0; row <= 8; ++row) 
            countProblems += checkRow(game, row);
        for (int column = 0; column <= 8; ++column) 
            countProblems += checkColumn(game, column);
        for (int square = 0; square <= 8; ++square) 
            countProblems += checkSquare(game, square);
        if (countProblems == 0)
            System.out.println("Congratulations! You won the game!");
    }

    //This function checks the rows for errors
    public static int checkRow(int[][] S, int row)
    {
        boolean counter1 = false;
        boolean counter2 = false;
        boolean counter3 = false;
        boolean counter4 = false;
        boolean counter5 = false;
        boolean counter6 = false;
        boolean counter7 = false;
        boolean counter8 = false;
        boolean counter9 = false;

        for (int x = 0; x < 9; x++)
        {
            
            if (S[row][x] == 1)
            {
                counter1 = true;
            }
            if (S[row][x] == 2)
            {
                counter2 = true;
            }
            if (S[row][x] == 3)
            {
                counter3 = true;
            }
            if (S[row][x] == 4)
            {
                counter4 = true;
            }
            if (S[row][x] == 5)
            {
                counter5 = true;
            }
            if (S[row][x] == 6)
            {
                counter6 = true;
            }
            if (S[row][x] == 7)
            {
                counter7 = true;
            }
            if (S[row][x] == 8)
            {
                counter8 = true;
            }
            if (S[row][x] == 9)
            {
                counter9 = true;
            }
        }
        //Prints an error is something wrong is found
        if ((counter9 == false) || (counter8 == false) || (counter7 == false) || (counter6 == false) || (counter5 == false) || 
            (counter4 == false) || (counter3 == false) || (counter2 == false) || (counter1 == false))
        {
            System.out.print(" Row " + (row+1) + " has a problem. ");
            return 1;
        }
        else 
            return 0;
    }

    //This function checks the columns for errors
    public static int checkColumn(int[][] S, int column) 
    { 
        boolean counter1 = false;
        boolean counter2 = false;
        boolean counter3 = false;
        boolean counter4 = false;
        boolean counter5 = false;
        boolean counter6 = false;
        boolean counter7 = false;
        boolean counter8 = false;
        boolean counter9 = false;

        for (int x = 0; x < 9; x++)
        {
            if (S[x][column] == 1)
            {
                counter1 = true;
            }
            if (S[x][column] == 2)
            {
                counter2 = true;
            }
            if (S[x][column] == 3)
            {
                counter3 = true;
            }
            if (S[x][column] == 4)
            {
                counter4 = true;
            }
            if (S[x][column] == 5)
            {
                counter5 = true;
            }
            if (S[x][column] == 6)
            {
                counter6 = true;
            }
            if (S[x][column] == 7)
            {
                counter7 = true;
            }
            if (S[x][column] == 8)
            {
                counter8 = true;
            }
            if (S[x][column] == 9)
            {
                counter9 = true;
            }
        }
            //checks if any number is missing in the column
            if ((counter9 == false) || (counter8 == false) || (counter7 == false) || (counter6 == false) || (counter5 == false) || 
                (counter4 == false) || (counter3 == false) || (counter2 == false) || (counter1 == false))
            {
                System.out.print(" Column " + (column + 1) + " has a problem. ");
                return 1;
            }
            else
                return 0;
    }

    //This function checks each square for errors
    public static int checkSquare(int[][] S, int square)
    { 
        int num1, num2, num3, num4, num5, num6, num7, num8, num9;
        int errors = 0;
        if (square == 0)
        {
            int[] D = { S[0][0], S[0][1], S[0][2], 
                        S[1][0], S[1][1], S[1][2], 
                        S[2][0], S[2][1], S[2][2]};
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 1 has a problem. ");
                errors += 1;
            }
            //System.out.println("****************** Square one is " << unique9numbers(D));
        }
        if (square == 1)
        {
            int[] D = { S[0][3], S[0][4], S[0][5],
                        S[1][3], S[1][4], S[1][5],
                        S[2][3], S[2][4], S[2][5] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 2 has a problem. ");
                errors += 1;
            }
        }
        if (square == 2)
        {
            int[] D = { S[0][6], S[0][7], S[0][8],
                        S[1][6], S[1][7], S[1][8],
                        S[2][6], S[2][7], S[2][8] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 3 has a problem. ");
                errors += 1;
            }
        }
        if (square == 3)
        {
            int[] D = { S[3][0], S[3][1], S[3][2],
                        S[4][0], S[4][1], S[4][2],
                        S[5][0], S[5][1], S[5][2] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 4 has a problem. \n");
                errors += 1;
            }
        }
        if (square == 4)
        {
            int[] D = { S[3][3], S[3][4], S[3][5],
                        S[4][3], S[4][4], S[4][5],
                        S[5][3], S[5][4], S[5][5] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 5 has a problem. ");
                errors += 1;
            }
        }
        if (square == 5)
        {
            int[] D = { S[3][6], S[3][7], S[3][8],
                        S[4][6], S[4][7], S[4][8],
                        S[5][6], S[5][7], S[5][8] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 6 has a problem. ");
                errors += 1;
            }
        }
        if (square == 6)
        {
            int[] D = { S[6][0], S[6][1], S[6][2],
                        S[7][0], S[7][1], S[7][2],
                        S[8][0], S[8][1], S[8][2] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print("Square 7 has a problem.");
                errors += 1;
            }
        }
        if (square == 7)
        {
            int[] D = { S[6][3], S[6][4], S[6][5],
                        S[7][3], S[7][4], S[7][5],
                        S[8][3], S[8][4], S[8][5] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 8 has a problem. ");
                errors += 1;
            }
        }
        if (square == 8)
        {
            int[] D = { S[6][6], S[6][7], S[6][8],
                        S[7][6], S[7][7], S[7][8],
                        S[8][6], S[8][7], S[8][8] };
            ;
            if (unique9numbers(D) == false)
            {
                System.out.print(" Square 9 has a problem. ");
                errors += 1;
            }
        }
        if (errors == 0)
            return 0;
        else
            return errors;
    }

    //This function checks if each square has 9 unique numbers
    public static boolean unique9numbers(int[] D)
    { 
        boolean squareValid = true;

        boolean counter1 = false;
        boolean counter2 = false;
        boolean counter3 = false;
        boolean counter4 = false;
        boolean counter5 = false;
        boolean counter6 = false;
        boolean counter7 = false;
        boolean counter8 = false;
        boolean counter9 = false;

        for (int x = 0; x < 9; x++)
        {
            if (D[x]== 1)
            {
                counter1 = true;
            }
            if (D[x] == 2)
            {
                counter2 = true;
            }
            if (D[x] == 3)
            {
                counter3 = true;
            }
            if (D[x] == 4)
            {
                counter4 = true;
            }
            if (D[x] == 5)
            {
                counter5 = true;
            }
            if (D[x] == 6)
            {
                counter6 = true;
            }
            if (D[x] == 7)
            {
                counter7 = true;
            }
            if (D[x] == 8)
            {
                counter8 = true;
            }
            if (D[x] == 9)
            {
                counter9 = true;
            }
        }
        
        if ((counter9 == false) || (counter8 == false) || (counter7 == false) || (counter6 == false) || (counter5 == false) ||
            (counter4 == false) || (counter3 == false) || (counter2 == false) || (counter1 == false))
        {
            squareValid = false;
        }
        return squareValid;
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to play the Sudoku game check designed by Francisco Valadez!");
        System.out.println("1===================================================");
        System.out.println("Your game 1 is as follows:");
        print(S1);
        System.out.print("Your game 1: ");
        check(S1);
        System.out.println("\n2===================================================");
        print(S2);
        System.out.println("Your game 2:");
        check(S2);
        System.out.println("3===================================================");
        print(S3);
        System.out.print("Your game 3: ");
        check(S3);
        System.out.println("\n4===================================================");
        print(S4);
        System.out.print("Your game 4: ");
        check(S4);
        System.out.println("\n5===================================================");
        System.out.println("Thank you for playing the Sudoku Game Check of Francisco Valadez!");
        System.out.println("6===================================================");
    }
}
