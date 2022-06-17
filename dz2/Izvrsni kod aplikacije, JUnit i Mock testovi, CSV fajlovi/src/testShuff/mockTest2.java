package testShuff;

import shuff.SecondsCounter;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


public class mockTest2 {
	@Mock
	SecondsCounter secCounter;
	
	@Before
	public void init() {
		secCounter=mock(SecondsCounter.class);
	}
	
	@Test
	public void testGetMinInString() {
		when(secCounter.getMinitueString(3600)).thenCallRealMethod();
		
		assertEquals("60 : 00", secCounter.getMinitueString(3600));
	}
	
	
}
