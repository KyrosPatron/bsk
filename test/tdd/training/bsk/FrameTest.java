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
	

}
