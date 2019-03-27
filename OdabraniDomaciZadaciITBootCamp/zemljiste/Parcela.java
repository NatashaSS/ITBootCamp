package zemljiste;

public abstract class Parcela {
//	Parcela ima jedinstven automatski generisan celobrojan 
//	identifikator i zadatu povrsinu(u kvadratnim metrima)
//	prilikom kreiranja. 
//	Mogu da joj se dohvate sadrzani podaci, 
//	kao i jednoslovna vrsta(char). Moze da joj se odredi prinos
//	u periodu zadatom brojem godina. Moze da se sastavi tekstualni
//	opis u obliku VRSTA-ID[POVR�INA].
//

	private static int uid;
	private int pParcele;
	private int id;
	protected char vrstaP;

	public int getpParcele() {
		return pParcele;
	}

	public int getId() {
		return id;
	}

	public char getVrstaP() {
		return vrstaP;
	}

	public Parcela(int pParcele) {
		this.id = uid;
		++uid;
		this.pParcele = pParcele;
	}

	public abstract int prinos(int brojGodina);

	// VRSTA-ID[POVR�INA]
	@Override
	public String toString() {
		return vrstaP + "-" + id + "[" + pParcele + "]";
	}
}
