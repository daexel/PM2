package aufgabenblatt1.Tests;

import org.junit.*;
import aufgabenblatt1.Student;
import static org.junit.Assert.*;

public class StudentTest {

@Test
	public void equals(){
	Student student1 = new Student("Michel","Gerlach", 12345);
	Student student2 = new Student("Jens","Paulsen", 12345);
	Student student3 = new Student("Sven","Friedrichs",54321);
	assertTrue(student1.equals(student2));
	assertFalse(student1.equals(student3));
		
	}
@Test
public void compareTo(){
	Student student1 = new Student("Michel","Gerlach", 12345);
	Student student2 = new Student("Jens","Paulsen", 12345);
	Student student3 = new Student("Sven","Friedrichs",54321);
	assertTrue((student1.compareTo(student2))==0);
	assertTrue((student1.compareTo(student3))<0);
	assertTrue((student3.compareTo(student1))>0);
}
}


