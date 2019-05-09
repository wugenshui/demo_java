package com.wyl.cn;

import java.util.List;

/****
 * 学生类
 * @author wangyl
 *
 */
public class Student {
	private String name;
	private int age;
	private Head head;
	
	private List<String> qingfus;
	public Student() {
		
	}
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	


	public List<String> getQingfus() {
		return qingfus;
	}





	public void setQingfus(List<String> qingfus) {
		this.qingfus = qingfus;
	}





	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	
}
