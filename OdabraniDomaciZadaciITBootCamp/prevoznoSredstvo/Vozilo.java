package prevozno_domaci;

public class Vozilo {
	public static int uid = 0;
	protected Putnik[] mesta;
	protected double gorivo;
	private int id;

	public Vozilo(double gorivo, int k) {
		this.gorivo = gorivo;
		this.id = ++uid;
		this.mesta = new Putnik[k];
	}



	public int getId() {
		return this.id;
	}

	public void addGorivo(int value) {
		if (value >= 0)
			this.gorivo += value;
	}

	public void subGorivo(int value) {
		if (value >= 0 && value <= this.gorivo)
			this.gorivo -= value;
	}

	public boolean postaviPutnika(Putnik p, int i) {
		if (i >= this.mesta.length || i < 0)
			return false;
		if (mesta[i] != null)
			return false;
		for (int j = 0; j < mesta.length; j++) {
			if (mesta[j] != null) {
				if (mesta[j] == p) {
					return false;
				}
			}
		}
		mesta[i] = p;
		return true;
	}

	public boolean ukloniPutnika(int i) {
		if (i >= this.mesta.length || i < 0)
			return false;
		if (mesta[i] == null) {
			return true;
		}
		mesta[i] = null;
		return true;
	}

	public int getBrPutnika() {
		int br=0;
		for(int i=0;i<mesta.length;i++) {
			if(mesta[i]!=null)br++;
		}
		
		return br;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Vozilo");
		sb.append("(");
		sb.append(this.getId());
		sb.append(":<").append(this.getGorivo()).append(">:");
		sb.append(this.getBrPutnika()).append("{");
		for (int i = 0; i < mesta.length; i++) {
			if(mesta[i]!=null)sb.append(mesta[i]);
		}
		sb.append("})");
		return sb.toString();

	}

	public double getGorivo() {
		// TODO Auto-generated method stub
		return this.gorivo;
	}

	
	
}
