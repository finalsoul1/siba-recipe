package app.yummy.vo;

import lombok.Data;

@Data
public class FoodVO{
	
	
	public int id;
	public String name;
	public String smallImageLocation;
	public String bigImageLocation;
	public String ingredients;
	public float  calorie;
	public float carbohydrate;
	public float protein;
	public float fat;
	public float natrium;
	
}
