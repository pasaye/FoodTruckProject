package com.skilldistillary.FoodTruck.entities;

public class FoodTruck {
	private int truckId;
	private String name;
	private String foodType;
	private int rating;
	private static int truckIdCounter;
	//private final int truckId = (int) (Math.random() * (100-10) +10);
	
//----------------Object/Object fields----------------------------------

	public FoodTruck(String name, String foodType, int rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		
		truckIdCounter++;
		truckId = truckIdCounter;
	}

	public FoodTruck() {
		
	}
	
//----------------Constructors------------------------------------------	
	public String getName() {
		return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return this.rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
//----------------getters and setters-----------------------------------

	
	public String toString() {
		String output = "FoodTruck [name = " + this.name + "ID#" + truckId + " foodType = " + this.foodType + ", rating = " + this.rating + "]";
		return output; 
	}
	
//---------------display------------------------------------------------
}
