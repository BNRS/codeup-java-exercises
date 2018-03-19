package grades;

import java.util.*;

public class Student {

    public static void main(String[] args) {

        Student student1 = new Student("ben");
        Student student2 = new Student("chris");
        Student student3 = new Student("matt");
        Student student4 = new Student("bill");

        student1.addGrade(80);
        student1.addGrade(70);
        student1.addGrade(50);

        student2.addGrade(45);
        student2.addGrade(78);
        student2.addGrade(89);

        student3.addGrade(45);
        student3.addGrade(89);
        student3.addGrade(100);

        student4.addGrade(56);
        student4.addGrade(45);
        student4.addGrade(78);

        System.out.println("ben: " + student1.getGradeAverage());
        System.out.println("chris: " + student2.getGradeAverage());
        System.out.println("matt: " + student3.getGradeAverage());
        System.out.println("bill: " + student4.getGradeAverage());

    }

    /**Create an application for tracking student grades*/


    //properties
    private ArrayList<Integer> grades = new ArrayList<>();
    private String name;


    //constructor
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    //g & s
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int num = 0;
        for(int g : grades) {
            num += g;
        } return num /grades.size();
    }

}






