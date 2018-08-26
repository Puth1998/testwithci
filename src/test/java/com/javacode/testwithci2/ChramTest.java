package com.javacode.testwithci2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ChramTest {

	Charm charm;
	
	@Before
	public void beforeCharm() {
		charm = new Charm();
		
	}
	
	@Test
	public void minimumInut() {
		int input = 0;
		boolean expectedResult = true;
		
		boolean actualResult = charm.isCondition(input);
		
		assertEquals(expectedResult, actualResult);
		
	}
	@Test
	public void middleInput() {
		int input = 5;
		boolean expectedResult = true;
		
		boolean actualResult = charm.isCondition(input);
		
		assertEquals(expectedResult, actualResult);
		
	}

	@Test
	public void maximumInput() {
		int input = 10 ;
		boolean expectedResult = true;
		
		boolean actualResult = charm.isCondition(input);
		
		assertEquals(expectedResult, actualResult);
		
	}  
	@Test
	public void overInput() {
		int input = 11 ;
		boolean expectedResult = false;
		
		boolean actualResult = charm.isCondition(input);
		
		assertEquals(expectedResult, actualResult);
		
	} 
	
	@Test
	public void lowerInput() {
		int input = -1 ;
		boolean expectedResult = false;
		
		boolean actualResult = charm.isCondition(input);
		
		assertEquals(expectedResult, actualResult);
		
	} 
	@Test
	public void processTestcase() {
		int face = 6; 
		int rich = 6;
		int nature = 8;
		int smile = 7;
		int speech = 7;
		charm.setFace(face);
		charm.setRich(rich);
		charm.setNature(nature);
		charm.setSmile(smile);
		charm.setSpeech(speech);
		
		double expectedResult = 62.961;
		
		double actualResult = charm.process();
		
		assertEquals(expectedResult, actualResult, 3);
	} 
}
