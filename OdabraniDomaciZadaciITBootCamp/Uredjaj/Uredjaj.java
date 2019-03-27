package uredjaj;

public class Uredjaj {
//	Uredjaj ima stanje da li je ukljucen ili iskljucen.
//	Njegovo stanje moze da se postavi i da se dohvati. 
//	Takodje poseduje i jedinstveni identifikator koji se zadaje 
//	prilikom kreiranja uredjaja i moze da se dohvati.
//	Ispisuje se u formatu “Uredjaj(ID:STATUS)”
//	STATUS treba da ima vrednosti ON i OFF;

	private boolean stanje;
	private String status;
	private static int uid;
	private int id;

	public Uredjaj() {
		this.id = uid;
		this.stanje= false;
		this.status="OFF";
		++uid;
	}

	public Uredjaj(boolean stanje) {
		this.stanje = stanje;
		if (stanje == true) {
			this.status = "ON";}
		else {this.status = "OFF";
		}
		this.id = uid;
		++uid;

	}

	public boolean ukljuciUredjaj() {
		if (stanje == false) {
			status = "ON";
		} else {
			System.out.println("Uređaj je već uključen");
		}
		return stanje = true;

	}

	public boolean isStanje() {
		return stanje;
	}

	public void setStanje(boolean stanje) {
		this.stanje = stanje;
	}

	public String getStatus() {
		return status;
	}

	public static int getUid() {
		return uid;
	}

	public int getId() {
		return id;
	}

	public boolean iskljuciUredjaj() {

		if (stanje == true) {
			status = "OFF";
		} else {
			System.out.println("Uređaj je već isključen");
		}
		return stanje = false;

	}
//	Ispisuje se u formatu “Uredjaj(ID:STATUS)”

	@Override
	public String toString() {
		return "Uredjaj ("+"id=" + id + ": " + status+")";
		
	}
}
	

