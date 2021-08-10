package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "D:\\CucumberAfternoonBatch\\src\\test\\resources\\facebook.feature" })
public class TestRunner {

	public void b1() {
		System.out.println("b1");

	}

	public void b2() {
		System.out.println("b2");
	}

	public void b3() {
		System.out.println("b3");

	}

	public void b4() {
		System.out.println("b4");

	}

	public void b5() {
		System.out.println("b5");
	}

}
