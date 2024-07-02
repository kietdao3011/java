package lab2;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		System.out.println("Nhập vào số điện : ");
		Scanner scanner = new Scanner(System.in);
		int sodien = scanner.nextInt();
		if (sodien <= 100) {
			System.out.println("số tiền : " + sodien * 1000);
		} else {
			System.out.println("số tiền : " + 100 * 1000 + (sodien - 100) * 1500);

		}
		scanner.close();
	}
}
