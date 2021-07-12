#---------------------------------------------------------------------------------------------------------------.
# Author:  Francisco Valadez
# Date:    1/07/2021
# Purpose: CS119-PJ4: A game to roll the dice and earn/lose money with initial money of 100 dollars
#                for you to start your game.
# MAIN PROGRAM: ============================================.
import random
n = 1  # line number for each separator line in sequence
print ("Welcome to the Rolling Dice Game of Francisco Valadez!" )  # must use your name
print(n,"=========================================================."); n+=1;
yourMoney = 100
print( "Now, you have ", yourMoney, "dollars to play the game.")
while True:
	print(n,"=========================================================."); n+=1;
	bet = int(input("Enter your bet to roll the dice (enter 0 to quit): "))  # get bet
	#If user enters 0 or when all money is lost, below is executed
	if bet == 0:
		break
	dealer = random.randint(1, 6)    # dealer rolls the dice
	you = random.randint(1, 6)    # you roll the dice
	print("Dealer got ", dealer, ", and you got ", you, "." )
	if dealer > you: 
		yourMoney -= bet
		print("You lost " , bet, " dollars. Now, you have ", yourMoney, " dollars. ")
	elif dealer == you:       
		print("It's a tie. Now, you have ", yourMoney, "dollars.")
	elif dealer < you: 
		yourMoney += bet
		print( "You won. Now, you have ", yourMoney, "dollars.")
	# end of while True loop
print(n,"=========================================================."); n+=1;
print("Thank you for playing the Rolling Dice Game of Francisco Valadez!")   # must use your name
print(n,"=========================================================."); n+=1;
x = input("Press Ctrl+Alt+PrtScn to get a snapshot of this console, then ENTER to exit: ")

# End of MAIN PROGRAM ==========================================.
