package tdd.training.bsk;

import static org.junit.Assert.*;

import org.junit.Test;


public class FrameTest {

	@Test
	public void testFrameGetFirstThrow() throws Exception{
		Frame frame = new Frame(2,5);
		
		assertEquals(2, frame.getFirstThrow());
		
	}
	
	@Test
	public void testFrameGetSecondThrow() throws Exception{
		Frame frame = new Frame(2,5);
		
		assertEquals(5, frame.getSecondThrow());
		
	}
	
	@Test
	public void testFrameScore7FromThrows2_5() throws Exception{
		Frame frame = new Frame(2,5);
		
		assertEquals(7, frame.getScore());
		
	}
	
	@Test
	public void testSetAndGetBonus0() throws Exception{
		Frame frame = new Frame (3,7);
		assertEquals(0, frame.getBonus());
	}
	
	@Test
	public void testSetAndGetBonus5() throws Exception{
		Frame frame = new Frame (3,7);
		frame.setBonus(5);
		assertEquals(5, frame.getBonus());
	}
	
	@Test
	public void testFrameIsSpare() throws Exception{
		Frame frame = new Frame (3,7);
		assertTrue(frame.isSpare());
	}
	
	@Test
	public void testFrameIsNotSpare() throws Exception{
		Frame frame = new Frame (2,7);
		assertFalse(frame.isSpare());
	}
	
	@Test
	public void testFrameIsStrike() throws Exception{
		Frame frame = new Frame (10,0);
		assertTrue(frame.isStrike());
	}
	
	@Test
	public void testFrameIsNotStrike() throws Exception{
		Frame frame = new Frame (9,1);
		assertFalse(frame.isStrike());
	}
	

}
