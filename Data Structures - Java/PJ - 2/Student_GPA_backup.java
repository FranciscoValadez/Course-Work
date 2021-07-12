//Author:       Francisco Valadez
//Date:         5/5/2021
//Purpose:      This program
import java.util.Scanner;



public class Student_GPA
{
    private static int  countStudents = 0; // count the total number of students
    private static double totalGpa  = 0.0; // total GPA sum of all students. Don’t use float   
    private static double averageGpa  = 0.0; // average GPA of all students. Don’t use float
    static String[] sidA   = new String[12]; // 5 static parallel arrays of 12 items each
    static String[] lnameA = new String[12];
    static String[] fnameA = new String[12];
    static double[] gpaA   = new double[12];
    static String[] phoneA = new String[12];

    public static void main(String[] args)
    {
        int counter = 0;
        String studentID, lastName, firstName, phoneNumber;
        double GPA;
        Records info = new Records();

        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to the Student GPA System of Francisco Valadez!");

        do
        {
            System.out.println(counter + "=====================================================");
            System.out.println(">>Please enter student id, lastname, firstname, GPA and phone number>");
            studentID = scan.next();
            lastName = scan.next();
            firstName= scan.next();
            GPA = scan.nextDouble();
            phoneNumber = scan.next();

            if (studentID == "0")
			    break;

            System.out.println("SID: " + studentID + "\nLast Name: "+ lastName + "\nFirst Name: " + firstName + "\nGPA: " + GPA + "\nPhone:" + phoneNumber);
            info.setSID(studentID, counter);
            //info.Records(studentID,  lastName,  firstName,  GPA,  phoneNumber);
            ++counter;
        } while(counter < 12);
    }
}

//This class holds the constructor, getters and setters for the student's information
class Records
{

    /*
    private String studentID;
    private String lastName;
    private String firstName; 
    private double GPA; 
    private String phoneNumber;
    */

    Student_GPA student = new Student_GPA();
    
    Records()
    {

    }

    Records(String studentID, String lastName, String firstName, double GPA, String phoneNumber)
    {
        //code here
    }

    public void setSID(String studentId, int counter)
    {
        //this.studentId = SID;
		//student.sidA[counter] = this.studentId;
        student.sidA[counter] = studentId;
        System.out.println("Student id: " + studentId + ", ");
    }
    public void setLastName(String lastName, int counter)
    {
        this.lastName = lastName;
        lnameA[counter] = this.lastName;
        System.out.println("Last Name: " + this.lastName);
    }
    public void setFirstName(String firstName, int counter)
    {
        this.firstName = firstName;
        fnameA[counter] = this.firstName;
        System.out.println("First Name: " + this.firstName);
    }
    public void setGPA(double GPA, int counter)
    {
        this.GPA = GPA;
        gpaA[counter] = this.GPA;
        System.out.println("GPA: " + this.GPA);
    }
    public void setPhoneNumber(String phoneNumber, int counter)
    {
        this.phoneNumber = phoneNumber;
        phoneA[counter] = this.phoneNumber;
        System.out.println("Phone Number: " + this.phoneNumber);
    }

    public String getSID(String studentID);
    public void getLastName(String lastName);
    public void getFirstName(String firstName);
    public void getGPA(double GPA);
    public void getPhoneNumber(String phoneNumber);

    void printStudentRecord();
}