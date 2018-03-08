package grades;

import util.Input;

import java.util.*;

public class GradesApplication {
    public static HashMap<String, Student> students = new HashMap<>();

    public static void main(String[] args) {
        Input input = new Input();

        Student student1 = new Student("BNRS");
        Student student2 = new Student("BAHODGE");
        Student student3 = new Student("chrishughallen");
        Student student4 = new Student("bettinatrejo");
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

        students.put("ben", student1);
        students.put("ben h", student2);
        students.put("chris", student3);
        students.put("bettina", student4);

        do {
        System.out.println(students);
        System.out.println("================================================");
        String username = input.getString("Which user would you like GitHub information on?: ");
        getUserChoice(username);

    } while (input.yesNo("Would you like to continue? Y/N"));
        System.out.println("No problem, have a great day!");
    }

    public static void getUserChoice(String username) {
        if (students.containsKey(username)) {
            System.out.println("Grade Avg: " + students.get(username).getGradeAverage());
            System.out.println("GitHub Username: " + students.get(username).grades.size());
        }

    }

}
