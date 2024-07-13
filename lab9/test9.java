package lab9;

import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Nhập x = ");
			try {
				int x = scanner.nextInt();
				try {
					System.out.println("kết quả 10/x = " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("lỗi k chia được cho " + x);
				}
			} catch (Exception e) {
				scanner.next();
				System.out.println("lỗi kp số nguyên !");
			}
		}

	}
}
