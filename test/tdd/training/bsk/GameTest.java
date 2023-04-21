package tdd.training.bsk;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	
	
	@Test(expected = BowlingException.class)
	public void testAddMore10Frames() throws BowlingException{
		Game game = new Game();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(7,2));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(4,4));
		game.addFrame(new Frame(5,3));
		game.addFrame(new Frame(3,3));
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(8,1));
		game.addFrame(new Frame(2,6));
		
		game.addFrame(new Frame(0,10));
	}
	
	
	@Test
	public void testGetFrameInRange() throws BowlingException{
		Game game = new Game();
		game.addFrame(new Frame(1,5));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(7,2));
		game.addFrame(new Frame(3,6));
		game.addFrame(new Frame(4,4));
		game.addFrame(new Frame(5,3));
		game.addFrame(new Frame(3,3));
		game.addFrame(new Frame(4,5));
		game.addFrame(new Frame(8,1));
		game.addFrame(new Frame(2,6));
		
		game.getFrameAt(2);
		
	}
	



	


}
