package com.bridgelabz.ws1;

public class AppleJuice extends FoodItem implements IVeg{
	public AppleJuice() {
//		type = Type.VEG;
		taste = Taste.SWEET;
		preparationTime = 20;
		category = Category.JUICES;
		name = "Apple Juice.";
	}
	
	public void printMainIngredient(){
		System.out.println("1.Apple 2.Sugar ");
	}
}
