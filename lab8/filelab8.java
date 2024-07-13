package lab8;

public class filelab8 {
	public static void main(String[] args) {
		System.out.println("HELLO ");
		student a = new student("123", "kiet", 20, 3, " ");
		System.out.println("check : " + a);
		a.setGrade(null);
		System.out.println("check 2 : " + a);
	}
}
