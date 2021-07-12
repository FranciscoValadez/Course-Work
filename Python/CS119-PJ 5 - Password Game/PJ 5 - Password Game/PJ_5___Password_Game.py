# Author:  Francisco Valadez
# Date:    9/18/2020
# Purpose: CS119-PJ5: Password Game – to check whether a password is very secure.
n = 1    # line number for each separator line
print ("Welcome to the PASSWORD game of \"Francisco Valadez\"!")   # must use your name
print (n,"============================================================"); n+=1;
pw = input( "Please enter a password (Enter q to quit): ")   # pw is a string
while (pw != "q") :   # q is to quit the game and exit this loop
	print("The password you just entered is \"" +  pw + "\"")    # password is quoted for clarity
	badcount = 0          # count # of problems
	countdigits = 0       # count # of digits
	countsymbols = 0  # count # of 6 special symbols $ % @ ! ? *
	countlower = 0      # count # of lower-case letters
	countupper = 0    # count # of upper-case letters 
	countyears = 0    # count # of 4-digit years 2020 2019 2018 2017
	# Counting lower case letters:
	countlower += pw.count('a')+pw.count('b')+pw.count('c')+pw.count('e')+pw.count('f')+pw.count('g')
	countlower += pw.count('h')+pw.count('i')+pw.count('j')+pw.count('k')+pw.count('l')+pw.count('m')
	countlower += pw.count('n')+pw.count('o')+pw.count('p')+pw.count('q')+pw.count('r')+pw.count('s')
	countlower += pw.count('t')+pw.count('u')+pw.count('v')+pw.count('w')+pw.count('x')+pw.count('y')
	countlower += pw.count('z')
	# Counting upper case letters:   
	countupper += pw.count('A')+pw.count('B')+pw.count('C')+pw.count('D')+pw.count('E')+pw.count('F')
	countupper += pw.count('H')+pw.count('I')+pw.count('J')+pw.count('L')+pw.count('M')+pw.count('N')
	countupper += pw.count('N')+pw.count('O')+pw.count('P')+pw.count('Q')+pw.count('R')+pw.count('S')
	countupper += pw.count('T')+pw.count('U')+pw.count('V')+pw.count('W')+pw.count('X')+pw.count('Y')
	countupper += pw.count('Z')
	if countupper < 1 :
		print("R1: Your password is not secure since it has less than 2 upper-case letters.")
		badcount += 1   
	if countlower < 1:
		print("R2: Your password is not secure since it has less than 2 lower-case letters.")
		badcount += 1
	if len(pw) < 7:
		print ("R3: Your password is not secure since it has less than 7 characters.")
		badcount += 1
	# Counting digits in password
	countdigits += pw.count('0')+pw.count('1')+pw.count('2')+pw.count('3')+pw.count('4') 
	countdigits += pw.count('5')+pw.count('6')+pw.count('7')+ pw.count('8')+pw.count('9')
	if countdigits < 1:     
		print( "R4: Your password is not secure since it has less than 2 digits.")
		badcount += 1
	if len(pw) > 12:       
		print ("R5: Your password is not secure since it has more than 12 characters.")
		badcount += 1   
	if pw.count(' ') > 0 :          # space character check
		print( "R6: Your password is not secure since it contains space.")
		badcount += 1
	if pw.isdigit( ) :    # isdigit( ) will check whether pw contains only digits.
		print( "R7: Your password is not secure since it contains only digits. ")
		badcount += 1
	if pw.isalpha( ) :  # isalpha( ) will check whether pw contains only alphabets.
		print( "R8: Your password is not secure since it contains only alphabets. ")
		badcount += 1
	# Counting 6 special symbols:
	countsymbols += pw.count('$')+pw.count('%')+ pw.count('!')+pw.count('@')+pw.count('?')+pw.count('*')
	if countsymbols < 1:
		print( "R9: Your password is not secure since it contains none of 6 special symbols: $ % @ ! ? *")
		badcount += 1   
	# Counting special years:
	countyears += pw.count('2020')+pw.count('2019')+pw.count('2018')+pw.count('2017')
	if countyears > 0:
		print("R10: Your password is not secure since it contains 2020, 2019, 2018, or 2017.")
		badcount += 1   
	# Final check of badcount to see whether password is very secure:
	if badcount < 1: 
		print( "Congratulations! Your password is very secure!")
	else :
		print( "Your password has the above ", badcount, " problems to be fixed." )
	print (n,"============================================================"); n+=1;
	pw = input( "Please enter a password (Enter q to quit): ")
	# end of while loop 
print (n,"============================================================"); n+=1;
print("Thank you for playing this PASSWORD game of \"Francisco Valadez\"!")
print (n,"============================================================"); n+=1;
# End of MAIN PROGRAM ============================================.
