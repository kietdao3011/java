package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<Double>();

		while (true) {
			System.out.println("Nhập vào danh sách số thực : ");
			Double x = scanner.nextDouble();
			list.add(x);
			scanner.nextLine();
			System.out.println("Nhập thêm Y/N");
			String chon = scanner.nextLine();
			if (chon.equals("n")) {
				break;
			}
		}
		System.out.println("check list : " + list);
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("tong list = " + sum);
	}
}
