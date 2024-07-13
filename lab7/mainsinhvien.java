package lab7;

public class mainsinhvien {
	public static void main(String[] args) {
		sinhvienIT a = new sinhvienIT("java", "123", "kiet", 10, 0.1);
		System.out.println("check : " + a.name);

		sinhviencokhi b = new sinhviencokhi("java", "123", "kiet", 10, 0.1);
		System.out.println("check = " + b.id);
	}
}
