package lab3;

import java.util.Arrays;

public class vonglapfor {
	public static void main(String[] args) {
		int a[] = { 15, 12, 11, 9, 5 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
