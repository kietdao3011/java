package lab7;

public class sinhvienIT1 extends sinhvien1 {
	private double scorejava;
	private double scorehtml;

	@Override
	double getdiem() {
		// TODO Auto-generated method stub
		return (scorejava * 2 + scorehtml) / 3;
	}

	public sinhvienIT1(double scorejava, double scorehtml) {
		this.scorehtml = scorehtml;
		this.scorejava = scorejava;
	}

	public double getScorejava() {
		return scorejava;
	}

	public void setScorejava(double scorejava) {
		this.scorejava = scorejava;
	}

	public double getScorehtml() {
		return scorehtml;
	}

	public void setScorehtml(double scorehtml) {
		this.scorehtml = scorehtml;
	}

}
