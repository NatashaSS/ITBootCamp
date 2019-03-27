package zemljiste;

//Njiva je parcela koja ima zadat godišnji prinos po kvadratnom metru.
//Prinos po kvadratnom metru može da se promeni. Oznaka vrste je N. 
//Prinos njive se računa po formuli: povrsina_parcele*prinosPoKvM. 
//Tekstualni oblik je Parcela:PrinosPoKvM.
public class Njiva extends Parcela {

	private int prinosNjive;
	
	public Njiva(int prinosNjive, int pParcele)
	{
		super(pParcele);
		this.prinosNjive = prinosNjive;
		this.vrstaP = 'N';
	}

	@Override
	public int prinos(int brojGodina) {
		return getpParcele() * this.prinosNjive * brojGodina;
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + this.prinosNjive;
	}
}
