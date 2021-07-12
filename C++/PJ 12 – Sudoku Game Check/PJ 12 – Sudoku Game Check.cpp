// Author:  Francisco Valadez
// Date:    12/14/2020
// Purpose: CS116-PJ12: This is a Sudoku game checker that checks if the given games are winning or if they have errors

#include <iostream>
#include <string>
using namespace std;

//Prototype declaration
void check(int S[9][9]); // check this game for all 9 rows/columns/squares
void show(int S[9][9]); // Prints the gameboard
void checkRow(int S[9][9], int row, int *x); // Checks the row
void checkColumn(int S[9][9], int column, int*x); // Checks the column
void checkSquare(int S[9][9], int square, int *x); // Checks the square
bool unique9numbers(int D[9]); // array D has 9 numbers

int main()
{
    int S1[9][9] =
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

    int S2[9][9] =
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

    int S3[9][9] =
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

    int S4[9][9] =
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

    cout << "============================================================================="<< endl
        << "Welcome to play the Sudoku Game Check of Francisco Valadez!" << endl;
    cout << "\n1===================================================" << endl;
    cout << "Your game 1 is as follows:" << endl;
    show(S1); // to show game board 9x9
    cout << "Your game 1:" << endl;
    check(S1); // to check game for all problems
    cout << "\n2===================================================" << endl;
    show(S2); // to show game board 9x9
    cout << "Your game 2:" << endl;
    check(S2); // to check game for all problems
    cout << "\n3===================================================" << endl;
    show(S3); // to show game board 9x9
    cout << "Your game 3:" << endl;
    check(S3); // to check game for all problems
    cout << "\n4===================================================" << endl;
    show(S4); // to show game board 9x9
    cout << "Your game 4:" << endl;
    check(S4); // to check game for all problems 
    cout << "\n5===================================================" << endl;
    cout << "Thank you for playing the Sudoku Game Check of Francisco Valadez!" << endl;
    cout << "\n6===================================================" << endl;
       
}

void check(int S[9][9]) // check this game for all 9 rows/columns/squares
{
    int countProblems = 0;    // start with 0 for a new game check 
    for (int r = 0; r <= 8; ++r) 
        checkRow(S, r, &countProblems);
    for (int c = 0; c <= 8; ++c) 
        checkColumn(S, c, &countProblems);
    for (int q = 0; q <= 8; ++q) 
        checkSquare(S, q, &countProblems);
    if (countProblems == 0)
        cout << "Congratulations! You won the game!" << endl;
} // END check( ) ===================================.

void show(int S[9][9]) 
{ 
    for (int x = 0; x < 9; x++)
    {
        for (int y = 0; y < 9; y++)
        {
            cout << S[x][y];
        }
        cout << endl;
    }
    /* to print the game board 9x9 */ 
}

void checkRow(int S[9][9], int row, int *x) //checks if the row
{
    int num1 = 1;
    bool counter1 = false;
    int num2 = 2;
    bool counter2 = false;
    int num3 = 3;
    bool counter3 = false;
    int num4 = 4;
    bool counter4 = false;
    int num5 = 5;
    bool counter5 = false;
    int num6 = 6;
    bool counter6 = false;
    int num7 = 7;
    bool counter7 = false;
    int num8 = 8;
    bool counter8 = false;
    int num9 = 9;
    bool counter9 = false;

    //cout << "Row :" << row + 1 << endl;

    for (int x = 0; x < 9; x++)
    {
        

        if (S[row][x] == num1)
        {
            counter1 = true;
        }
        if (S[row][x] == num2)
        {
            counter2 = true;
        }
        if (S[row][x] == num3)
        {
            counter3 = true;
        }
        if (S[row][x] == num4)
        {
            counter4 = true;
        }
        if (S[row][x] == num5)
        {
            counter5 = true;
        }
        if (S[row][x] == num6)
        {
            counter6 = true;
        }
        if (S[row][x] == num7)
        {
            counter7 = true;
        }
        if (S[row][x] == num8)
        {
            counter8 = true;
        }
        if (S[row][x] == num9)
        {
            counter9 = true;
        }

        /* USED FOR DEBUGGING
        cout << "S[" << row << "]" << "[" << x << "] = " << S[row][x] << endl;

        cout << "counter1 = " << counter1 << " counter 2 = " << counter2 << " counter 3 = " << counter3 << endl
            << " counter 4 = " << counter4 << " counter 5 = " << counter5 << " counter 6 = " << counter6 << endl
            << " counter 7 = " << counter7 << " counter 8 = " << counter8 << " counter 9 = " << counter9 << endl;
        */
    }
    //cout << " counter is at " << counter << endl;

    //checks if any number is missing in the column
    if ((counter9 == false) || (counter8 == false) || (counter7 == false) || (counter6 == false) || (counter5 == false) || 
        (counter4 == false) || (counter3 == false) || (counter2 == false) || (counter1 == false))
    {
        cout << "Row " << row+1 << " has a problem." << endl;
        *x = 1;
    }
}

void checkColumn(int S[9][9], int column, int *x) 
{ 
    int num1 = 1;
    bool counter1 = false;
    int num2 = 2;
    bool counter2 = false;
    int num3 = 3;
    bool counter3 = false;
    int num4 = 4;
    bool counter4 = false;
    int num5 = 5;
    bool counter5 = false;
    int num6 = 6;
    bool counter6 = false;
    int num7 = 7;
    bool counter7 = false;
    int num8 = 8;
    bool counter8 = false;
    int num9 = 9;
    bool counter9 = false;

    for (int x = 0; x < 9; x++)
    {
        if (S[x][column] == num1)
        {
            counter1 = true;
        }
        if (S[x][column] == num2)
        {
            counter2 = true;
        }
        if (S[x][column] == num3)
        {
            counter3 = true;
        }
        if (S[x][column] == num4)
        {
            counter4 = true;
        }
        if (S[x][column] == num5)
        {
            counter5 = true;
        }
        if (S[x][column] == num6)
        {
            counter6 = true;
        }
        if (S[x][column] == num7)
        {
            counter7 = true;
        }
        if (S[x][column] == num8)
        {
            counter8 = true;
        }
        if (S[x][column] == num9)
        {
            counter9 = true;
        }
    }
        //checks if any number is missing in the column
        if ((counter9 == false) || (counter8 == false) || (counter7 == false) || (counter6 == false) || (counter5 == false) || 
            (counter4 == false) || (counter3 == false) || (counter2 == false) || (counter1 == false))
        {
            cout << "column " << column + 1 << " has a problem." << endl;
            *x = 1;
        }
}

void checkSquare(int S[9][9], int square, int *x) //Checks each square to see if any have errors
{ 
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    int num6;
    int num7;
    int num8;
    int num9;
    
    if (square == 1)
    {
        int D[9] = { S[0][0], S[0][1], S[0][2], 
                     S[1][0], S[1][1], S[1][2], 
                     S[2][0], S[2][1], S[2][2]};
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 1 has a problem." << endl;
            *x = 1;
        }
        //cout << "****************** Square one is " << unique9numbers(D) << endl;
    }
    if (square == 2)
    {
        int D[9] = { S[0][3], S[0][4], S[0][5],
                     S[1][3], S[1][4], S[1][5],
                     S[2][3], S[2][4], S[2][5] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 2 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 3)
    {
        int D[9] = { S[0][6], S[0][7], S[0][8],
                     S[1][6], S[1][7], S[1][8],
                     S[2][6], S[2][7], S[2][8] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 3 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 4)
    {
        int D[9] = { S[3][0], S[3][1], S[3][2],
                     S[4][0], S[4][1], S[4][2],
                     S[5][0], S[5][1], S[5][2] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 4 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 5)
    {
        int D[9] = { S[3][3], S[3][4], S[3][5],
                     S[4][3], S[4][4], S[4][5],
                     S[5][3], S[5][4], S[5][5] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 5 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 6)
    {
        int D[9] = { S[3][6], S[3][7], S[3][8],
                     S[4][6], S[4][7], S[4][8],
                     S[5][6], S[5][7], S[5][8] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 6 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 7)
    {
        int D[9] = { S[6][0], S[6][1], S[6][2],
                     S[7][0], S[7][1], S[7][2],
                     S[8][0], S[8][1], S[8][2] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 7 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 8)
    {
        int D[9] = { S[6][3], S[6][4], S[6][5],
                     S[7][3], S[7][4], S[7][5],
                     S[8][3], S[8][4], S[8][5] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 8 has a problem." << endl;
            *x = 1;
        }
    }
    if (square == 9)
    {
        int D[9] = { S[6][6], S[6][7], S[6][8],
                     S[7][6], S[7][7], S[7][8],
                     S[8][6], S[8][7], S[8][8] };
        ;
        if (unique9numbers(D) == false)
        {
            cout << "Square 9 has a problem." << endl;
            *x = 1;
        }
    }
}

bool unique9numbers(int D[9]) // array D has 9 numbers
{ // returns true if all 9 numbers in array D are unique with no repetitions, false otherwise.

    bool squareValid = true;

    int num1 = 1;
    bool counter1 = false;
    int num2 = 2;
    bool counter2 = false;
    int num3 = 3;
    bool counter3 = false;
    int num4 = 4;
    bool counter4 = false;
    int num5 = 5;
    bool counter5 = false;
    int num6 = 6;
    bool counter6 = false;
    int num7 = 7;
    bool counter7 = false;
    int num8 = 8;
    bool counter8 = false;
    int num9 = 9;
    bool counter9 = false;

    for (int x = 0; x < 9; x++)
    {
        if (D[x]== num1)
        {
            counter1 = true;
        }
        if (D[x] == num2)
        {
            counter2 = true;
        }
        if (D[x] == num3)
        {
            counter3 = true;
        }
        if (D[x] == num4)
        {
            counter4 = true;
        }
        if (D[x] == num5)
        {
            counter5 = true;
        }
        if (D[x] == num6)
        {
            counter6 = true;
        }
        if (D[x] == num7)
        {
            counter7 = true;
        }
        if (D[x] == num8)
        {
            counter8 = true;
        }
        if (D[x] == num9)
        {
            counter9 = true;
        }
    }
    //checks if any number is missing in the column
    if ((counter9 == false) || (counter8 == false) || (counter7 == false) || (counter6 == false) || (counter5 == false) ||
        (counter4 == false) || (counter3 == false) || (counter2 == false) || (counter1 == false))
    {
        squareValid = false;
    }
    return squareValid;
}