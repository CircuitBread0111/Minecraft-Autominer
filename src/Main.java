//--------------------------------------------------
//                    Main.Java
//
// 	    Authors: Jerrin C. Redmon, Will Brown
//
// 	     Date: February 2, 2022
// 	          Version 2.0
//--------------------------------------------------

/**
 * Imports
 */
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * @author Jerrin C. Redmon
 * @author Will Brown
 * @Version 2.0
 * Description: A macro autominer bot that mines for you in minecraft; Time of macro is based on selected pickaxe
 */
 
public class Main {
	public static void main(String args[]) {//Main Method
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a pickaxe: ");
		String choice = input.next();
		input.close();
		
		if (choice.equals("wood")){//If user types wood active miner with wood parameters
			initiateMiner(Pickaxe.WOOD);
		} else if (choice.equals("stone")){//If user types stone active miner with stone parameters
			initiateMiner(Pickaxe.STONE);
		} else if (choice.equals("iron")){//If user types iron active miner with iron parameters
			initiateMiner(Pickaxe.IRON);
		} else if (choice.equals("gold")){//If user types gold active miner with gold parameters
			initiateMiner(Pickaxe.GOLD);
		} else if (choice.equals("diamond")){//If user types diamond active miner with diamond parameters
			initiateMiner(Pickaxe.GOLD);
		} else if (choice.equals("netherite")){//If user types netherite active miner with netherite parameters
			initiateMiner(Pickaxe.NETHERITE);
		}
	}
	
	private static void initiateMiner(Pickaxe pick) {//Macros for the miner to press the mouse1 and w until time is up
		Robot miner = null;
		try {
			miner = new Robot();
		} catch (AWTException e) {
			System.out.println("Failed to create robot!");
			System.exit(1);
		}	
		
		delay(5);
		miner.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		miner.keyPress(KeyEvent.VK_W);
	   	delay(pick.time()); 
	    	miner.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		miner.keyRelease(KeyEvent.VK_W);
	}
	
	private static void delay(double time) {//Method for the delay conversion for the miner macro
		try {
			Thread.sleep((long)(time * 1000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
