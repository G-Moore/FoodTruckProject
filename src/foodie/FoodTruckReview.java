package foodie;

import java.util.Scanner;

public class FoodTruckReview {

	public static void main(String[] args) {
		FoodTruckReview ftr = new FoodTruckReview();
		ftr.run();
	}

	public void run() {
		System.out.println("Please input the name, food type, and rating for up to five food trucks.");
		name = sc.next();
		
		FoodTruck[] truck = new FoodTruck[5];
		for (int i = 1; i <= truck.length; i++) {
			truck[i] = new FoodTruck(name, foodType, rating);
			
		}

		Scanner sc = new Scanner(System.in);


	}

}
