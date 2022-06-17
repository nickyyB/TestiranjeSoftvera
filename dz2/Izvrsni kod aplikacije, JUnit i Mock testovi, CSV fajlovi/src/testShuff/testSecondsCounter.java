package testShuff;

import shuff.SecondsCounter;
import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.swing.JLabel;

public class testSecondsCounter {
	private static SecondsCounter SC = new SecondsCounter();
	
	@Test
	public void testInitCoutner() {
		//SC.initCounter();
		assertEquals(0, SC.getTimeElapsedInSeconds());
	}
	
	@Test
	public void testSetLable() {
		JLabel labela = new JLabel("Test");
		
		SC.setLabel(labela);
		assertEquals(labela, SC.secondsCounterLabel);
	}
	
	@Test
	public void testFinalize() {
		SC.finalize();
		assertEquals(null, SC.timer_);
	}
	
	@Test
	public void testGetMinitueString() {
		int vreme = 3600;
		assertEquals("60 : 00", SC.getMinitueString(vreme));
		
		vreme = 44;
		assertEquals("00 : 44", SC.getMinitueString(vreme));
	}
	
	@Test
	public void testGetTimeElapsed() throws InterruptedException {
		assertEquals("00 Minutes & 00 Seconds ", SC.getTimeElapsed());
		
		SecondsCounter SC2 = new SecondsCounter();
		SC2.stop();
		
		assertEquals("00 Minutes & 00 Seconds ", SC2.getTimeElapsed());
		
		SC2.pause();
		assertEquals("00 Minutes & 00 Seconds ", SC.getTimeElapsed());
		
		
		SC2.enable();
		Thread.sleep(10000);
		assertEquals("00 Minutes & 01 Seconds ", SC2.getTimeElapsed());
		
	}
	
	@ParameterizedTest
	@CsvFileSource(resources="test2.csv")
	public void testMinutiUString(int sekunde, String trajanje) {
		assertNotNull(sekunde);
		assertNotNull(trajanje);
		String minuti = SC.getMinitueString(sekunde);
		assertEquals(minuti, trajanje);
	}
}
