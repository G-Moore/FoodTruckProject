package foodie;

import java.util.Scanner;

public class FoodTruckReview {
	//int numTrucks = 0;
	FoodTruck[] truck = new FoodTruck[5];
	

	public static void main(String[] args) {
		FoodTruckReview ftr = new FoodTruckReview();
		ftr.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < truck.length; i++) {

			int nextTruckId = 1 + i;

			System.out.println("Please input the name");
			String inName = sc.next();

			if (inName.equals("quit")) {
				break;
			}

			System.out.println("Please input the food type");
			String fType = sc.next();

			System.out.println("Please input the rating");
			int rate = sc.nextInt();

			truck[i] = new FoodTruck(inName, fType, rate, nextTruckId);

			System.out.println(truck[i]);
			System.out.println(i);
			
		}
		//return numTrucks;
//		System.out.println(truck[0]);
//		System.out.println(truck[1]);
//		System.out.println(truck[2]);
//		System.out.println(truck[3]);
//		System.out.println(truck[4]);

		while (true) {

			System.out.println("Enter an option number." + "\n1 : List all existing food trucks names."
					+ "\n2 : See the average rating of food trucks." + "\n3 : Display the highest-rated food truck."
					+ "\n4 : Quit the Program.");

			int opt = sc.nextInt();

			if (opt == 1) {
				// printNames(truck);
				for (int i = 0; i < truck.length; i++) {

					System.out.println(truck[i].getName());
				}
			}
			if (opt == 2) {
				int sum = 0;
				double avgRate;
				for (int i = 0; i < truck.length; i++) {
					sum += truck[i].getRating();
				}
				avgRate = sum / truck.length;
				System.out.println(avgRate);
			}
			if (opt == 3) {
				Double hiRate = truck[0].getRating();
				for (int i = 0; i < truck.length; i++) {
					if (hiRate < truck[i].getRating()) {
						hiRate = truck[i].getRating();
					}
				}
				System.out.println("Highest rated Food Truck is " + hiRate);

			}
			if (opt == 4) {
				System.out.println("Thanks for using Food Truck Review. \n\tEat on Foodie!");
				break;
			}
		}
		sc.close();
	}

//	public void printNames(FoodTruck[] trucks) {
//	    System.out.println(e.getName());
	// }
}
