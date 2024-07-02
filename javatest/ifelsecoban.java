package javatest;

import java.util.Scanner;

public class ifelsecoban {
	public static void main(String[] args) {
		System.out.println("Lựa chọn tính năng ");
		System.out.println("++------------++");
		System.out.println("|1.Cộng        |");
		System.out.println("|1.Trừ         |");
		System.out.println("|1.Kết thúc    |");
		System.out.println("++------------++");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là: ");
		int luachon = scanner.nextInt();
		if (luachon == 1) {
			System.out.println("Bạn đã lựa chọn phép cộng ");
		} else if (luachon == 2) {
			System.out.println("Bạn đã lựa chọn phép trừ ");
		} else if (luachon == 3) {
			System.out.println("Bạn đã lựa chọn thoát chương trình ");
			System.exit(0);
		}
		scanner.close();
	}
}
