package lab4;

public class pd2 {
	public static void main(String[] args) {
		product test1 = new product();
		product pr1 = test1.nhapthongtin("may tinh", 200, 0.1);
		test1.xuatthongtin(pr1);
		System.out.println("tax = " + test1.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
