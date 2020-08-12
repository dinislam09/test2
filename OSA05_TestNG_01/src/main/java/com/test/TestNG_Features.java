package com.test;

import org.testng.annotations.Test;

public class TestNG_Features {

	@Test
	public void loginTest() {
		
		System.out.println("Login Test");
		
		
	}
	
	
	@Test(dependsOnMethods= "loginTest")
	public void forumTest() {
		System.out.println("Forum Test");
		
	}
	
	
	@Test(dependsOnMethods= "loginTest")
	public void interviewQuestionTest() {
		System.out.println("Interview Question Test");
		
	}
	
	
}
