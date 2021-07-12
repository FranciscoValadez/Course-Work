# Author:  Francisco Valadez
# Date:    1/23/2021
# Purpose: A simple calculator that shows gives the user a result based on their input

#This function is executed when the user inputs a valid operator
def Results(num1, num2, operator):
    if operator == '+':
        print("Result:", num1, operator, num2, "=", (num1 + num2))
    elif operator == '-':
        print("Result:", num1, operator, num2, "=", (num1 - num2))
    elif operator == '*':
        print("Result:", num1, operator, num2, "=", (num1 * num2))
    elif operator == '/':
        if num2 == 0:   #checks if the second number is zero
            print("The second number cannot be zero!")
        else:
            print("Result:", num1, operator, num2, "=", (num1 / num2))
    elif operator == '**':
        print("Result:", num1, operator, num2, "=", (num1 ** num2))
    elif operator == '%':
        if num2 == 0:   #checks if the second number is zero
            print("The second number cannot be zero!")
        else:
            print("Result:", num1, operator, num2, "=", (num1 % num2))
    else:
        print("Sorry,", operator, "is not a valid operator!")

#Prints the welcom message
print("Welcome to use the Simple Calculator of Francisco Valadez!")
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
        Results(num1, num2, operator) #sends the user's input to a function
else: #Prints the goodbye message
    print(counter + 1, "="*40)
    print("Thank you for playing this Simple Calculator of Francisco Valadez!")
    print(counter + 2, "="*40)
