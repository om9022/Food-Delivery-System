package com.bridgelabz.ws1;
class Biryani extends FoodItem implements INonVeg{
    public Biryani() {
//        type = Type.NON_VEG;
        taste = Taste.SPICY;
        preparationTime = 45;
        category = Category.MAINCOURSE;
        name = "Biryani.";
    }
    
    public void printMainIngredient() {
    	System.out.println("1.Chicken ");
    }
}

