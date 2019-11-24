package foodie;

import java.util.Scanner;

public class FoodTruckReview {
	int n = 5;
	FoodTruck[] truck = new FoodTruck[n];
	int nextTruckId = 0;

	public static void main(String[] args) {
		FoodTruckReview ftr = new FoodTruckReview();
		ftr.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < truck.length; i++) {

			nextTruckId = i + 1;

			System.out.println("Please input the name of the Food truck or \"quit\" to continue. ");
			String inName = sc.next();

			if (inName.equals("quit")) {
				break;
			}

			System.out.println("Please input the food type. ");
			String fType = sc.next();

			System.out.println("Please input the rating from 1 - 10. ");
			int rate = sc.nextInt();

			truck[i] = new FoodTruck(inName, fType, rate, nextTruckId);
		}

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
		sc.close();
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
				System.out.println(truck[i].getName());
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
		System.out.println(avgRate);
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
