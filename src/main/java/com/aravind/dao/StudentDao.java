package com.aravind.dao;

public interface StudentDao {
	boolean stuLogin(String email, String password);
	String checkAttendance(int id);

}
