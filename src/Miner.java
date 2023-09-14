///////////////////////////|
//|File: Miner.java
//|Author: Jerrin C. Redmon
//|Language: Java v17
//|Version: 1.0
//|Date: August 28, 2023
///////////////////////////|

/* Description:
 * The macro of the program in charge of mining and movement
 */
 
//----------------------------------------------------------------
 
// Imports //
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**Javadocs**
 * @author Jerrin C. Redmon
 * @version 1.0
 */
public class Miner extends Thread {

	Robot miner = null;
	private double time = 0;
	
    /**
     * Constructor
     * Initializes miner
     */
	public Miner() {

		try {
			miner = new Robot();
		} 
		catch (AWTException e) {
			System.out.println("Failed to initialize miner!");
			System.exit(1);
		}
	}
	
	
	/**
	 * Sets a time duration to the miner 
	 * @param time duration of the marco
	 */
	public void initiateMiner(double time) {

		this.time = time;
	}
	
	
	/**
	 * Starts the miner
	 */
	public void run() {

		try {
			delay(5);	// 5 second delay before the program begins
			miner.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			miner.keyPress(KeyEvent.VK_W);
		    delay(time);
		}
		 catch (InterruptedException e) {
			}
		 finally {			
			miner.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			miner.keyRelease(KeyEvent.VK_W);
		}
	}
	
	
	/**
	 * Provides a delay to the miner before it start
	 * @param time duration of the delay
	 */
	private void delay(double time) throws InterruptedException {

		sleep((long)(time * 1000));
	}
}
