package com.gl.service;

import java.util.ArrayList;


import com.gl.Dao.StudentDao;
import com.gl.model.Student;


public class StudentService {
	StudentDao sDao;

	public StudentService() {
		sDao= new StudentDao();
		
	}
	
	public ArrayList<Student> getStudentsSvc(){
		return sDao.getStudents();
	}
	
	
	public boolean insertStudentSvc(Student student) {
		return sDao.insertStudents(student);
	}
	
	public boolean updateStudentSvc(Student student)
	{
			return sDao.updateStudents(student);
	}
	
	public boolean deleteStudentByIdSvc(int studentId) {
		return sDao.deleteStudent(studentId);
	}
	
	public boolean dropRecordsSvc() {
		return sDao.dropRecord();
		
	}
	
	}


