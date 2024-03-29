package foodie;

import java.util.Scanner;

public class FoodTruckReview {
	
	private int n = 5;
	private FoodTruck[] truck = new FoodTruck[n];

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckReview ftr = new FoodTruckReview();
		ftr.run();
	}

	public void run() {
		printInput();
		printWhile();

		sc.close();
	}

	private void printWhile() {
		while (true) {
			printMenu();
			int opt = sc.nextInt();

			if (opt == 1) {
				printNames();
			}
			if (opt == 2) {
				printAvgRate();
			}
			if (opt == 3) {
				printHiRate();
			}
			if (opt == 4) {
				printExit();
				break;
			}
		}
	}

	private void printInput() {
		for (int i = 0; i < truck.length; i++) {

			System.out.println("\t\tWelcome to Food Truck Review");
			System.out.println("Please input the name of the Food truck or \"quit\" to continue. ");
			String inName = sc.next();

			if (inName.equals("quit")) {
				break;
			}

			System.out.println("Please input the food type. ");
			String fType = sc.next();

			System.out.println("Please input the rating from 1 - 10. ");
			int rate = sc.nextInt();

			truck[i] = new FoodTruck(inName, fType, rate, 0);
		}
	}

	private void printExit() {
		System.out.println("Thanks for using Food Truck Review. \n\tEat on Foodie!");
	}

	private void printMenu() {
		System.out.println("Enter an option number." + "\n1 : List all existing food trucks names."
				+ "\n2 : See the average rating of food trucks." + "\n3 : Display the highest-rated food truck."
				+ "\n4 : Quit the Program.");
	}

	private void printNames() {
		for (int i = 0; i < truck.length; i++) {
			if (truck[i] != null)
				System.out.println(truck[i].toString());
		}
	}

	private void printAvgRate() {
		double sum = 0;
		double avgRate;
		int avgCount = 0;
		for (int i = 0; i < truck.length; i++) {
			if (truck[i] != null) {
				sum += truck[i].getRating();
				avgCount = i;
			}
		}
		avgRate = sum / (truck[avgCount].getNumId());
		System.out.println("The average rating is: " + avgRate);
	}

	private void printHiRate() {
		double hiRate = truck[0].getRating();
		int count = 0;
		for (int i = 0; i < truck.length; i++) {
			if (truck[i] != null)
				if (hiRate < truck[i].getRating()) {
					hiRate = truck[i].getRating();
					count = i;
				}
		}
		System.out
				.println("The highest rated Food Truck is " + truck[count].getName() + "\nWith a rating of: " + hiRate);
	}
}
