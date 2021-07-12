package com.bridgelabz.ws1;

import java.util.Objects;

interface IVeg{

}

interface INonVeg{
	
}

public abstract class FoodItem {
	enum Taste {SPICY , SWEET, SALTY, SPICY_SALTY};
	enum Category {MAINCOURSE, STARTER, JUICES, DESERT}
//	enum Type {VEG , NON_VEG}

//	Type type;
	Taste taste;
	float price;
	byte preparationTime;
	Category category;
	String name;
	
	@Override
	public String toString() {
		return "FoodItem{" +
				"name=" + name +
				", type=" +
				", taste=" + taste +
				", price= " + price +
				", preparationTime=" + preparationTime +
				", category=" + category +
				'}';
	}
	
	public abstract void printMainIngredient();
	
	@Override
	public int hashCode() {
		return Objects.hash(category, name, preparationTime, price, taste);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItem other = (FoodItem) obj;
		return category == other.category && Objects.equals(name, other.name)
				&& preparationTime == other.preparationTime
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price) && taste == other.taste;
	}
}
