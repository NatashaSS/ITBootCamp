package uredjaj;

public class GlavniProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Televizor t1=new Televizor(null);
Laptop l1=new Laptop("8", "Pentium");

System.out.println(t1);
t1.setStanje(true);
t1.iskljuciUredjaj();
t1.postaviKanal();
t1.getKanal();
System.out.println(t1.getKanal());
System.out.println(l1);




	}

}
