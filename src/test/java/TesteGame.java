package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import com.redomar.game.menu.Menu;

public class TesteGame {
//	Menu m = new Menu();
	
	@Test
	public void test(){
		assertEquals("Layna", "Layna");
	}
/*
	@Test
	public void testRunnable(){
		m.start();
		assertTrue(Menu.isRunning());
	}
	
	@Test
	public void testStopRunnable(){
		Menu.stop();
		assertEquals(false, Menu.isRunning());	
	}*/
}
