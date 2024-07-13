package lab8;

public class student extends person {
	private int mark;
	private String grade;

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		if (this.mark >= 8)
			this.grade = "A";
		if (this.mark >= 7 && this.mark < 8)
			this.grade = "B";
		if (this.mark >= 6 && this.mark < 7)
			this.grade = "C";
		if (this.mark >= 5 && this.mark < 6)
			this.grade = "D";
		if (this.mark < 5)
			this.grade = "tạch";

	}

	public student(String id, String name, int age, int mark, String grade) {
		super(id, name, age);
		this.mark = mark;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "student [mark=" + mark + ", grade=" + grade + "]";
	}
}
