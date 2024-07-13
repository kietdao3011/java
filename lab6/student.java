package lab6;

import java.util.ArrayList;

public class student {
	private String name;
	private int id;

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + "]";
	}

	public student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		student st1 = new student("nguyen viet nam ", 1);
		student st2 = new student("dang viet nam ", 2);
		student st3 = new student("dao viet nam ", 3);
		student st4 = new student("nguyen thanh nam ", 4);
		student st5 = new student("nguyen nam ", 5);

		ArrayList<student> a = new ArrayList<student>();
		a.add(st5);
		a.add(st4);
		a.add(st3);
		a.add(st2);
		a.add(st1);

		for (int i = 0; i < a.size(); i++) {
			if (a.get(i).getName().startsWith("nguyen")) {
				System.out.println("Tên bắt đầu bằng nguyen : " + a.get(i));
			}

		}

	}
}
