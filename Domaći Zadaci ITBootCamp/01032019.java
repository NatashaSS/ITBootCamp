package no;
import java.util.Scanner;

public class Test {
//U nastavku je dat kod koji predstavlja kalkulator povrsina 
	//kvadrata, pravougaonika i kruga.
	//Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	//Ukoliko se unese 'izadji', program treba da se zavrsi.
	//Program treba da se ponavlja dokle god se ne unese izadji.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String figura;
		while(true) {
			figura=sc.nextLine();
			switch(figura) {
			case "kvadrat":racunajKvadrat();
			case "pravougaionik":racunajPravougaonik();
			case "krug":racunajKrug();			
			case "izadji":return;
			}
		}
	}

	private static void racunajKrug() {
		Scanner sc= new Scanner(System.in);
		double r;
		r=sc.nextDouble();
		if(r<=0) { System.out.println("Los unos!");return;}
		System.out.println("Povrsina pravougaionika je: "+pKruga(r));
	}

	private static void racunajPravougaonik() {
		Scanner sc= new Scanner(System.in);
		double a, b;
		a=sc.nextDouble();
		b=sc.nextDouble();
		if(a<=0 || b<=0) { System.out.println("Los unos!");return;}
		System.out.println("Povrsina pravougaionika je: "+pPravougaonika(a, b));
		
	}

	private static void racunajKvadrat() {
		Scanner sc= new Scanner(System.in);
		double a;
		a=sc.nextDouble();
		if(a<=0) { System.out.println("Los unos!");return;}
		System.out.println("Povrsina kvadrata je: "+pKruga(a));
		
	}
	private static double pKruga(double r) {
		return r*r*3.14;
	}
	private static double pKvadrata(int a) {
		return a*a*a;
	}
	private static double pPravougaonika(double a, double b) {
		return a*b;
	}
}
