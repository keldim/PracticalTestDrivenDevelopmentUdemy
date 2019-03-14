package com.chrisyoo.tautology;
import static org.junit.Assert.*;

import org.junit.Test;

import com.chrisyoo.tautology.NumberValidator;


public class NumberValidatorTests {

	@Test
	public void checkPrimeNumbers() {
		NumberValidator validator = new NumberValidator();
		Integer numbers[] = {1, 23, 61, 79};
		
		for (int i = 0; i < numbers.length; i++) {
			assertEquals(true, validator.isItPrime(numbers[i]));
		}
	}
	
	@Test
	public void checkNonPrimeNumbers() {
		NumberValidator validator = new NumberValidator();
		Integer numbers[] = {15, 25, 60, 63, 207};
		
		for (int i = 0; i < numbers.length; i++) {
			assertEquals(false, validator.isItPrime(numbers[i]));
		}
	}

}
