//--------------------------------------------------
//                   Pickaxe.Java
//
// 	    Author: Jerrin C. Redmon
//
// 	     Date: February 2, 2022
// 	          Version 1.0
//--------------------------------------------------

public class Pickaxe {//Determines the amount of time allotted to the miner based on pickaxe type
	private final double MARGIN_OF_ERROR = 0.63;
	private double pickSpeed;
	private double durability;
	
	public Pickaxe() {//Constructor
		pickSpeed = 0;
		durability = 0;
	}
	
	public double woodPick() {//Calculation for the time to mine with a wooden pickaxe
		pickSpeed = 1.50;
		durability = 59;
		double wood = (pickSpeed+MARGIN_OF_ERROR) * durability;
		return wood;
	}
	
	public double stonePick() {//Calculation for the time to mine with a stone pickaxe
		pickSpeed = 0.75;
		durability = 131;
		double stone = (pickSpeed+MARGIN_OF_ERROR) * durability;
		return stone;
	}
	
	public double ironPick() {//Calculation for the time to mine with a iron pickaxe
		pickSpeed = 0.50;
		durability = 150;
		double iron = (pickSpeed+MARGIN_OF_ERROR) * durability;
		return iron;
	}
	
	public double goldPick() {//Calculation for the time to mine with a gold pickaxe
		pickSpeed = 0.25;
		durability = 32;
		double gold = (pickSpeed+MARGIN_OF_ERROR) * durability;
		return gold;
	}
	
	public double diamondPick() {//Calculation for the time to mine with a diamond pickaxe
		pickSpeed = 0.40;
		durability = 1561;
		double diamond = (pickSpeed+MARGIN_OF_ERROR) * durability;
		return diamond;
	}
	
	public double netheritePick() {//Calculation for the time to mine with a netherite pickaxe
		pickSpeed = 0.35;
		durability = 2031;
		double netherite = (pickSpeed+MARGIN_OF_ERROR) * durability;
		return netherite;
	}
}
