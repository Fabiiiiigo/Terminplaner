package Terminplaner_package;

public class Termin {
	private int terminId; // Termin ID
	int terminKat; //Termin Kategorie
	String terminName; // Termin Name
	boolean terminF; // Termin Finished 
	
public Termin(int terminId, String terminName, boolean terminF) { //this creates a new user object
		
		this.terminId = terminId;
		this.terminName = terminName;
		this.terminF = false;
		
	}
	
public void setTerminKat(int terminKat) {
	this.terminKat = terminKat;
}
	
public boolean updateTerminF(boolean terminF) {
	if(terminF= true) {
		terminF = true; //appointment finished true
	} else {
		terminF = false; //appointment finished not true
	}
	return terminF;	
}


}
