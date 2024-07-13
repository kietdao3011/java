package lab6;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập username : ");
		String a = scanner.nextLine();
		System.out.println("Nhập password : ");
		String b = scanner.nextLine();
		if (a.equals("kietdao") || b.length() > 6) {
			System.out.println("hợp lệ");
		} else {
			System.out.println("không hợp lệ ");
		}

	}
}
