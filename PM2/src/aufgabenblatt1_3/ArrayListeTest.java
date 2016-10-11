package aufgabenblatt1_3;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ArrayListeTest {
	private ArrayListe<Integer> listeTest=new ArrayListe<Integer>();
	Integer eins=1;
	Integer zwei=2;
	Integer	drei=3;
	Integer vier=4;
	
	@Test
public void hinzufuegenTest(){
	Integer eins=1;
	Integer zwei=2;
	Integer	drei=3;
	Integer vier=4;
	listeTest.hinzufuegen(eins);
	listeTest.hinzufuegen(zwei);
	listeTest.hinzufuegen(drei);
	listeTest.hinzufuegen(vier);
	
	assertTrue(listeTest.get(0)==1);
	assertFalse(listeTest.get(0)!=1);
	
}
@Test
public <T> void entfernen(T element){
	
	assertTrue(listeTest.get(index)==);
}
}
