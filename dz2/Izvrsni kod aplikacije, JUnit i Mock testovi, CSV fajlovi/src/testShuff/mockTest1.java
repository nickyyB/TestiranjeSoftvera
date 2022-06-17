package testShuff;

import shuff.Credits;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class mockTest1 {

	@Mock
	Credits kredits;
	
	@Before
	public void init() {
		kredits=mock(Credits.class);
	}
	
	@Test
	public void testGetTime() {
		
		when(kredits.getTime()).thenCallRealMethod();
		
		assertEquals("", kredits.getTime());
		
	}
}
