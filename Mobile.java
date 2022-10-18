package collection_Streams;

public class Mobile {
	private int price;
	private String brand;
	private boolean isWarranty;
	private String color;
	private String model;
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setWarranty(boolean isWarranty) {
		this.isWarranty = isWarranty;
	}
	public boolean getWarranty() {
		return isWarranty;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public Mobile (int price, String brand, boolean isWarranty, String color, String model) {
		this.price = price;
		this.brand = brand;
		this.isWarranty = isWarranty;
		this.color = color;
		this.model = model;
	}
	public String toString() {
		return "Price = "+price+" Brand = "+brand+" Is Warranty = "+isWarranty+" Color = "+color+" Model = "+model;
	}
}
