# Author:  Francisco Valadez
# Date:    1/25/2021
# Purpose: A Super Calculator that computes the users desired operations

import math

#The following 6 functions are executed after the Check funcion is executed
def Add(N1, N2):
    print("Result:", N1, '+', N2, "=", (N1 + N2))

def Subtract(N1, N2):
    print("Result:", N1, '-', N2, "=", (N1 - N2))

def Multiply(N1, N2):
    print("Result:", N1, '*', N2, "=", (N1 * N2))

def Divide(N1,N2):
    if num2 == 0:   #checks if the second number is zero
        print("The second number cannot be zero!")
        while N2 == 0:
            N2 = float(input("Enter your second number which cannot be zero: "))
        print("Result:", N1, '/', N2, "=", math.ceil((N1 / N2) * 10000)/10000)
    else:
        print("Result:", N1, '/', N2, "=", math.ceil((N1 / N2) * 10000)/10000)

def Power(N1, N2):
    print("Result:", N1, '**', N2, "=", (N1 ** N2))

def Modulus(N1, N2):
    if N2 == 0:   #checks if the second number is zero
        print("The second number cannot be zero!")
        while N2 == 0:
            N2 = float(input("Enter your second number which cannot be zero: "))
        print("Result:", N1, '%', N2, "=", math.ceil((N1 % N2) * 10000)/10000)
    else:
        print("Result:", N1, '%', N2, "=", (N1 % N2))

#This function checks what operator was used
def Check(num1, num2, operator):
    counter = 1

    while counter > 0:
        if operator == '+':
            counter = 0
            Add(num1, num2)
        elif operator == '-':
            counter = 0
            Subtract(num1, num2)
        elif operator == '*':
            counter = 0
            Multiply(num1, num2)
        elif operator == '/':
            counter = 0
            Divide(num1, num2)
        elif operator == '**':
            counter = 0
            Power(num1, num2)
        elif operator == '%':
            counter = 0
            Modulus(num1, num2)
        elif operator == '@':
            return '@' #checks if the user wants to end the game
        else:
            counter += 1
            operator = input("Enter a valid operator: ")

#Prints the welcom message
print("Welcome to use the Super Calculator of Francisco Valadez!")
counter = 0
operator = ''
#The while loop below will not stop until the user enter '@' for the operator
while operator != '@':
    counter +=1
    print (counter, "="*40)
    num1 = float(input("Enter your first number: "))
    operator = input("Enter your operator(@ to stop): ")
    num2 = float(input("Enter your second number: "))
    #If the user does not want to exit then this bit of code is run
    if operator != '@':
        operator = Check(num1, num2, operator) #sends the user's input to a function
else: #Prints the goodbye message
    print(counter + 1, "="*40)
    print("Thank you for playing this Super Calculator of Francisco Valadez!")
    print(counter + 2, "="*40)
