package Mitarbeiter;

public class Angestellter extends Mitarbeiter implements IAngestellter {
	private double monatslohn;
		
	public Angestellter(String name, double monatsauszahlung) {
		super(name, monatsauszahlung);
		monatslohn = monatsauszahlung;
	}

	@Override
	public double getAbwetztiefe() {
		// TODO Auto-generated method stub
		return monatslohn / 10;
	}

}
