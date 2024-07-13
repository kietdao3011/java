package lab4;

public class product {
	private String name;
	private double price;
	private double tax;

	public product() {

	}

	public product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public product nhapthongtin(String name, double price, double tax) {
		product test = new product(name, price, tax);
		return test;
	}

	public void xuatthongtin(product pr) {
		System.out.println("name = " + pr.getName() + " price =" + pr.getPrice() + " tax = " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

}
