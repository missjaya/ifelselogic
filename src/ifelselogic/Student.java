/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelselogic;

/**
 *
 * @author dilipkumar
 */
public class Student {
    
    private String name;
    private String semester;
    
    //define default constructor
    public Student() {
    
    }
    
    //constructor
    public Student (String name, String semester) {
        this.name = name;
        this.semester = semester;
    }
    //setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
}
