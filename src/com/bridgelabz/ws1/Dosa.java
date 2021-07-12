package com.bridgelabz.ws1;

public class Dosa extends FoodItem implements IVeg{
	public Dosa() {
		//		type = Type.VEG;
		taste = Taste.SALTY;
		preparationTime = 10;
		category = Category.STARTER;
		name = "Dosa";
	}
	
	public void printMainIngredient() {
		System.out.println("1.atta 2.Chatani");
	}
}
