# Author:  Francisco Valadez
# Date:    2/4/2021
# Purpose: A program checks 4 predefined sudoku games to see if they have issues.

# Nice to show row index 0 to 8 and column index 0 to 8 for readability of your code 
S1 = [                                            # Game 1
#  column index:         0 1 2 3 4 5 6 7 8     
						[1,2,3,4,5,6,7,8,9],    # row index 0     ||  User’s row  1
	    	       		[2,3,4,5,6,7,8,9,1],    #                  1                            2
	    	       		[3,4,5,6,7,8,9,1,2],    #                  2                            3
	    	         	[4,5,6,7,8,9,1,2,3],    #                  3                            4
	    	        	[5,6,7,8,9,1,2,3,4],    #                  4                            5
	    	         	[6,7,8,9,1,2,3,4,5],    #                  5                            6
	    	         	[7,8,9,1,2,3,4,5,6],    #                  6                            7
	    	         	[8,9,1,2,3,4,5,6,7],    #                  7                            8
	    	         	[9,1,2,3,4,5,6,7,8]  ]  #                  8                            9
S2 = [                                            # Game 2
#  column index:         0 1 2 3 4 5 6 7 8     
						[1,2,3,4,5,6,7,8,9],    # row index 0     ||  User’s row  1
	    	       		[4,5,6,7,8,9,1,2,3],    #                  1                            2
	    	       		[7,8,9,1,2,3,4,5,6],    #                  2                            3
	    	         	[2,3,4,5,6,7,8,9,1],    #                  3                            4
	    	        	[5,6,7,8,9,1,2,3,4],    #                  4                            5
	    	         	[8,9,1,2,3,4,5,6,7],    #                  5                            6
	    	         	[3,4,5,6,7,8,9,1,2],    #                  6                            7
	    	         	[6,7,8,9,1,2,3,4,5],    #                  7                            8
	    	         	[9,1,2,3,4,5,6,7,8]  ]  #                  8                            9
S3 = [                                            # Game 3
#  column index:         0 1 2 3 4 5 6 7 8     
						[1,2,3,4,5,6,7,8,2],    # row index 0     ||  User’s row  1
	    	       		[4,5,6,7,8,9,1,2,3],    #                  1                            2
	    	       		[7,8,9,1,2,3,4,5,6],    #                  2                            3
	    	         	[2,3,4,5,6,7,8,9,1],    #                  3                            4
	    	        	[5,6,7,8,9,1,2,3,4],    #                  4                            5
	    	         	[8,9,1,2,3,4,5,6,7],    #                  5                            6
	    	         	[3,4,5,6,7,8,9,1,2],    #                  6                            7
	    	         	[6,7,8,9,1,2,3,4,5],    #                  7                            8
	    	         	[9,1,2,3,4,5,6,7,8]  ]  #                  8                            9
S4 = [                                            # Game 4
#  column index:         0 1 2 3 4 5 6 7 8     
						[1,2,3,4,5,6,7,8,9],    # row index 0     ||  User’s row  1
	    	       		[4,5,6,7,8,9,1,2,3],    #                  1                            2
	    	       		[7,8,9,1,2,3,4,5,6],    #                  2                            3
	    	         	[2,3,4,5,6,7,8,9,1],    #                  3                            4
	    	        	[5,6,7,8,9,1,2,3,4],    #                  4                            5
	    	         	[8,9,1,2,3,4,5,6,7],    #                  5                            6
	    	         	[3,4,5,6,7,8,9,1,2],    #                  6                            7
	    	         	[6,7,8,9,1,8,3,4,5],    #                  7                            8
	    	         	[9,1,2,3,4,5,6,7,8]  ]  #                  8                            9

def showGame(s):  # show the complete 9x9 sudoku game board

    for x in range(9):
        for y in range(9):
            print(s[x][y], end="")
        print(" ")

def ColumnOK(S, column): # to check column: 0 through 8 (meaning Column 1 through 9 from user’s view). 
	goodlist = [1,2,3,4,5,6,7,8,9]
	checklist = [1,2,3,4,5,6,7,8,9]

	i = 0
    #fills checklist with square 9's numbers
	for x in range(0, 8+1):
			checklist[i] = S[x][column]
			i += 1
    #Sorts the list
	checklist.sort()

    #compares the lists
	return(checklist == goodlist) 

def SquareOK(S, square): # to check square: 0 through 8 (meaning Square 1 through 9 from user’s view).
	goodlist = [1,2,3,4,5,6,7,8,9]
	checklist = [0,0,0,0,0,0,0,0,0]

	A = 0
	B = 0
	i = 0
	
	#Depending on the selected square the values in the for loop will change
	if square == 0:
		A = 0
		B = 0
	if square == 1:
		A = 0
		B = 3
	if square == 2:
		A = 0
		B = 6
	if square == 3:
		A = 3
		B = 0
	if square == 4:
		A = 3
		B = 3
	if square == 5:
		A = 3
		B = 6
	if square == 6:
		A = 6
		B = 0
	if square == 7:
		A = 6
		B = 3
	if square == 8:
		A = 6
		B = 6

    #fills checklist with the square's numbers
	for x in range(A, A + 3):
		for y in range(B, B + 3):
			checklist[i] = S[x][y]
			#print(x, " ", y)
			i += 1
	#print(checklist, "\n")

	checklist.sort()

    #compares the lists
	return(checklist == goodlist)

def checkGame(S):   # check game board S for 9 rows, 9 columns, 9 squares
	countBad = 0   # count how many problems being detected 
	for r in range(9):  # 9 rows check with r = 0 to 8
	    if (not RowOK(S, r) ):     # r = 0 to 8 from computer’s view
	        print("Row", r + 1 , "has a problem.")               # Row 1 to 9 from user’s view
	        countBad += 1   # increment countBad by 1
	for c in range(9):   #  9 columns check: 0 to 8, actually they mean column 1 to 9 for user.
		if (not ColumnOK(S, c)):
			print('Column', c+1, 'has a problem'); 
			countBad += 1
	for q in range(9):  #  9 squares check: 0 to 8, actually they mean square 1 to 9 for user.
		if not SquareOK(S, q):
			print('Square', q+1, 'has a problem'); 
			countBad +=1 
	if countBad == 0:  # perfect game since nothing is bad 
	    print("Congratulations! You won the game.")

def RowOK(S, r):  # check Row r in S board is OK or not
	goodlist = [1,2,3,4,5,6,7,8,9]   # a perfect list of 1 thru 9 sorted order
	slist = S[r]     # get row r, which can be 0, 1, …, or 8
	clist = [ ]        # We must make a real copy of the original source list to avoid changing it here.
	for element in slist:
	    clist.append(element)   # make a real copy to avoid side effect to the original 9x9 array
	clist.sort( )    # sort the list before comparing with goodlist
	return (clist == goodlist)    # true means OK since they are equal
	# end of RowOK( )


n = 1  # line number for each separation line for readability
print("Welcome to ply the Sudoku Game Check of Francisco Valadez!")
print(n,"=============================================================");n=n+1;
print("Your game 1 is as follows: " )
showGame(S1)   # to print 9x9 game board
print("\nYour game 1: ")  # show the check result
checkGame(S1)  # to check 9 rows/columns/squares
print( )
print(n,"=============================================================");n=n+1;
print("Your game 2 is as follows: " )
showGame(S2)   # to print 9x9 game board
print("\nYour game 2: ")  # show the check result
checkGame(S2)  # to check 9 rows/columns/squares
print( )
print(n,"=============================================================");n=n+1;
print("Your game 3 is as follows: " )
showGame(S3)   # to print 9x9 game board
print("\nYour game 3: ")  # show the check result
checkGame(S3)  # to check 9 rows/columns/squares
print( )
print(n,"=============================================================");n=n+1;
print("Your game 4 is as follows: " )
showGame(S4)   # to print 9x9 game board
print("\nYour game 4: ")  # show the check result
checkGame(S4)  # to check 9 rows/columns/squares
print( )
print(n,"=============================================================");n=n+1;
print("Thank you for playing this Sudoku Game Check of Francisco Valadez!")
print(n,"=============================================================");n=n+1;

