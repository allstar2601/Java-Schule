package Mitarbeiter;

public class Schlipstraeger extends Angestellter {
	private double monatslohn;
	private String Krawattenfarbe;
	public Schlipstraeger(String name, double monatsauszahlung, double monatslohn, String krawattenfarbe) {
		super(name, monatsauszahlung);
		this.monatslohn = monatslohn;
		Krawattenfarbe = krawattenfarbe;
	}

	public double getMonatslohn() {
		return monatslohn;
	}

	public void setMonatslohn(double monatslohn) {
		this.monatslohn = monatslohn;
	}

	public String getKrawattenfarbe() {
		return Krawattenfarbe;
	}

	public void setKrawattenfarbe(String krawattenfarbe) {
		Krawattenfarbe = krawattenfarbe;
	}

	

	public Schlipstraeger(String name, double monatsauszahlung) {
		super(name, monatsauszahlung);
		monatslohn = monatsauszahlung;
	}

	public double getAbwetztiefe() {
		if (Krawattenfarbe == "schwarz") {
			return monatslohn / 900;
		} else

			return monatslohn / 800;
	}
}
