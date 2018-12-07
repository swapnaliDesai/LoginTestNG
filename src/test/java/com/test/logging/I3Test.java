package com.test.logging;

import org.testng.annotations.Test;

public class I3Test {
	@Test(dependsOnGroups="aa")
	public void mk() {
		System.out.println("inside method mk");
		
	}
	@Test()
	public void mk1() {
		System.out.println("inside method mk1");
	}



}
