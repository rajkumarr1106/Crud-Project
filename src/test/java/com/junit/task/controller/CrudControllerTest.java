package com.junit.task.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrudControllerTest {
   
	@Test
	void createtest() 
	{
		Controller ce = new Controller();
		String result = ce.create();
		assertEquals("100", result);
	}

	
	void readtest()
	{
		Controller rd = new Controller();
		int result = rd.read();
		assertEquals("100", result);
	}
	
	void updatetest()
	{
		Controller ue = new Controller();
		String result = ue.update();
		assertEquals("Record Updated", result);
	}
	
	void deletetest()
	{
		Controller dl = new Controller();
		String result = dl.delete();
		assertEquals("Record Deleted", result);
	}

	
}

