package prevozno_domaci;

public class PSGlavni {

	public static void main(String[] args) {
		//kreirati paket prevozno sredstvo, kreirati klasu vozilo 
		//koja poseduje broj mesta za prevoz putnika
	    //vozilo takodje poseduje gorivo DOUBLE;
	    //kapacitet prevoza putnika se zadaje prilikom kreiranja vozila 
		//i nemoguce ga je promeniti GET
	    //automobil je vozilo koje sadrzi odredjen broj putnika,
		//registarski broj STRING, poseduje snagu DOUBLE,
	    //avion je vozilo koje sadrzi putnike 
		//i koje ima jedinstveni serijski broj String, marku STRING,
		//kao i klasu putnika koju
	    //koje prevozi STRING
	    //putnik ima ime i prezime STRING,
		//i jedinstveni id koji se automatski dodeduljuje
	    //vozilo isto ima jedinstveni id koji se automatski dodeljuje
	    //u vozilo je moguce postaviti i ukloniti putnika na neko od mesta
	    //povratna vrednost je indikator da li je putnik uspesno uklonjen ili nije BOOLEAN
		//VOZILO(ID:<GORIVO>:BRPUTNIKA{SVIPUTNICI})
		//AUTOMOBIL(ID:REGBROJ:<GORIVO>:SNAGA:BRPUTNIKA{SVIPUTNICI})
		//AVION(ID:SERBROJ:<GORIVO>:BRPUTNIKA{SVIPUTNICI})
		//za putnika: [ID:IME_PREZIME]
		
		
		Automobil au1=new Automobil(32.1, 5, "rasfBr", 203.32);
		System.out.println(au1.getBrPutnika());
		
		Avion av1=new Avion(500.0, 100, "sdaw", "Boing", "eko");
		
		Putnik p1=new Putnik("Mika Peric");
		Putnik p2=new Putnik("Pera Peric");
		Putnik p3=new Putnik("Zika Peric");
		Putnik p4=new Putnik("Ana Peric");
		
		au1.postaviPutnika(p3, 0);
		
		av1.postaviPutnika(p1, 4);
		av1.postaviPutnika(p2, 30);
		av1.postaviPutnika(p4, 10);
		
		
		
		System.out.println(au1);
		System.out.println(av1);

		av1.ukloniPutnika(30);
		System.out.println(av1);
	}

}
