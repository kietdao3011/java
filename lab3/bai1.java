package lab3;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args) {
		System.out.println("Nhập vào số : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 2; i < a - 1; i++) {
			if (a % i == 0) {
				System.out.println("Không là số nguyên tố!");
			} else {
				System.out.println("Là số nguyên tố!");
			}
			break;
		}
		scanner.close();
	}
}
