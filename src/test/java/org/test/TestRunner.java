package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "D:\\CucumberAfternoonBatch\\src\\test\\resources\\facebook.feature" })
public class TestRunner {

	public void a1() {
		System.out.println("a1");

	}

	public void a2() {
		System.out.println("a2");

	}

	public void a3() {
		System.out.println("a3");

	}

	public void a4() {
		System.out.println("a4");

	}

}
