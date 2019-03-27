package zemljiste;

public class Glavni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Parcela ima jedinstven automatski generisan celobrojan 
//		identifikator i zadatu povrsinu(u kvadratnim metrima)
//		prilikom kreiranja. 
//		Mogu da joj se dohvate sadrzani podaci, 
//		kao i jednoslovna vrsta(char). Moze da joj se odredi prinos
//		u periodu zadatom brojem godina. Moze da se sastavi tekstualni
//		opis u obliku VRSTA-ID[POVRŠINA].
//
//
//		Šuma je parcela koja ima zadate povrsinu koju zauzimaju stabla,
//		prinos po zrelom stablu i period sazrevanja od zasada do seče 
//		izražen u celom broju godina. Oznaka vrste je S. 
//		Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*
//		prinos_stabla*(godine/sazrevanje). Tekstualni oblik je
//		*Parcela:(povrsstabla,prinosSt,Period).
//		*Ovo se ostvaruje pozivom super.toString();
//
//		Njiva je parcela koja ima zadat godišnji prinos po kvadratnom metru.
//		Prinos po kvadratnom metru može da se promeni. Oznaka vrste je N. 
//		Prinos njive se računa po formuli: povrsina_parcele*prinosPoKvM. 
//		Tekstualni oblik je Parcela:PrinosPoKvM.
//
//		Napisati i glavni program koji kreira niz parcela koje mogu da
//		budu ili šume ili njive i ispisuje njihov prinos u toku 3 godine.

		Parcela[] niz = new Parcela[10];

		Parcela s1 = new Suma(100, 1, 50, 1000);
		Parcela n1 = new Njiva(50, 200);

		niz[0] = s1;
		niz[1] = n1;

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] != null) {
				System.out.println("Prinos za " + niz[i] + " je: " + niz[i].prinos(3));
			}
		}
	}

}
