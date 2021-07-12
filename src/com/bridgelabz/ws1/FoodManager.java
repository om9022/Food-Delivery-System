package com.bridgelabz.ws1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FoodManager {

	Set<FoodItem> foodList = new HashSet();

	public void add(FoodItem foodItem){
		foodList.add(foodItem);
	}

	void printFoodItems() {
		for(FoodItem Items: foodList) {
			System.out.println(Items);
		}
	}

	public void delete(FoodItem foodItem) {
		foodList.remove(foodItem);
	}

	public int getFoodCount() {
		return foodList.size();
	}

	public void printAllVegItem1() {

		for(FoodItem elements: foodList) {
			if(elements instanceof IVeg) {
				System.out.println(elements);
			}
		}
	}

	FoodItem getFoodItem(String name) {
		Iterator iterator = foodList.iterator();
		for(FoodItem elements : foodList) {
			if (iterator.hasNext() ) {
				FoodItem foodItem = (FoodItem) iterator.next();
				if(foodItem.name.equals(name)) {
					return foodItem;
				}
			}
		}
		return null;
	}

	public void printAllNonVegItem() {
		for(FoodItem elements: foodList) {
			if(elements instanceof INonVeg) {
				System.out.println(elements);
			}
		}
	}
}