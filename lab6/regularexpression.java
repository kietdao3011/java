package lab6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập gì đó đi : ");
		String a = scanner.nextLine();
		Pattern pattern = Pattern.compile("[0-9]{6,}");
		Matcher matcher = pattern.matcher(a);
		System.out.println("điều kiện : " + matcher.matches());
	}
}
