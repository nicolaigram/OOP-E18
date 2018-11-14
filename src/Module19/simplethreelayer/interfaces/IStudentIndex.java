/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module19.simplethreelayer.interfaces;

import java.util.List;
import Module19.simplethreelayer.domain.Student;

/**
 *
 * @author Nicolai Gram
 */
public interface IStudentIndex {
    public void addStudent(String name, int age);
    public List<Student> getStudents();
}
