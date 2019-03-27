package zemljiste;

public class Suma extends Parcela {
//	Šuma je parcela koja ima zadate povrsinu koju zauzimaju stabla,
//	prinos po zrelom stablu i period sazrevanja od zasada do seče 
//	izražen u celom broju godina. Oznaka vrste je S. 
//	Prinos se ostvaruje formulom povrsina_parcele/povrsina_stabla*
//	prinos_stabla*(godine/sazrevanje). Tekstualni oblik je
//	*Parcela:(povrsstabla,prinosSt,Period).
//	*Ovo se ostvaruje pozivom super.toString();

	private int prinosStabla;
	private int periodSazrevanja;
	private int povrsinaStabla;

	public Suma(int pParcele, int periodSazrevanja, int povrsinaStabla, int prinosStabla) {
		super(pParcele);
		this.vrstaP = 'S';
		this.prinosStabla = prinosStabla;
		this.povrsinaStabla = povrsinaStabla;
		this.periodSazrevanja = periodSazrevanja;
	}

	@Override
	public int prinos(int brojGodina) {
		return this.getpParcele() / this.povrsinaStabla * this.prinosStabla * (brojGodina / this.periodSazrevanja);
	}

	@Override
	public String toString() {
		return super.toString() + ":(" + this.povrsinaStabla + "," + prinosStabla + "," + periodSazrevanja + ")";
	}
}
