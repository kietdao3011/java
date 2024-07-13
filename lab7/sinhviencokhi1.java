package lab7;

public class sinhviencokhi1 extends sinhvien1 {
	private double scorecnc;
	private double scoreplc;

	@Override
	double getdiem() {
		// TODO Auto-generated method stub
		return (scorecnc + scoreplc) / 2;
	}

	public sinhviencokhi1(double scorecnc, double scoreplc) {
		this.scorecnc = scorecnc;
		this.scoreplc = scoreplc;
	}

	public double getScorecnc() {
		return scorecnc;
	}

	public void setScorecnc(double scorecnc) {
		this.scorecnc = scorecnc;
	}

	public double getScoreplc() {
		return scoreplc;
	}

	public void setScoreplc(double scoreplc) {
		this.scoreplc = scoreplc;
	}

}
