package com.bridgelabz.ws1;

public class PaniPuri extends FoodItem implements INonVeg {
	public PaniPuri() {
//		type = Type.VEG;
		taste = Taste.SPICY;
		preparationTime =2;
		category = Category.STARTER;
		name = "PaniPuri";
	}

	@Override
	public void printMainIngredient() {
		System.out.println("1.Puri 2.Chat ");
	}
}
