package foodie;

import java.util.Scanner;

public class FoodTruckReview {

	public static void main(String[] args) {
		FoodTruckReview ftr = new FoodTruckReview();
		ftr.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		// name = sc.next();

		// while(true) {
		FoodTruck[] truck = new FoodTruck[5];
		for (int i = 0; i <= 1; i++) {
			int nextTruckId = 1 + i;
			System.out.println("Please input the name");
			String inName = sc.next();
			
			System.out.println("Please input the food type");
			String fType = sc.next();
			System.out.println("Please input the rating");
			int rate = sc.nextInt();
			truck[i] = new FoodTruck(inName, fType, rate, nextTruckId);
			System.out.println(truck[i]);
			System.out.println(i);
		}

		System.out.println(truck[0]);
		System.out.println(truck[1]);
		System.out.println(truck[2]);
		System.out.println(truck[3]);
		System.out.println(truck[4]);
		
		System.out.println("Enter an option number."
				+ "\n1 : List all existing food trucks names."
				+ "\n2 : See the average rating of food trucks."
				+ "\n3 : Display the highest-rated food truck."
				+ "\n4 : Quit the Program.");
	}
}
