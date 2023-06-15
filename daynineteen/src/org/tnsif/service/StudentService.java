package org.tnsif.service;

import java.util.List;

import org.tnsif.entities.Student;

public interface StudentService {
	
	public boolean addStudent(Student student);//it is a create operation
	public Student getStudent(int rollno);//Retrieve with specific data
	public List<Student>getAll();//Retrieve all the data
	public Student updateStudent(Student student);//update
	public boolean deleteStudent(int rollno);//delete

}
