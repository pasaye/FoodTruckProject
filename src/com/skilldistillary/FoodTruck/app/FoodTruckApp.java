package com.skilldistillary.FoodTruck.app;

import java.util.Scanner;

import com.skilldistillary.FoodTruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.welcomeMessage();
		fta.addNewTruck();

	}

//-------------------------------------------------------------------------------
	public void addNewTruck() {
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < fleet.length; i++) {

			System.out.println("Please enter truck name or quit for next menu.");
			String truckName = kb.nextLine();
			if (truckName.toLowerCase().equals("quit")) {
				break;
			}
			System.out.println("Please enter type of food.");
			String truckFood = kb.nextLine();

			System.out.println("Please Rate (Worst)1-5(Best) truck.");
			int truckRate = kb.nextInt();

			FoodTruck newTruck = new FoodTruck(truckName, truckFood, truckRate);
			fleet[i] = newTruck;
			kb.nextLine();
		}

		int userSelection = 0;
		loop: while (userSelection != 4) {
			optionMenu();
			System.out.println("Enter a number option.");
			userSelection = kb.nextInt();

			switch (userSelection) {
			case 1:
				System.out.println("Here are all your Food Trucks");
				for (int i = 0; i < fleet.length; i++) {
					if (fleet[i] != null) {
						System.out.println(fleet[i].toString());
					}
				}
				break;
			case 2:
				tuckAverage();
				break;
			case 3:
				findMax();
				break;
			case 4:
				System.out.println("Goodbye");
				break loop;
			default:
				System.out.println("Invalid entry. Enter a number 1-4.");
				break;
			}

		}

	}

	private void tuckAverage() {
		double average = 0.0;
		double sum = 0.0;
		double num = 0;
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				sum += fleet[i].getRating();
				num++;
				average = sum / num;
			}
		}
		System.out.println("The average rating or your trucks is:" + average);

	}

	private void findMax() {
		int max = fleet[0].getRating();

		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				if (fleet[i].getRating() > max) {
					max = fleet[i].getRating();
				}
				if (fleet[i].getRating() == max) {
					System.out.println(fleet[i].toString());
				}
			}
		}
	}

	public void welcomeMessage() {
		System.out.println("Welcome to Rate That Truck!");

	}

	public void optionMenu() {
		System.out.println("==============================================");
		System.out.println("|                                            |");
		System.out.println("| 1. List all existing food trucks.          |");
		System.out.println("| 2. See the average rating of food trucks.  |");
		System.out.println("| 3. Display the highest-rated food truck.   |");
		System.out.println("| 4. Quit the program.                       |");
		System.out.println("|____________________________________________|");
	}
}
