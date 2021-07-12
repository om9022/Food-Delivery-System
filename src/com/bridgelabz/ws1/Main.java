package com.bridgelabz.ws1;

import java.util.Scanner;

public class Main {
	FoodManager foodManager = new FoodManager();

	public static void main(String[] args) {
		Biryani biryani = new Biryani();
		biryani.price = 150;
		Biryani biryani1 = new Biryani();
		biryani1.price = 150;
		AppleJuice appleJuice = new AppleJuice();
		appleJuice.price = 25;
		Dosa dosa = new Dosa();
		dosa.price = 40;
		PaniPuri paniPuri = new PaniPuri();
		paniPuri.price = 30;

		Main mainObj = new Main();
		mainObj.foodManager.add(appleJuice);

		mainObj.foodManager.add(dosa);
		mainObj.foodManager.add(appleJuice);
		mainObj.foodManager.add(biryani);
		mainObj.foodManager.add(biryani);
		mainObj.foodManager.add(biryani1);
		mainObj.foodManager.add(paniPuri);

		mainObj.foodManager.printFoodItems();
		System.out.println(mainObj.foodManager.getFoodCount());
		mainObj.foodManager.delete(paniPuri);
		mainObj.foodManager.printAllNonVegItem();
		mainObj.foodManager.printAllVegItem1();
		mainObj.showMenu();
		mainObj.foodManager.printFoodItems();
	}

	void showMenu() {
		System.out.println("1.To update The Food item");
		Scanner scanner = new Scanner(System.in);
		int userinput = scanner.nextInt();
		switch(userinput) {
		case 1:
			updateFooditem();
			break;

		}
	}

	private void updateFooditem() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the food Item to be update");
		String item = scanner.nextLine();
		FoodItem foodItem = foodManager.getFoodItem(item);
		System.out.println(foodItem);

		//		int parameter = 0 ;
		//		while(parameter != 5) {

		System.out.println("Enter 1 to change teste ");
		System.out.println("Enter 2 to change Preparation time ");
		System.out.println("Enter 3 category ");
		System.out.println("Enter 4 Name ");
		System.out.println("Enter 5 to return to main menu");
		int choice = scanner.nextInt();

		switch(choice) {
		case 1:
			updateTaste(foodItem);
			break;
		case 2:
			System.out.println("Enter new price: ");
			float price = scanner.nextFloat();
			foodItem.price = price;
		}
		//		}
	}
	private void updateTaste(FoodItem foodItem) {
		System.out.println(" to change teste");
		System.out.println(" Press 1 for SPICY");
		System.out.println(" Press 2 for SWEET ");
		System.out.println(" Press 3 for SALTY ");
		System.out.println(" Press 4 for SPICY_SALTY ");
		Scanner scanner = new Scanner(System.in);
		int teste = scanner.nextInt();

		switch (teste) {
		case 1: 
			foodItem.taste = FoodItem.Taste.SPICY;
			break;
		case 2: 
			foodItem.taste = FoodItem.Taste.SWEET;
			break;
		case 3:
			foodItem.taste = FoodItem.Taste.SWEET;
		case 4:
			foodItem.taste = FoodItem.Taste.SPICY_SALTY;
			break;
		default:
			System.out.println("enter right Taste");
			break;
		}
	}
}
