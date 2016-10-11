package aufgabenblatt1_3;
/**
 * ArrayListe<T>
 * 
 * Beschreibt eine Containerklasse für Objekttypen von Objekt, die in einem Array abgespeichert werden
 * 
 * @author Michel Gerlach
 *
 */
public class ArrayListe<T> {
	private int anzahlElemente =0;
	private Object[] elemente=new Object[20];
	 
	
	public void arrayListe(){
		
	}
	/**
	 * Fügt Elemente des generischen Typs element der Arrayliste hinzu
	 * @param element
	 */
	public void hinzufuegen(T element){
		anzahlElemente++;
		if (anzahlElemente>=elemente.length){
			Object[] temp = new Object[elemente.length*2];
			System.arraycopy(elemente, 0, temp, 0, elemente.length);
			elemente = temp;
		}
		for(int i=0;i<elemente.length;i++){
			if(elemente[i]!=null){
				elemente[i]=element;
			}
		}
	}
	/**
	 * Gibt je nach index ein Element der Arraylist zurück.
	 * 
	 * @param index
	 * @return: Ein Objekt element eines generischen Typs
	 */
	public T get(int index){
		return (T) elemente[index];
		
	}
	/**
	 * Entfernt ein Element aus der Arraylist, falls dieses vorhanden ist.
	 * @param element
	 */
	public void entfernen(T element){
		for(int i=0; i<elemente.length;i++){
			if(elemente[i]==element){
				elemente[i]=null;
			}
		}
	}
	/**
	 * Entfernt ein Element der Arraylist an der Stelle des Index.
	 * @param index
	 */
	public void entferneElementAnIndex(int index){
		elemente[index]=null;
		
	}
	/**
	 * Gibt die Anzahl der Elemente der Arraylist zurük.
	 * @return
	 */
	public int getAnzahlElemente(){
		for(int i=0;i<elemente.length;i++){
			if(elemente[i]!=null){
				anzahlElemente++;
			}
		}
		return anzahlElemente;
	}
	
	/**
	 * Gibt die Arraylist als String aus.
	 */
	public String toString(){
		String zusammenfassung="";
		for(int i=0;i<elemente.length;i++){
			zusammenfassung+=elemente[i].toString()+"/n";
		}
		return zusammenfassung;
	}
	//Was ist mit kleinstes Element gemeint?
	public T getKleinstesElement(){
		return (T) elemente[0];
	}
}
