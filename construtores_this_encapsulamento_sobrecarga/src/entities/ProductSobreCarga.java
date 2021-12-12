package entities;

public class ProductSobreCarga {
	
	private String name;
	private double price;
	private int quantity;
	
	public ProductSobreCarga() {
		
	}
	
	public ProductSobreCarga(String name, double price, int quatity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public ProductSobreCarga(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
}
