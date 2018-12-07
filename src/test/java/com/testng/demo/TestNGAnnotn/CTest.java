package com.testng.demo.TestNGAnnotn;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class CTest {
	@BeforeGroups
	@Test(groups="bb")
	public void mp() {
		System.out.println("inside method mp");
		
	}
	@AfterMethod
	@Test(groups="aa")
	public void mq() {
		System.out.println("inside method mq");
	}



}
