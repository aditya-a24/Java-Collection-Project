package eCommerceApp;

public class Product {
	String category;
	String brand;
	double price;
	
	Product(){
		
	}
	
	Product(String category, String brand, double price){
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	
	public String toString() {
		return "Category: "+category+"\tBrand: "+brand+"\tPrice: "+price;
	}
}
