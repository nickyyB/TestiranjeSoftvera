package testShuff;

import shuff.AnimatedJButton;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;

public class testAnimatedJButton {
	AnimatedJButton jb = new AnimatedJButton("Test", 4);
	
	
	@Test
	public void testSetLabelName() {
		String tekst = "Pause";
		jb.setLabelName(tekst);
		assertEquals("Pause", jb.text);
	}
	
	@Test
	public void testGetString() {
		final String tekst = "Proba";
		int broj = 2;
		assertEquals("P  r  o  b  a", jb.getString(tekst, broj));
		
	}
	
	/*@Test
	public void testMouseEvent() {
		MouseEvent clickEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED);

		EventQueue eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		eventQueue.postEvent(clickEvent);
	}*/
}
