# Author:  Francisco Valadez
# Date:    2/6/2021
# Purpose: A program that creates a student report based on the user's iput and shows the user the results!

class Student:
    def __init__(self, sID, lastN, firstN, gpa, phone):

        slist.append ( [sID, lastN, firstN, gpa, phone] ) 	# add a student record to slist

    #Mutator/Setters:
    def setSID(self):
        self.sID = sID
    def setLastN(self):
        self.lastN = lastN
    def setFirstN(self):
        self.firstN = firstN
    def setGpa(self):
        self.gpa = gpa
    def setPhone(self):
        self.phone = phone

    #Accessor/Getters:
    def getSID(self):
        return self.sID
    def getLastN(self):
        return self.lastN
    def getFirstN(self):
        return self.firstN
    def getGpa(self):
        return self.gpa
    def getPhone(self):
        return self.phone


#---------Main begins here-------------
counter = 1
countStudents = 0      	# count the total number of students being constructed 
totalGpa  = 0.0          		# total GPA summation of all students    
averageGpa  = 0.0    		# average GPA of all students 

slist = [ ] 	# an empty student list to start 

print("Welcome to the Student Report System of Francisco Valadez!")
print(counter, "==========================================")
sid = int(input("Please enter a first student ID: "))

while sid != 0:
    countStudents += 1

    lName = input("Please enter last name: ")
    fName = input("Please enter first name: ")
    gpa = float(input("Please enter GPA: "))
    phone = input("Please enter a phone number: ")
    print("You just entered the following student record:")
    print("Student ID:", sid,
          "\nLast Name:", lName,
          "\nFirst Name:", fName,
          "\nGPA:", gpa,
          "\nPhone Number:", phone)
    
    Student(sid, lName, fName, gpa, phone)

    totalGpa += gpa
    averageGpa = totalGpa / countStudents

    print("========= CURRENT REPORT OF ALL STUDENTS ===============")
    print("Current Student Count =", countStudents,
          "\nTotal GPA of all students =", totalGpa,
          "\nAverage GPA of all students =","%.1f" % averageGpa,
          "\nAll student records are as follows:")

    for i in range (len(slist)):  # for all records in slist.  i = 0, 1, 2, …, len(slist)-1
        print( slist[ i ] ) 	# print i-th student record

    print("========= END OF REPORT =================================\n")

    #------------------------------
    counter += 1
    
    print(counter, "==========================================")
    sid = int(input("Please enter next student ID: "))
#Prints goodbye message
counter += 1
print(counter, "==========================================")
print("Thank you for using the Student Report System of Francisco Valadez! ")
print(counter + 1, "==========================================")
