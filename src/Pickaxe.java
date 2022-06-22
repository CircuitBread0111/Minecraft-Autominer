//--------------------------------------------------
//                   Pickaxe.Java
//
// 	    Authors: Jerrin C. Redmon, Will Brown
//
// 	     Date: February 2, 2022
// 	          Version 2.0
//--------------------------------------------------

public class Pickaxe {//Determines the amount of time allotted to the miner based on pickaxe type
	private final double MARGIN_OF_ERROR = 0.63;
	private double pickSpeed;
	private int durability;

	public static final Pickaxe WOOD = new Pickaxe(1.50, 59);
	public static final Pickaxe STONE = new Pickaxe(0.75, 131);
	public static final Pickaxe IRON = new Pickaxe(0.05, 150);
	public static final Pickaxe GOLD = new Pickaxe(0.25, 32);
	public static final Pickaxe DIAMOND = new Pickaxe(0.40, 1561);
	public static final Pickaxe NETHERITE = new Pickaxe(0.35, 2031);
	
	public Pickaxe(double pickSpeed, int durability) {//Constructor
		this.pickSpeed = pickSpeed;
		this.durability = durability;
	}

	public double time() {
		return (pickSpeed + MARGIN_OF_ERROR) * durability;
	}
}
