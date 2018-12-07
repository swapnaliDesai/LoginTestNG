package com.testng.demo.TestNGAnnotn;

import org.testng.annotations.Test;

public class BTest {
	@Test(priority=1)
	public void mn1() {
		System.out.println("inside method btestmn");
		
	}
	@Test
	public void mn2() {
		System.out.println("inside method bmn");
	}



}
