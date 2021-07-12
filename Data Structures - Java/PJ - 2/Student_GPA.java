//Author:       Francisco Valadez
//Date:         5/5/2021
//Purpose:      This program creates a student GPA report.

import java.util.Scanner;

public class Student_GPA
{
   static String[] sidA   = new String[12]; // 5 static parallel arrays of 12 items each
   static String[] lnameA = new String[12];
   static String[] fnameA = new String[12];
   static double[] gpaA   = new double[12];
   static String[] phoneA = new String[12];

   public static void main(String[] args)
   {
      int counter = 0;
      String studentID, lastName, firstName, phoneNumber;
      double GPA = 0, averageGpa = 0;
   
      Scanner scan = new Scanner (System.in);
      System.out.println("Welcome to the Student GPA System of Francisco Valadez!");
   
      do
      {
         System.out.println(counter + 1 + "=====================================================");
         System.out.println(">>Please enter student id, lastname, firstname, GPA and phone number>");
         studentID = scan.next();
         lastName = scan.next();
         firstName= scan.next();
         GPA = scan.nextDouble();
         phoneNumber = scan.next();
      
         //Checks if user wants to quit the program
         if (studentID.equals("0"))
            break;
      
         //Creates a student
         Student info = new Student(studentID, lastName, firstName, GPA, phoneNumber, counter);
      
         //System.out.println("SID: " + studentID + "\nLast Name: "+ lastName + "\nFirst Name: " + firstName + "\nGPA: " + GPA + "\nPhone:" + phoneNumber);
         
      
         ++counter;
      } while(counter < 10);
      System.out.println( counter + 2 + "====================================================");
      System.out.println( "Student GPA Report: \n" + "\n" +
                         "ID\tLast Name\tFirst Name\tGPA\tPhone Number" + "\n" +
                         "----- -------------- ---------------- -------- ------------");
      for (int x = 0; x < counter; x++)
      {
         System.out.println(sidA[x] + "\t"+ lnameA[x] + "\t\t" + fnameA[x] + "\t" + gpaA[x] + "\t" + phoneA[x]);
         averageGpa += gpaA[x];
      }
   
      System.out.println("\nThe Average GPA of the above " + counter + " students is " + ((int)((averageGpa/counter)*10000))/10000.0);
   
      System.out.println(3 + counter + "====================================================.");
      System.out.println("Thank you for using the Student GPA System of Francisco Valadez!");
      System.out.println(4 + counter + "====================================================.");
   }
}

//This class holds the constructor, getters and setters for the student's information
class Student
{
   private static int  countStudents = 0; // count the total number of students
   private static double totalGpa  = 0.0; // total GPA sum of all students. Don’t use float   
   private static double averageGpa  = 0.0; // average GPA of all students. Don’t use float
   String studentID;
   String lastName;
   String firstName; 
   double GPA; 
   String phoneNumber;
   Student_GPA student = new Student_GPA();
   
   public Student(String studentID, String lastName, String firstName, double GPA, String phoneNumber, int counter)
   {
      //keeps track of number of students
      countStudents++;
      //5 Setters
      setSID(studentID, counter);
      setLastName(lastName, counter);
      setFirstName(firstName, counter);
      setGPA(GPA, counter);
      setPhoneNumber(phoneNumber, counter);
   
      //Prints the new students information
      printStudentRecord(counter);
   
      //caculates the gpa and displays the current student count
      totalGpa += GPA;
      averageGpa = totalGpa / countStudents;
      System.out.println("\nCurrent Student Count: " + countStudents + ", Total GPA: " + totalGpa + 
         ", Average GPA: " + averageGpa);
   
   }

   //prints the new studetns information
   void printStudentRecord(int counter)
   {
      System.out.print("Student id: " + student.sidA[counter] + ", Last Name: " + student.lnameA[counter] + ", First Name: " + student.fnameA[counter]
         + ", GPA: " + student.gpaA[counter] + ", Phone Number: " + student.phoneA[counter]);
   }

   //5 setters
   void setSID(String studentId, int counter)
   {
      //this.studentId = SID;
   	//student.sidA[counter] = this.studentId;
      student.sidA[counter] = studentId;
      //System.out.print("Student id: " + studentId);
   }
   void setLastName(String lastName, int counter)
   {
      student.lnameA[counter] = lastName;
      //System.out.print(", Last Name: " + lastName);
   }
   void setFirstName(String firstName, int counter)
   {
      
      student.fnameA[counter] = firstName;
      //System.out.print(", First Name: " + firstName);
   }
   void setGPA(double GPA, int counter)
   {
      student.gpaA[counter] = GPA;
      //System.out.print(", GPA: " + GPA);
   }
   void setPhoneNumber(String phoneNumber, int counter)
   {
      student.phoneA[counter] = phoneNumber;
      //System.out.print(", Phone Number: " + phoneNumber);
   }

   //5 getters
   public String getSID(String studentID, int counter)
   {
      return student.studentID[counter];
   }
   public String getLastName(String lastName, int counter)
   {
      return student.lnameA[counter];
   }
   public String getFirstName(String firstName, int counter)
   {
      return student.fnameA[counter];
   }
   public double getGPA(double GPA, int counter)
   {
      return student.gpaA[counter];
   }
   public String getPhoneNumber(String phoneNumber, int counter)
   {
      return student.phoneA[counter];
   }
}