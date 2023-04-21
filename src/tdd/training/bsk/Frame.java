package tdd.training.bsk;

import java.util.Objects;

public class Frame {

	private int firstThrow;
	private int secondThrow;
	private int bonus;
	
	/**
	 * It initializes a frame given the pins knocked down in the first and second
	 * throws, respectively.
	 * 
	 * @param firstThrow  The pins knocked down in the first throw.
	 * @param secondThrow The pins knocked down in the second throw.
	 * @throws BowlingException
	 */
	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		this.firstThrow=firstThrow;
		this.secondThrow=secondThrow;
		this.bonus=0;
		
	}

	/**
	 * It returns the pins knocked down in the first throw of this frame.
	 * 
	 * @return The pins knocked down in the first throw.
	 */
	public int getFirstThrow() {
		
		return this.firstThrow;
	}

	/**
	 * It returns the pins knocked down in the second throw of this frame.
	 * 
	 * @return The pins knocked down in the second throw.
	 */
	public int getSecondThrow() {
		// To be implemented
		return this.secondThrow;
	}

	/**
	 * It sets the bonus of this frame.
	 *
	 * @param bonus The bonus.
	 */
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}

	/**
	 * It returns the bonus of this frame.
	 *
	 * @return The bonus.
	 */
	public int getBonus() {
		return this.bonus;
	}

	/**
	 * It returns the score of this frame (including the bonus).
	 * 
	 * @return The score
	 */
	public int getScore() {
		
		return (this.firstThrow + this.secondThrow + this.bonus);
	}

	/**
	 * It returns whether, or not, this frame is strike.
	 * 
	 * @return <true> if strike, <false> otherwise.
	 */
	public boolean isStrike() {
		if (this.firstThrow==10) return true;
		return false;
	}

	/**
	 * It returns whether, or not, this frame is spare.
	 * 
	 * @return <true> if spare, <false> otherwise.
	 */
	public boolean isSpare() {
		if ((this.firstThrow<10) && (this.getScore()==10)) return true;
		
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstThrow, secondThrow);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Frame other = (Frame) obj;
		return firstThrow == other.firstThrow && secondThrow == other.secondThrow;
	}
	



}
