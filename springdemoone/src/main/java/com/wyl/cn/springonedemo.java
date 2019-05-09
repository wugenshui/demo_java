package com.wyl.cn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wyl.com.StudentImpl;

public class springonedemo {

	public static void main(String[] args ) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student st=(Student)context.getBean("student");
		
		System.out.println("姓名："+st.getName());
		
		System.out.println("年龄："+st.getAge());
		
		System.out.println("情妇几个："+st.getQingfus().size());
		for(String s:st.getQingfus()){
			System.out.println("情妇有："+s);
		}
		
		
		Head he=st.getHead();
		
		System.out.println("名称："+he.getName());

		System.out.println("我是不是油嘴："+he.getIsHaveZui());

		StudentImpl si=(StudentImpl) context.getBean("StudentImpl");
		si.addStudnet();
		
		
	}

}
