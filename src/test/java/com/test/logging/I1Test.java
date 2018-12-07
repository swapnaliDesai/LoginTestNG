package com.test.logging;

import org.testng.annotations.Test;

public class I1Test {
	@Test(groups= {"aa","bb"})
	public void logg() {
		System.out.println("inside method logg");
		
	}
	
	@Test(groups="cc")
	public void logg1() {
		System.out.println("inside method logg1");
	}



}
