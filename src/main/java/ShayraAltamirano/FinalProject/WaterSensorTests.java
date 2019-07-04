package main.java.ShayraAltamirano.FinalProject;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.ShayraAltamirano.FinalProject.WaterSensor;


public class WaterSensorTests {	
	@Test
	public void set_emptyContainer_resultfalse() throws Exception {
		boolean actual= WaterSensor.setStatus(true);
		boolean expected =false;
		assertEquals(expected,actual);
	}
	@Test
	public void set_notemptyContainer_resulttrue() throws Exception {
		boolean actual= WaterSensor.setStatus(false);
		boolean expected =true;
		assertEquals(expected,actual);
	}
	
}