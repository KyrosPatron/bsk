package tdd.training.bsk;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameTest {
	private Game game = new Game();
	
	@Before
	public void setUp() throws BowlingException{
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
	}
	
	
	@Test(expected = BowlingException.class)
	public void testAddMore10Frames() throws BowlingException{
		game.addFrame(new Frame(0,10));
	}
	
	
	@Test
	public void testGetFrameInRange() throws BowlingException{
		game.getFrameAt(2);
		
	}
	
	@Test(expected = BowlingException.class)
	public void testGetFrameNotInRange() throws BowlingException{
		game.getFrameAt(10);
	}
	
	@Test
	public void testGetThirdFrame() throws BowlingException{
		Frame frameExp = new Frame(7,2);
		Frame myFrame = game.getFrameAt(2);
		assertTrue(myFrame.equals(frameExp));
		
	}

	


}
