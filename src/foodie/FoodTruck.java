package foodie;

public class FoodTruck {
	private static int nextTruckId = 1;
	private String name;
	private String foodType;
	private int rating;
	private int numId;
	
	protected FoodTruck() {
		
	}
	
	protected FoodTruck(String name, String foodType, int rating, int numId) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.numId = nextTruckId++;
		
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getFoodType() {
		return foodType;
	}


	protected void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	protected double getRating() {
		return rating;
	}


	protected void setRating(int rating) {
		this.rating = rating;
	}


	protected int getNumId() {
		return numId;
	}


	protected void setNumId(int numId) {
		this.numId = numId;
	}


	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", numId=" + numId + "]";
	}
	
	
	
}
