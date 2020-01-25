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
        System.out.println(student1.getName());
        System.out.println("The average for " +student1.getName()+ " is "+ student1.getAverage());
        System.out.println(student1);
        //input grades for Mary
        //print Mary
        //use getAverage to calculate & print average for Mary

        System.out.println();

        student2.inputGrades();
        System.out.println(student2.getName());
        System.out.println("The average for "+ student2.getName()+ " is "+student2.getAverage());
        System.out.println(student2);
        //input grades for Mike
        //print Mike
        //use getAverage to calculate & print average for Mike

    }
}

