package com.aravind.dao;

public interface FacultyDao {
	boolean facLogin(String email,String password);
	boolean markAttendance(int id);
	void addStudent();
	void finalreport();
}
