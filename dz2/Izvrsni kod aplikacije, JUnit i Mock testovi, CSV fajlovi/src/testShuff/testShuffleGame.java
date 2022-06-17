package testShuff;

import shuff.ShuffleGame;
import shuff.SecondsCounter;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class testShuffleGame {
	private static ShuffleGame shuffle=new ShuffleGame(4);
	
	
	@Test
	public void testGame() {
		shuffle.run(4);
		shuffle.startSecondsCounter();
		assertEquals(false, shuffle.analyseResult());
		
		shuffle.run(5);
		
		boolean x=true;
		int y=0;
		y=shuffle.getPosition(1);
		
		shuffle.setGameStatus(false);
		shuffle.changeButtonState(true);
		shuffle.changeButtonState(false);
		
		shuffle.showHighScoreDialog();

		Component komponenta = null;
		
		shuffle.showScoreDialog(250, 3600);
		
		shuffle.showHighScoreDialog();
		//komponenta = shuffle.getComponent(y)
	}
	
}
