package com.liana.course.jenkinscalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalctest {

	@Test
	public void addTest() {
	JenkinsCalculator myCalc = new JenkinsCalculator();
	assertEquals(11,myCalc.addNumbers(6,5));
	}

	@Test
	public void subtractTest() {
	JenkinsCalculator myCalc = new JenkinsCalculator();
	assertEquals(5,myCalc.substractNumbers(10,5));
	}
}
