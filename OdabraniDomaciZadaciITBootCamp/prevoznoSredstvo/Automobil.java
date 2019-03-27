package prevozno_domaci;

public class Automobil extends Vozilo{
	
	private String regBr;
	private double snaga;
	public Automobil(double gorivo, int k, String regBr, double snaga) {
		super(gorivo, k);
		this.regBr = regBr;
		this.snaga = snaga;
	}
	public String getRegBr() {
		return regBr;
	}
	public void setRegBr(String regBr) {
		this.regBr = regBr;
	}
	public double getSnaga() {
		return snaga;
	}
	public void setSnaga(double snaga) {
		this.snaga = snaga;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Automobil");
		sb.append("(");
		sb.append(this.getId()).append(":").append(this.getRegBr());
		sb.append(":<").append(this.getGorivo()).append(">:").append(this.getSnaga());
		sb.append(":").append(this.getBrPutnika()).append("{");
		for (int i = 0; i < mesta.length; i++) {
			if(mesta[i]!=null)sb.append(mesta[i]);
		}
		sb.append("})");
		return sb.toString();

	}
	
}
