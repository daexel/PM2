package aufgabenblatt1_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sensor {

	private int ID;
	private List<Messung> listeMessungen;
	
	public Sensor(int ID, Messung... listeMessungen){
		this.ID=ID;
		this.listeMessungen = new ArrayList<Messung> (listeMessungen.length);
		for (int i=0;i<listeMessungen.length;i++){
			this.listeMessungen.add(listeMessungen[i]);
		}
		
	}
	
	public int getID(){
		return this.ID;
	}
	public int getAnzahlMessungen(){
		int anzahlMessungen=0;
		Iterator iter= listeMessungen.iterator();
		
		for(int i=0;iter.hasNext();i++)
		{
			if (listeMessungen.get(i)!=null)
			{
				anzahlMessungen++;
			}
			iter.next();
			
		}
		return anzahlMessungen;
	}
	
	
	
	
}
