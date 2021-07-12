// Author:  Francisco Valadez
// Date:    12/8/2020
// Purpose: CS116-PJ9: This program checks a tic tac toe game to see if the user's inputed game has won

#include <string>	  // for string input
#include <iostream>	  // Access input output stream
using namespace std;    // Access cout, endl, cin

bool winrow1(char t[3][3], char p); //check whether row1 won by player p
bool winrow2(char t[3][3], char p); //check whether row2 won by player p
bool winrow3(char t[3][3], char p); //check whether row3 won by player p
bool wincol1(char t[3][3], char p); //check whether col1 won by player p
bool wincol2(char t[3][3], char p); //check whether col2 won by player p
bool wincol3(char t[3][3], char p); //check whether col3 won by player p
void checkwin(char t[3][3]);  // to check all winning situations  
bool windia1(char t[3][3], char p);
bool windia2(char t[3][3], char p); // if diagonal2 won by player p:'X'|'O'
void show(char t[3][3]);


// All global variables here:
char X = 'X', O = 'O'; // a nice way to initialize 6 games
char ttt[6][3][3] =  // 6x3x3 array to hold 6 preset games: 6 3X3 games
{ {	{O, O, O}, // Game 1 is ttt[0]   // index starts from 0 in C++
	{O, O, O},
	{O, O, O} },

   {{X, X, X}, // Game 2 is ttt[1]
	{X, X, X},
	{X, X, X} },

   {{X, O, X}, // Game 3 is ttt[2]
	{X, X, O},
	{X, O, O} },

   {{X, O, O}, // Game 4 is ttt[3]
	{O, X, O},
	{X, X, O} },

   {{X, O, X}, // Game 5 is ttt[4]
	{O, X, O},
	{X, O, O} },

   {{O, X, O}, // Game 6 is ttt[5]  - This game is a tie.
	{X, O, X},
	{X, O, X} } }; // end of ttt[6][3][3] array setup

int main()
{
	//Your main() program may have the following code to check the above 6 games.

	string T;     // to get 9 chars in as a string   
	char G[3][3]; // Game board 3 X 3 : 3 rows and 3 columns/row    
	char p;       // player p can be ‘O’ or ‘X’ 
	int n = 1;    // line numbering for separation lines
	int m = 7;   // game number on the output: GAME 7 8 9
	char c;		// Value to store character before storing in array
	char t[3][3];	//array to hold user input
	int count = 0;	//counter
	cout << "Welcome to the TicTacToe Game Check of Francisco Valadez!" << endl;
	for (int i = 0; i <= 5; ++i) // to check 6 games: SUB: 0 1 2 3 4 5
	{	                         //                   GAME: 1 2 3 4 5 6 
		cout << n++ << "===========================================================" << endl;
		cout << "GAME " << (i + 1) << " is as follows:" << endl; // GAME 1,2,3,4,5,6 
		show(ttt[i]);     // show the i-th game.  i = 0,1,2,3,4,5
		checkwin(ttt[i]); // check the i-th game. i = 0,1,2,3,4,5
	}
	do 
	{
		count = 0; //resets counter if looped
		cout << n++ << "===========================================================" << endl;
		cout << "Please enter your game board(*to exit) > ";
		cin >> T; // get the string of 9 characters into T	

		//grabs the users input and puts it in an array
		for (int x = 0; x < 3; x++)
		{
			for (int y = 0; y < 3; y++)
			{
				c = T.at(count);
				if (c == '*')
				{
					//cout << "exit!!";
					break;
				}
				t[x][y] = c;
				count++;
			}
			if (c == '*')
			{
				break;
			}
		}
		
		if (c == '*')
		{
			break;
		}

		show(t);
		checkwin(t);
		
		
	} while (c != '*');
		
	//Goodbye message
	cout << "Thank you for playing this Tic-Tac-Toe Game Check of Francisco Valadez!" << endl;
	cout << n++ << "===========================================================" << endl;

	/* BELOW WAS USED FOR TESTING
	for (int x = 0; x < 3; x++)
	{
		for (int y = 0; y < 3; y++)
		{
			cout << t[x][y] << "\t";
		}
		cout << endl;
	}

	char test = ttt[0][0][0];

	if (test == '*')
	{
		cout << "\nbreak\n";
	}
	else
	{
		cout << "\ncontinue\n";
		cout << test;
	}
	*/
}

// You must define show() function to show the 3X3 game board as follows :
void show(char t[3][3])
{

	for (int x = 0; x < 3; x++)
	{
		for (int y = 0; y < 3; y++)
		{
			cout << t[x][y] << " ";
		}
		cout << endl;
	}
}

void checkwin(char t[3][3])  // to check all winning situations   
{ // begin of checkwin( )
	int wincount = 0;  // count the winning situations
	// checks if  X wins and prints out how they won
	if (winrow1(t, X))
	{
		cout << X << " won by row 1" << endl; ++wincount;
	}
	if (winrow2(t, X))
	{
		cout << X << " won by row 2" << endl; ++wincount;
	}
	if (winrow3(t, X))
	{
		cout << X << " won by row 3" << endl; ++wincount;
	}
	if (wincol1(t, X))
	{
		cout << X << " won by column 1" << endl; ++wincount;
	}
	if (wincol2(t, X))
	{
		cout << X << " won by column 2" << endl; ++wincount;
	}
	if (wincol3(t, X))
	{
		cout << X << " won by column 3" << endl; ++wincount;
	}
	if (windia1(t, X))
	{
		cout << X << " won by diagonal 1" << endl; ++wincount;
	}
	if (windia2(t, X))
	{
		cout << X << " won by diagonal 2" << endl; ++wincount;
	}
	//checks if O wins and prints out how they won
	if (winrow1(t, O))
	{
		cout << O << " won by row 1" << endl; ++wincount;
	}
	if (winrow2(t, O))
	{
		cout << O << " won by row 2" << endl; ++wincount;
	}
	if (winrow3(t, O))
	{
		cout << O << " won by row 3" << endl; ++wincount;
	}
	if (wincol1(t, O))
	{
		cout << O << " won by column 1" << endl; ++wincount;
	}
	if (wincol2(t, O))
	{
		cout << O << " won by column 2" << endl; ++wincount;
	}
	if (wincol3(t, O))
	{
		cout << O << " won by column 3" << endl; ++wincount;
	}
	if (windia1(t, O))
	{
		cout << O << " won by diagonal 1" << endl; ++wincount;
	}
	if (windia2(t, O))
	{
		cout << O << " won by diagonal 2" << endl; ++wincount;
	}
	if (wincount == 0) cout << "It is a tie." << endl;
}  // end of checkwin( )

//You must define the following 8 functions for checkwin() to call& check each winning situation :
bool winrow1(char t[3][3], char p) //check whether row1 won by player p
{
	int r = 0;   //for board row 1 ; p can be ‘X’|‘O’; t is 3x3 game board
	return (t[r][0] == t[r][1] and t[r][1] == t[r][2] and t[r][2] == p);
} // return true | false 

bool winrow2(char t[3][3], char p)
{
	int r = 1;   //for board row 2 ; p can be ‘X’|‘O’; t is 3x3 game board
	return (t[r][0] == t[r][1] and t[r][1] == t[r][2] and t[r][2] == p);
}
//{ /* code */ } // p can be ‘X’|‘O’
bool winrow3(char t[3][3], char p)
{
	int r = 2;   //for board row 2 ; p can be ‘X’|‘O’; t is 3x3 game board
	return (t[r][0] == t[r][1] and t[r][1] == t[r][2] and t[r][2] == p);
}

bool wincol1(char t[3][3], char p) //checks if the user won on column 1
{
	int r = 0;
	return (t[0][r] == t[1][r] and t[1][r] == t[2][r] and t[2][r] == p);
}

bool wincol2(char t[3][3], char p) //checks if the user won on column 2
{
	int r = 1;
	return (t[0][r] == t[1][r] and t[1][r] == t[2][r] and t[2][r] == p);
}

bool wincol3(char t[3][3], char p) //checks if the user won on column 3
{
	int r = 2;
	return (t[0][r] == t[1][r] and t[1][r] == t[2][r] and t[2][r] == p);
}

bool windia1(char t[3][3], char p) 
{
	return (t[0][0] == t[1][1] and t[1][1] == t[2][2] and t[2][2] == p);
}

bool windia2(char t[3][3], char p) // if diagonal2 won by player p:'X'|'O'
{
	return (t[0][2] == t[1][1] and t[1][1] == t[2][0] and t[2][0] == p);
}
