# Author:  Francisco Valadez
# Date:    2/6/2021
# Purpose: This program takes up to 20 numbers, sorts them and lets the user search for a specific number!

def search(num, L): #finds the number in a list
	left = 0
	right = len(L) - 1
	while left <= right:
		midpoint = (left + right) // 2
		if num == L[midpoint]:
			return midpoint
		elif num < L[midpoint]:
			right = midpoint - 1 # Search to left
		else:
			left = midpoint + 1 # Search to right
	return -1

def swap(lyst, i, j):				# to swap 2 elements (sub i and sub j ) in the lyst.
	lyst[i], lyst[j] = lyst[j], lyst[i]

def selectionSort ( lyst ):		# to sort the lyst.  You must not use lyst.sort( ) in your program.
	n = len(lyst)
	while n > 1: # Do n - 1 bubbles
		swapped = False # Start each bubble
		i = 1
		while i < n:
			if lyst[i] < lyst[i - 1]: # Exchange if needed
				swap(lyst, i, i - 1)
				swapped = True
			i += 1
		if not swapped: return # Exit if no swaps
		n -= 1

def sum( L ):  # return the sum of all numbers in the L list
	s = 0              # to prepare for the summation of all numbers in the L list
	for i in range(len(L)):   # i to range thru all members in L list
	    s += L[i]          # add sub i of L to s as accumulation
	return s              # s is the sum of all integers in the L list
	
def avg( L ): 
	return ( sum( L )/len( L ) )   # average is sum divided by number of items 
	# len( L ) function will return the length of L list
N = 0

def show(lyst): #prints the list
	for i in range(0, len(lyst)):
		print(lyst[i], end = " ")

#Main program begins below

print("Welcome to the List Sorting/Searching Game of Francisco Valadez!")

while True:
	N += 1
	lstNumbers = []

	print(N, "=========================================================")
	intAmount = int(input("Please enter how many integers you would like to play (up to 20, 0 to stop) > "))
	
	while (0 < intAmount <= 20) is not True:
		if intAmount == 0:
			break
		intAmount = int(input("Please enter how many integers you would like to play (up to 20, 0 to stop) > "))
	if intAmount == 0:
		break
	for i in range(0, intAmount):
		number = int(input("Please enter number > "))
		lstNumbers.append(number)

	#print(lstnumbers)
	selectionSort(lstNumbers)

	print("Your", intAmount, "integers in ascending order are:", end = " ")
	show(lstNumbers)
	print("\nSum is", str(sum(lstNumbers)) + ", and average is", int(avg(lstNumbers)))
	
	N += 1
	print(N, "=========================================================")
	while True:
		sNum = int(input("Please enter a number to search(-99 to end the search) > "))
		if sNum == -99:
			break
		if search(sNum, lstNumbers) == -1:
			print("The number", sNum, "is not found")
		else:
			print("The number",sNum, "is found at the position", search(sNum, lstNumbers) + 1)
		print()

print(N +1, "=========================================================")
print("Thank you for playing this Lis Sorting/Searching game of Francisco Valadez!")
print(N +2, "=========================================================")
