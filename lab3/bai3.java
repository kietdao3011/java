package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size;
		System.out.println("Nhập chiều dài mảng : ");
		size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Nhập dữ liệu mảng :");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		System.out.println("max = " + max);

		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("min = " + min);
	}
}
