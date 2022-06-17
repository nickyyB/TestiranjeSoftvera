package testShuff;

import shuff.AnimatedJButton;
import shuff.ShuffleGame;

import org.junit.*;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;



public class mockTest3 {
	
	@Mock
	ShuffleGame game;
	
	@Before
	public void init() {
		game=mock(ShuffleGame.class);
	}

	
	@Test
	public void testFooterPanel() {
		JLabel l=null;
		when(game.getComponentIfPossibleToMove(1)).thenCallRealMethod();
		
		assertEquals(l, game.getComponentIfPossibleToMove(1));
	}
}
