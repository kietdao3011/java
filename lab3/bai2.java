package lab3;

import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		System.out.println("Nhập số mong muốn : ");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d", a, i, a * i);
			System.out.printf("\n");
		}
		scanner.close();
	}
}
