package com.example.project.Student;
import java.util.ArrayList;

public class Utility {
    public static ArrayList<Student> sortStudents(ArrayList<Student> studentsToSort) {
        int n = studentsToSort.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                Student s1 = studentsToSort.get(i);
                Student s2 = studentsToSort.get(j);

                if (s1.getLastName().compareTo(s2.getLastName()) > 0 ||
                    (s1.getLastName().equals(s2.getLastName()) && s1.getFirstName().compareTo(s2.getFirstName()) > 0) ||
                    (s1.getLastName().equals(s2.getLastName()) && s1.getFirstName().equals(s2.getFirstName()) && s1.getGpa() < s2.getGpa())) {
                    
                    studentsToSort.set(i, s2);
                    studentsToSort.set(j, s1);
                }
            }
        }
        return studentsToSort;
    }
}
