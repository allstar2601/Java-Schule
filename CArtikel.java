package objekt1;

public class CArtikel {

	private int Artikelnummer;
	private float Preis;
	
	public CArtikel(int Artikelnummer, float Preis){
		this.Artikelnummer = Artikelnummer;
		this.Preis = Preis;
	}

	public int getArtikelnummer() {
		return Artikelnummer;
	}

	public void setArtikelnummer(int artikelnummer) {
		Artikelnummer = artikelnummer;
	}

	public float getPreis() {
		return Preis;
	}

	public void setPreis(float preis) {
		Preis = preis;
	}

}
