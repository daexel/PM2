package aufgabenblatt1_2;

import java.time.LocalDateTime;

public class Messung {

	private double wert;
	private LocalDateTime zeitstempel;
	
	
public Messung(double wert, LocalDateTime zeitstempel){
	this.wert=wert;
	this.zeitstempel=zeitstempel;
}

public double getWert(){
	return this.wert;
}
public LocalDateTime getZeitstempel(){
	return this.zeitstempel;
}

	
}
