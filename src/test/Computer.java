package test;

/*
DTO(Data Transfer Object)
VO(Value Object)

 */
public class Computer {
	private String brand;
	private int price;
	public Computer() {}
	public Computer(String brand, int price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
