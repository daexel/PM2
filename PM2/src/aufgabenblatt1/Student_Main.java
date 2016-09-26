package aufgabenblatt1;

public class Student_Main {
public static void main(String []args){
	Pruefungsleistung leistung1 = new Pruefungsleistung(12, "PM1");
	Pruefungsleistung leistung2 = new Pruefungsleistung(7, "GE1");
	Student student = new Student("Michel", "Gerlach", 12345, leistung1, leistung2);
	System.out.println(student.toString());
		}
}
