package org.launchcode;
import java.util.*;

public class HashMapPractice {
    public static void main (String[] args){
        HashMap<Integer, String> students = new HashMap<Integer, String>();
        Scanner input = new Scanner(System.in);
        int nextId = 0;
        String newStudent;
        do{
            System.out.println("Student: ");
            newStudent = input.nextLine();
            if(!newStudent.equals("")) {
                students.put(nextId, newStudent);
                nextId++;
            }
        } while (!newStudent.equals(""));

        System.out.println("Class roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println("Student Name: " + student.getValue() + "\nStudent ID: " + student.getKey());
        }
        System.out.println("Number of students in roster: " + students.size());
    }
}
