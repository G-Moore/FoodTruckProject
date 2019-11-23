package foodie;

public class FoodTruck {
	public String name;
	public String foodType;
	public int rating;
	public int numId;
	
	
	public FoodTruck(String name, String foodType, int rating, int numId) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.numId = numId;
	}


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


	public double getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public int getNumId() {
		return numId;
	}


	public void setNumId(int numId) {
		this.numId = numId;
	}


	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", foodType=" + foodType + ", rating=" + rating + ", numId=" + numId + "]";
	}
	
	
	
}
