package Mitarbeiter;

public class Bucklern extends Angestellter {
	private double monatslohn;

	public Bucklern(String name, double monatsauszahlung) {
		super(name, monatsauszahlung);
		this.monatslohn = monatsauszahlung * 0.9;
	}
	public double getAbwetztiefe(){
		return monatslohn / 1000;
		
	}
}
