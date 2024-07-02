package javatest;

import java.util.Scanner;

public class baichuvi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào cạnh thứ nhất của hcn:");
		int canhnhat = scanner.nextInt();
		System.out.println("Nhập vào cạnh thứ hai của hcn:");
		int canhhai = scanner.nextInt();
		System.out.println("chu vi = " + (canhnhat + canhhai) * 2);
		System.out.println("diện tích = " + canhnhat * canhhai);
		System.out.println("cạnh nhỏ nhất = " + Math.min(canhnhat, canhhai));
		scanner.close();

	}
}
