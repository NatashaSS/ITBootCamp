package prevozno_domaci;

public class Putnik {
//	putnik ima ime i prezime STRING,
	//i jedinstveni id koji se automatski dodeduljuje
	
	private String imeP;
	private static int idP;
	private int id;

	

	public Putnik (String imeP) {
		this.imeP=imeP;
		this.id = idP++;
	}
	//za putnika: [ID:IME_PREZIME]
	@Override
		public String toString() {
			return "[" + id + ":" + imeP + "]";
		}

}