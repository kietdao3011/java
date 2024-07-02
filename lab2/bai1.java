package lab2;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		System.out.println("Ta có ax + b = 0");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào giá trị của a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào giá trị của b: ");
		int b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("Phương trình vô số nghiệm ");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			System.out.println("x = " + -b / a);
		}
		scanner.close();

	}
}
