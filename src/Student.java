// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and return a string containing student’s info.
// ****************************************************************
import java.util.Scanner;

public class Student
{
    //declare instance data
    private int score1;
    private int score2;
    private String name;
    Scanner scan = new Scanner(System.in);
    //-----------------------------------------------
    //constructor
    //-----------------------------------------------
    public Student(String studentName)
    {
        //add body of constructor
        name = studentName;
        score1 = 0;
        score2 = 0;
    }

    //-----------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    //-----------------------------------------------
    public void inputGrades()
    {
        //add body of inputGrades
        System.out.print("Enter "+ name + "'s score for test1: ");
        score1 = scan.nextInt();
        System.out.print("Enter "+ name + "'s score for test2: ");
        score2 = scan.nextInt();
    }

    //-----------------------------------------------
    //getAverage: compute and return the student's test average
    //-----------------------------------------------

    //add header for getAverage
    public double getAverage()
    {
        //add body of getAverage
        return (score1+score2)/2;
    }

    //-----------------------------------------------
    //getName: print the student's name
    //-----------------------------------------------

    //add header for printName
    public String getName()
    {
        //add body of printName
        return name;
    }

    // toString method:  Output in the following format
    // Name: Joe  Test1: 85  Test2: 91
    public String toString(){
        return "Name: "+ name + " Test1: " + score1 + " Test2: " + score2;
    }


}
