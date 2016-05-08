/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelselogic;

import java.util.ArrayList;

/**
 *
 * @author dilipkumar
 */
public class Ifelselogic {

    public static void printStudentData(Student[] studentData) {
        System.out.println("Student Data:");
        //for loop to print it
        for (int i = 0; i < studentData.length; i++) {
            System.out.println("name: " + studentData[i].getName() + " Semester: " + studentData[i].getSemester());
        }
    }

    public static Student[] get8thSemesterStudents(Student[] studentData) {

        //Student[] newStudentData  = {};
        ArrayList newStudentData = new ArrayList();
        //loop in each students
        for (int i = 0; i < studentData.length; i++) {
            //read the student object
            Student student = studentData[i];
            //check for semester
            if (student.getSemester().equalsIgnoreCase("8th")) {
                //add 8th seemster student in new list
                newStudentData.add(student);
            }
        }
        //Convert ArrayList into Array
        return (Student[]) newStudentData.toArray(new Student[newStudentData.size()]);
    }

    public static void main(String[] arg) {
        //count number of studentds in class 8th semester from the given list of students
        
        Student student1 = new Student("Nitu", "8th");        
        Student student2 = new Student("Jaya", "6th");
        Student student3 = new Student("Amir", "5th");
        Student student4 = new Student("Rohan", "8th");
        Student student5 = new Student("Banti", "7th");

        //student data
        Student[] studentData = {student1, student2, student3, student4, student5};
        
        //print all the students  
        printStudentData(studentData);
        //get the list of 8th semester student
        Student [] semester8thStudentData = get8thSemesterStudents(studentData);
        //print the 8th semester student data
        printStudentData(semester8thStudentData);
        //print the count
        System.out.println("Count of 8th semester student: "+semester8thStudentData.length);
    }

}
