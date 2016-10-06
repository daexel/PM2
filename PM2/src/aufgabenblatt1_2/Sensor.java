package aufgabenblatt1_2;

import java.util.ArrayList;
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
	
	
	
	
	
	
}
