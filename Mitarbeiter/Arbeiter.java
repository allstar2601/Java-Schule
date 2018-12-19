package Mitarbeiter;

public class Arbeiter extends Mitarbeiter {

	private double Stundenlohn;
	private double Monatslohn;

	public Arbeiter(String name, double monatsauszahlung, double stundenlohn) {
		super(name, monatsauszahlung);
		Stundenlohn = stundenlohn;

	}

	public double getMonatslohn() {
		return Stundenlohn * 160;
	}

	public double getStundenlohn() {
		return Stundenlohn;
	}

	public void setStundenlohn(double stundenlohn) {
		Stundenlohn = stundenlohn;
	}

}
