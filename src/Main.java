//--------------------------------------------------
//                    Main.Java
//
// 	    Author: Jerrin C. Redmon
//
// 	     Date: February 2, 2022
// 		Version 1.0
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
 * @author Jerrin
 * @Version 1.0
 * Description: A macro autominer bot that mines for you in minecraft; Time of macro is based on selected pickaxe
 */
 
public class Main {
	public static void main(String args[]) {//Main Method
		Pickaxe pick = new Pickaxe();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a pickaxe: ");
		String choice = input.next();
		input.close();
		
		if (choice.equals("wood")){//If user types wood active miner with wood parameters
			initiateMiner(pick.woodPick());
		}
		
		if (choice.equals("stone")){//If user types stone active miner with stone parameters
			initiateMiner(pick.stonePick());
		}
		
		if (choice.equals("iron")){//If user types iron active miner with iron parameters
			initiateMiner(pick.ironPick());
		}
		
		if (choice.equals("gold")){//If user types gold active miner with gold parameters
			initiateMiner(pick.goldPick());
		}
		
		if (choice.equals("diamond")){//If user types diamond active miner with diamond parameters
			initiateMiner(pick.woodPick());
		}
		
		if (choice.equals("netherite")){//If user types netherite active miner with netherite parameters
			initiateMiner(pick.netheritePick());
		}
	}
	
	
	
	private static void initiateMiner(double time) {//Macros for the miner to press the mouse1 and w until time is up
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
	   	delay(time); 
	    	miner.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		miner.keyRelease(KeyEvent.VK_W);
	}
	
	
	
	private static void delay(double time) {//Method for the delay conversion for the miner macro
		try {
			Thread.sleep((long)(time * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
