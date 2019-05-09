package com.wyl.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wyl.cn.Student;
@Component("StudentImpl")
public class StudentImpl {
	@Autowired
	private Student student;
	
	@Transactional
	public void addStudnet(){
		System.out.println("add student..."+student.getName());
	}
}
