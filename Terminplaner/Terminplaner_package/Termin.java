package Terminplaner_package;

public class Termin {
	int vorgangsNr; // Termin ID
	int anzahlKat; // Termin Kategorie
	int anzahlDok; // Anzahl Dokument
	// String terminName; // Termin Name
	// boolean terminF; // Termin Finished
	double terminStd = 00.00; // zbsp 16.00
	double terminTag = 00.00; // zbsp 05.11

	public Termin(int vorgangsNr, int anzahlKat, int anzahlDok) { // this creates a new user object

		this.vorgangsNr = vorgangsNr;
		this.anzahlKat = anzahlKat;
		this.anzahlDok = anzahlDok;
	}

	public void setanzahlKat(int anzahlKat) {
		this.anzahlKat = anzahlKat;
	}

	public int getAnzahlDok() {
		return anzahlDok;
	}

	public int getVorgangsNr() {
		return vorgangsNr;
	}

	public double getTerminStd() {
		return terminStd;
	}

	public double getTerminTag() {
		return terminTag;
	}

}
