package lab7;

public class sinhvien {
	protected String id;
	protected String name;
	protected double price;
	protected double tax;

	public double getPriceTax() {
		return this.price * this.tax;
	}

	public sinhvien(String id, String name, double price, double tax) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

}
