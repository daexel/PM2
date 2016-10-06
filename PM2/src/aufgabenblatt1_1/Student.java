/**
 * PM2 Praktikum Aufgabenblatt 1.1
 * @author Phillip Beck, Michel Gerlach
 */
package aufgabenblatt1_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Klasse zum Erfassen von Studenten anhand des Vornamens, Nachnamens,
 * Matrikelnummer und Prüfungsleistungen
 *
 */
public class Student implements Comparable<Student>, Comparator<Student> {
	private String vorname;
	private String nachname;
	private int matrikelnummer;
	private List<Pruefungsleistung> ListePruefungsleistungen;

	public Student(String vorname, String nachname, int matrikelnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
	}

	public Student(String vorname, String nachname, int matrikelnummer, Pruefungsleistung... pruefungsleistungen) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.matrikelnummer = matrikelnummer;
		this.ListePruefungsleistungen = new ArrayList<Pruefungsleistung>(pruefungsleistungen.length);
		for (int i = 0; i < pruefungsleistungen.length; i++) {
			ListePruefungsleistungen.add(pruefungsleistungen[i]);
		}
	}

	/**
	 * Gibt die Informationen des Studenten als String zurueck.
	 */
	public String toString() {
		return "Vorname: " + vorname + "\n" + "Nachname: " + nachname + "\n" + "Matrikelnummer: " + matrikelnummer
				+ "\n" + "Pruefungsleistungen: " + "\n" + "Modul: ";
	}

	public int getMatrikelnummer() {
		return this.matrikelnummer;
	}

	public String getVorname() {
		return this.vorname;
	}

	public String getNachname() {
		return this.nachname;
	}

	@Override
	public int compareTo(Student anderesStudent) {
		if (getMatrikelnummer() < anderesStudent.getMatrikelnummer()) {
			return -1;
		}
		if (getMatrikelnummer() > anderesStudent.getMatrikelnummer()) {
			return 1;
		}
		return 0;
	}

	@Override
	public boolean equals(Object andererStudent) {
		if (!(andererStudent instanceof Student)) {
			return false;
		}
		Student student = (Student) andererStudent;
		return this.matrikelnummer == student.matrikelnummer;
	}

	@Override
	public int hashCode() {
		int ergebnis = matrikelnummer * 2;
		return ergebnis;
	}

	@Override
	public int compare(Student student, Student andererStudent) {

		if (student.getVorname() == null && andererStudent.getVorname() == null && student.getNachname() == null
				&& andererStudent.getNachname()==null) {
			return 0;
		}
		if (student.getVorname() == null && student.getNachname() == null) {
			return 1;
		}
		if (andererStudent.getVorname() == null && andererStudent.getNachname() == null) {
			return -1;
		}
		return student.compareTo(andererStudent);

	}
}
