# Author:  Francisco Valadez
# Date:    2/4/2021
# Purpose: A program checks your tic tac toe game for wins! you can also enter your own game to check for wins.

# MAIN PROGRAM: ================================================.
O = 'O'    # player O
X = 'X'    # player X
tlist = [ [ [O,O,O],   # Game 1     		# tlist [ 0 ] to get this game
            [O,O,O],            # tlist is like a 3-dimensional array or list 
            [O,O,O] ] ,
          [ [X,X,X],    # Game 2     		# tlist [ 1 ] to get this game
            [X,X,X], 
            [X,X,X] ] , 
          [ [X,O,X],    # Game 3      		# tlist [ 2 ] to get this game
            [X,X,O], 
            [X,O,O] ] ,          
          [ [X,O,O],     # Game 4      		# tlist [ 3 ] to get this game
            [O,X,O], 
            [X,X,O] ] ,
          [ [X,O,X],     # Game 5      		# tlist [ 4 ] to get this game
            [O,X,O], 
            [X,O,O] ] ,          
          [ [O,X,O],    # Game 6   # It is a tie.   # tlist [ 5 ] to get this game
            [X,O,X],
            [X,O,X] ]  ]

def show(t):
    #shows the user their game
    for x in range(0, 2+1):
        for y in range (0, 2+1):
            print(t[x][y], end = '')
        print("\n", end = '')

def checkwin(t):
    wincount = 0
    #Checks if O won the game
    if winrow1(t, O) is True:
        print("O won by row 1")
        wincount += 1
    if winrow2(t, O) is True:
        print("O won by row 2")
        wincount += 1
    if  winrow3(t, O) is True:
        print("O won by row 3")
        wincount += 1
    if wincol1(t, O) is True:
        print("O won by column 1")
        wincount += 1
    if wincol2(t, O) is True:
        print("O won by column 2")
        wincount += 1
    if wincol3(t, O) is True:
        print("O won by column 3")
        wincount += 1
    if windia1(t, O) is True:
        print("O won by diagonal 1")
        wincount += 1
    if windia2(t, O) is True:
        print("O won by diagonal 2")
        wincount += 1

    #checks if X won the game:
    if winrow1(t, X) is True:
        print("X won by row 1")
        wincount += 1
    if winrow2(t, X) is True:
        print("X won by row 2")
        wincount += 1
    if  winrow3(t, X) is True:
        print("X won by row 3")
        wincount += 1
    if wincol1(t, X) is True:
        print("X won by column 1")
        wincount += 1
    if wincol2(t, X) is True:
        print("X won by column 2")
        wincount += 1
    if wincol3(t, X) is True:
        print("X won by column 3")
        wincount += 1
    if windia1(t, X) is True:
        print("X won by diagonal 1")
        wincount += 1
    if windia2(t, X) is True:
        print("X won by diagonal 2")
        wincount += 1
    #Checks if its a tie
    if wincount is 0:
        print('Its a tie.')

def winrow1( t, p ):  # show whether row1 wins for player p: 'X' or 'O'
    r = 0   # for board row 1      # p can be ‘X’ or ‘O’  ,  t is the 3x3 game board
    return (t[r][0]==t[r][1] and t[r][1]==t[r][2] and t[r][2]==p)   # True | False # end of winrow1( )
def winrow2( t, p ):  # show whether row1 wins for player p: 'X' or 'O'
    r = 1   # for board row 1      # p can be ‘X’ or ‘O’  ,  t is the 3x3 game board
    return (t[r][0]==t[r][1] and t[r][1]==t[r][2] and t[r][2]==p)   # True | False # end of winrow1( )
def winrow3( t, p ):  # show whether row1 wins for player p: 'X' or 'O'
    r = 2   # for board row 1      # p can be ‘X’ or ‘O’  ,  t is the 3x3 game board
    return (t[r][0]==t[r][1] and t[r][1]==t[r][2] and t[r][2]==p)   # True | False # end of winrow1( )
def wincol1( t, p ):  # show whether col1 wins for player p: 'X' or 'O'
    c = 0   # for board row 1      # p can be ‘X’ or ‘O’  ,  t is the 3x3 game board
    return (t[0][c]==t[1][c] and t[1][c]==t[2][c] and t[2][c]==p)   # True | False # end of winrow1( )
def wincol2( t, p ):  # show whether col2 wins for player p: 'X' or 'O'
    c = 1   # for board row 1      # p can be ‘X’ or ‘O’  ,  t is the 3x3 game board
    return (t[0][c]==t[1][c] and t[1][c]==t[2][c] and t[2][c]==p)   # True | False # end of winrow1( )
def wincol3( t, p ):  # show whether col3 wins for player p: 'X' or 'O'
    c = 2   # for board row 1      # p can be ‘X’ or ‘O’  ,  t is the 3x3 game board
    return (t[0][c]==t[1][c] and t[1][c]==t[2][c] and t[2][c]==p)   # True | False # end of winrow1( )
def windia1( t, p ):  # show whether diagonal1 wins for player p: 'X' or 'O'
    return (t[0][0]==t[1][1] and t[1][1]==t[2][2] and t[2][2]==p)   # end of windia2( )   
def windia2( t, p ):  # show whether diagonal2 wins for player p: 'X' or 'O'
    return (t[0][2]==t[1][1] and t[1][1]==t[2][0] and t[2][0]==p)   # end of windia2( )   

counter = 1
print('Welcome to the TicTacToe Game Check of Francisco Valadez')
print(counter, '=====================================')
for i in range(0, 5+1):  # 6 games to check one by one: 1 2 3 4 5 6 
    counter +=1 
    print("GAME", i+1 ," is as follows:")
    show( tlist[i] )          # to show 3x3 game board 
    checkwin( tlist[i] )  # to check all 8 winning situations for both X and O players
    print(counter, '=====================================')
userIn = ''
while True:
    counter += 1
    G = [ [X,X,X], [X,X,X], [X,X,X] ]  # G is a game board of 3x3
    position = 0

    userIn= input('Please enter your game board (* to exit) >')
    if userIn is '*':
        print(counter, '=====================================')
        break
    #Takes the user's input and puts it into an array
    for x in range(0, 2+1):
        for y in range(0, 2+1):
            G[x][y] = userIn[position]
            position += 1
    #The array created using the user's input is sent to the functions below to check for wins
    show(G)
    checkwin(G)
    print(counter, '=====================================')

print('Thank you for playing the TicTacToe Game Check of Francisco Valadez!')
print(counter +1, '=====================================')

# End of Program ########################################