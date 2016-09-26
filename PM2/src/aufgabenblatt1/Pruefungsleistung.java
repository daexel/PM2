package aufgabenblatt1;

public class Pruefungsleistung {
private String nameModul;
private int note;

public Pruefungsleistung (int note, String nameModul){
	this.nameModul=nameModul;
	this.note=note;
}
public String getNameModul(){
	return this.nameModul;
}
public int getNote(){
	return this.note;
}


}
