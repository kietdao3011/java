package lab2;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		System.out.println("Cho phương trình ax^2 + bx + c = 0");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào giá trị của a: ");
		int a = scanner.nextInt();
		System.out.println("Nhập vào giá trị của b: ");
		int b = scanner.nextInt();
		System.out.println("Nhập vào giá trị của c: ");
		int c = scanner.nextInt();
		if (a == 0) {
			System.out.println("xét b và c ");
			if (b == 0 && c == 0) {
				System.out.println("Phương trình vô số nghiệm ");
			} else if (b == 0 && c != 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				System.out.println("x = " + -c / b);
			}
		} else {

			System.out.println("Ta có delta = " + (b * b - 4 * a * c));
			if ((b * b - 4 * a * c) < 0) {
				System.out.println("Phương trình vô nghiệm ");
			} else if ((b * b - 4 * a * c) == 0) {
				System.out.println("Nghiệm kép : " + -b / (2 * a));
			} else if ((b * b - 4 * a * c) > 0) {
				System.out.println("x1 = " + (-b + Math.sqrt((b * b - 4 * a * c))) / (2 * a) + " x2 = "
						+ (-b + Math.sqrt((b * b - 4 * a * c))) / (2 * a));
			}

		}
		scanner.close();
	}
}
