package Mitarbeiter;

public class Mitarbeiter implements IMitarbeiter {

	private String Name;
	private double Monatsauszahlung;

	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	public Mitarbeiter(String name, double monatsauszahlung) {
		super();
		Name = name;
		Monatsauszahlung = monatsauszahlung;
	}

	public double getMonatsauszahlung() {
		// TODO Auto-generated method stub
		return Monatsauszahlung;
	}

	public void setName(String name) {
		Name = name;
	}

	public void setMonatsauszahlung(double monatsauszahlung) {
		Monatsauszahlung = monatsauszahlung;
	}

}
