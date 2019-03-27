package uredjaj;

public class Laptop extends Uredjaj {
//	Laptop je uredjaj koji poseduje RAM memoriju izrazenu u GB,
//	Model procesora (String).
//	Ispisuje se u formatu “Laptop(ID:STATUS)[RAM GB,Model Procesor]”
//	STATUS treba da ima vrednosti ON i OFF;
	
	private String ram;
	private String modelProcesora;
	
	public Laptop() {
		super();
	}
	
	public Laptop (String ram, String modelProcesora) {
		super ();
		this.ram=ram;
		this.modelProcesora=modelProcesora;
	}
	
	
//	Ispisuje se u formatu “Laptop(ID:STATUS)[RAM GB,Model Procesor]”

	@Override
	public String toString() {
		return "Laptop" + "(" + getId() + ": " + getStatus() + ")"+ "[" + ram +"GB"+", " +modelProcesora + "]"	;
				}
	
}
