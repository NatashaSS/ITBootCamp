package prevozno_domaci;

public class Avion extends Vozilo {
	// avion je vozilo koje sadrzi koje ima jedinstveni serijski broj STRING, marku
	// STRING, kao i klasu putnika koju
	// koje prevozi STRING
	private  String avionId;
	private String markaAviona;
	private String klasaP;

	public Avion (double gorivo, int k, String avionId, String markaAviona, String klasaP) {
		super(gorivo, k);
		this.avionId=avionId;
		this.markaAviona=markaAviona;
		this.klasaP=klasaP;
		}
		
	

	public String getAvionId() {
		return avionId;
	}

	public void setAvionId(String avionId) {
		this.avionId = avionId;
	}

	public String getMarkaAviona() {
		return markaAviona;
	}

	public void setMarkaAviona(String markaAviona) {
		this.markaAviona = markaAviona;
	}

	public String getKlasaP() {
		return klasaP;
	}

	public void setKlasaP(String klasaP) {
		this.klasaP = klasaP;
	}
//	//AVION(ID:SERBROJ:<GORIVO>:BRPUTNIKA{SVIPUTNICI})
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Avion");
		sb.append("(");
		sb.append(this.getAvionId());
		sb.append(":<").append(this.getGorivo()).append(">:");
		sb.append(this.getBrPutnika()).append("{");
		for (int i = 0; i < mesta.length; i++) {
			if(mesta[i]!=null)
			{
				sb.append(mesta[i]);
			}
		}
		sb.append("})");
		return sb.toString();
}
}