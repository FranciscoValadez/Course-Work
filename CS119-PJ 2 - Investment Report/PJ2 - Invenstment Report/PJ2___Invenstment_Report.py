# Author: Francisco Valadez
# Date:     1/14/2021           
# Purpose: This program computes and prints an investment report based on what the user inputs
	
# MAIN PROGRAM :
n = 1  # line number for each separator line for readability of the output
print ("Welcome to the Investment Report Tool of Francisco Valadez!")   # must use your name!
print(n,"======================================================."); n+=1;
#Grabs user's input
invest_amount = float(input("Enter the investment amount: "))
years = int(input("Enter the number of years: "))
rate = float(input("Enter the rate as a %: "))
#Math done below:
rate = rate/100
totalInterest = 0.0
print(n,"======================================================."); n+=1;
print("%4s%18s%10s%16s" % \
 ("Year", "Starting balance",
 "Interest", "Ending balance"))
# Compute and display the results for each year
for year in range(1, years + 1):
 interest = invest_amount * rate
 endBalance = invest_amount + interest
 print("%4d%18.2f%10.2f%16.2f" % \
 (year, invest_amount, interest, endBalance))
 invest_amount = endBalance
 totalInterest += interest
# Display the totals for the period
print(n,"======================================================."); n+=1;
print("Ending balance: $%0.2f" % endBalance)
print("Total interest earned: $%0.2f" % totalInterest)
#Goodbye Message
print(n,"======================================================."); n+=1;
print("Thank you for using the Investment Report Tool of Francisco Valadez ")  # must use your name!
print(n,"======================================================."); n+=1;
x = input("Press Ctrl+Alt+PrtScn to get a snapshot of this console, then Enter to exit: ")
# End of MAIN PROGRAM