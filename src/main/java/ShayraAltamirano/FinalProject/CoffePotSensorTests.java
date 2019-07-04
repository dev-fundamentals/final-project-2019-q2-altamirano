package main.java.ShayraAltamirano.FinalProject;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ShayraAltamirano.FinalProject.CoffePotSensor;


public class CoffePotSensorTests {	
	@Test
	public void set_emptyCoffeeContainer_resultfalse() throws Exception {
		boolean actual= CoffePotSensor.setStatus(false,true);
		boolean expected =false;
		assertEquals(expected,actual);
	}
	@Test
	public void set_notPlacedCoffeeContainer_resultfalse() throws Exception {
		boolean actual= CoffePotSensor.setStatus(true,false);
		boolean expected =false;
		assertEquals(expected,actual);
	}
	@Test
	public void set_notPlacedEmptyCoffeeContainer_resultfalse() throws Exception {
		boolean actual= CoffePotSensor.setStatus(false,false);
		boolean expected =false;
		assertEquals(expected,actual);
	}
	@Test
	public void set_PlacednotEmptyCoffeeContainer_resultfalse() throws Exception {
		boolean actual= CoffePotSensor.setStatus(true,true);
		boolean expected =true;
		assertEquals(expected,actual);
	}
	
}