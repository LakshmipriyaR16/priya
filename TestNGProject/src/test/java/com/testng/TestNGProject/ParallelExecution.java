package com.testng.TestNGProject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParallelExecution {
	@Test(retryAnalyzer=RetryFailed.class)
	public void test1() {
		System.out.println("method 1 is"+Thread.currentThread().getId());
		Assert.assertTrue(true);
	}
	@Test
	public void test2() {
		System.out.println("method 2 is"+Thread.currentThread().getId());
	}
	@Test
	public void test3() {
		System.out.println("method 3 is"+Thread.currentThread().getId());
	}
	@Test
	public void test4() {
		System.out.println("method 4 is"+Thread.currentThread().getId());
	}

}
