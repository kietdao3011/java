package lab9;

import java.util.Scanner;

public class xuli {
	public static int nhapmasv() {

		int a;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhập mã sv : ");
			try {
				a = scanner.nextInt();
				System.out.println("sinh viên đó đây ! ");
				break;
			} catch (Exception e) {

				System.out.println("sai mẹ mày rồi !");
				scanner.next();
			}
		}
		scanner.close();
		return a;

	}

	public static void main(String[] args) {

		int masv = nhapmasv();

		sinhvien sv = new sinhvien(masv, "kiet", 9.6, 20);
		System.out.println(sv);

	}
}
