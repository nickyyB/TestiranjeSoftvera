package testShuff;

import shuff.Credits;
import org.junit.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.lang.reflect.InvocationTargetException;

public class testCredits {
	private static Credits objekat, objekat2;
	
	@Before
	public void testKonstruktor() {
		objekat = new Credits(1,2,3);
		objekat2 = new Credits(0, 1, 2);
	}
	
	@Test
	public void testGetSeconds() {
		assertEquals(1, objekat.getTimeInSeconds());
	}
	
	@Test
	public void testGetMoves() {
		assertEquals(2, objekat.getMoves());
	}
	
	@Test
	public void testGetLevel() {
		assertEquals(3, objekat.getLevel());
	}
	
	@Test
	public void testGetPlayer() {
		assertEquals("", objekat.getPlayer());
	}
	
	@Test
	public void testSetPlayer() {
		String igrac = "Nikola";
		objekat.setPlayer(igrac);
		assertEquals(igrac, objekat.getPlayer());
	}
	
	@Test
	public void testGetTime() {
		assertEquals("0:1", objekat.getTime());
		assertEquals("", objekat2.getTime());
	}
	
	@Test
	public void testCompare() {
		double d1=7.0;
		double d2=5.0;
		assertEquals(1, objekat.compare(d1, d2));
		
		d1=7.0;
		d2=5.0;
		assertEquals(-1, objekat.compare(d2, d1));
		
		d1=7.0;
		d2=7.0;
		assertEquals(0, objekat.compare(d2, d1));
		
		int D1=7;
		int D2=5;
		assertEquals(1, objekat.compare(D1, D2));
		
		D1=7;
		D2=5;
		assertEquals(-1, objekat.compare(D2, D1));
		
		D1=7;
		D2=7;
		assertEquals(0, objekat.compare(D2, D1));
	}
	
	@Test
	public void testCompareTo() {
		assertEquals(1,objekat.compareTo(objekat2));
		assertEquals(-1,objekat2.compareTo(objekat));
		
		Credits obj = new Credits(0,2,3);
		assertEquals(1, obj.compareTo(objekat2));
		
		Credits objekat3 = new Credits(0, 1, 3);
		assertEquals(0, objekat3.compareTo(objekat2));
	}
	
	
	@ParameterizedTest
	@CsvFileSource(resources="test.csv")
	public void testCSVCompare(double b1, double b2, int Rez)  {
		assertNotNull(b1);
		assertNotNull(b2);
		assertNotNull(Rez);
		Credits o = new Credits(1,1,1);
		int x=o.compare(b1, b2);
		assertEquals(x, Rez);
	}

}
