package uredjaj;

import java.util.Scanner;

public class Televizor extends Uredjaj {

//	Televizor je uredjaj koji pored stanje poseduje i kanal tipa 
//	string na kom se nalazi. 
//	Televizoru moze da se postavi kanal i da se dohvati
//	trenutni kanal, ukoliko je ukljucen.
//	Ispisuje se u formatu “Televizor(ID:STATUS) je na kanalu KANAL”;
//	STATUS treba da ima vrednosti ON i OFF;

	private String kanal;

	public Televizor() {
		super();
	}

	public Televizor(String kanal) {
		super();
		this.kanal = kanal;

	}

	public String getKanal() {
		return kanal;
	}

	

	public void postaviKanal() {
		Scanner sc = new Scanner(System.in);
		if (isStanje() == true) {
			System.out.println("Unesi  kanal");
			this.kanal = sc.nextLine();
		} else {
			System.out.println("Televizor nije ukljucen");
		}
//		Ispisuje se u formatu “Televizor(ID:STATUS) je na kanalu KANAL”;
	}

	@Override
	public String toString() {
		return "Televizor(" + getId() +":" + getStatus() +")" +" je na kanalu " + kanal;
	}
}