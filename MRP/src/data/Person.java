package data;

import java.util.ArrayList;

public class Person {
	//
	private static ArrayList<Person> personenListe = new ArrayList<>();
	//
	private String vorname;
	private String nachname;
	protected boolean female;
	
	
	//
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public boolean isFemale() {
		return female;
	}
	public void setFemale(boolean female) {
		this.female = female;
	}

	@Override
	public String toString() {
		return(isFemale() ? "Frau" : "Mann") + " " + getVorname() + " " + getNachname();
	}
	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}
	
}
