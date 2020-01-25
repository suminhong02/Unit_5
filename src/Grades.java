// ****************************************************************
//   Grades.java
//
//   Use Student class to get test grades for two students
//   and compute averages
//
// ****************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");

        student1.inputGrades();
        student1.getName();
        student1.getAverage();
        student1.toString();
        //input grades for Mary
        //print Mary
        //use getAverage to calculate & print average for Mary

        System.out.println();
        student2.inputGrades();
        student2.getName();
        student2.getAverage();
        student2.toString();
        //input grades for Mike
        //print Mike
        //use getAverage to calculate & print average for Mike

    }
}

