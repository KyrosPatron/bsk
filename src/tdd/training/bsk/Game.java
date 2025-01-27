package tdd.training.bsk;

import java.util.ArrayList;
import java.util.List;

public class Game {
	
	private List<Frame> frames;

	/**
	 * It initializes an empty bowling game.
	 */
	public Game() {
		this.frames = new ArrayList<>();
	}

	/**
	 * It adds a frame to this game.
	 * 
	 * @param frame The frame.
	 * @throws BowlingException
	 */
	public void addFrame(Frame frame) throws BowlingException {

		if (this.frames.size()<10) this.frames.add(frame);
		else throw new BowlingException("Can't insert more than 10 frames");
	}

	/**
	 * It return the i-th frame of this game.
	 * 
	 * @param index The index (ranging from 0 to 9) of the frame.
	 * @return The i-th frame.
	 * @throws BowlingException
	 */
	public Frame getFrameAt(int index) throws BowlingException {

		if (index >=0 && index <= 9) return this.frames.get(index);	
		else throw new BowlingException("Can't get this Frame (out of range 0-9)");
		
	}

	/**
	 * It sets the first bonus throw of this game.
	 * 
	 * @param firstBonusThrow The first bonus throw.
	 * @throws BowlingException
	 */
	public void setFirstBonusThrow(int firstBonusThrow) throws BowlingException {
		// To be implemented
	}

	/**
	 * It sets the second bonus throw of this game.
	 * 
	 * @param secondBonusThrow The second bonus throw.
	 * @throws BowlingException
	 */
	public void setSecondBonusThrow(int secondBonusThrow) throws BowlingException {
		// To be implemented
	}

	/**
	 * It returns the first bonus throw of this game.
	 * 
	 * @return The first bonus throw.
	 */
	public int getFirstBonusThrow() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns the second bonus throw of this game.
	 * 
	 * @return The second bonus throw.
	 */
	public int getSecondBonusThrow() {
		// To be implemented
		return 0;
	}

	/**
	 * It returns the score of this game.
	 * 
	 * @return The score of this game.
	 * @throws BowlingException
	 */
	public int calculateScore() throws BowlingException {
		int tot=0;
		
		for (int i=0 ; i <(frames.size()); i++) {
			
			if (i < (frames.size()-1)) {
				if (frames.get(i).isSpare()) {
					frames.get(i).setBonus(frames.get(i+1).getFirstThrow());
				}else if (frames.get(i).isStrike()) {
					frames.get(i).setBonus(frames.get(i+1).getScore());
				}
			} 
			
			tot+=frames.get(i).getScore();
		}



		return tot;	
	}

}
