package javatest;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("tên sinh viên :");
		String ten = scanner.nextLine();
		System.out.println("điểm của sinh viên : ");
		Double diem = scanner.nextDouble();
		System.out.println(ten + " có điểm = " + diem);
		scanner.close();

	}
}
