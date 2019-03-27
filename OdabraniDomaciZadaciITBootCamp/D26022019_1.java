package domaci;

import java.util.Scanner;

public class D26022019_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Napisati program koji ucitava ceo broj N. 
//		Taj broj N se prosledjuje metodi koja formira i vraća ceo broj koji
//		predstavlja inverzan broj. Glavni program nakon toga ispisuje taj inverzan broj. 
//		Primer: 121 - > 121
//		452 - > 254
//		326 - > 623
		
		
		Scanner sc = new Scanner(System.in);
		int inverseNum=0,n,c=0;
		System.out.println("Unesite broj n ");
		n=sc.nextInt();
		inverzija (inverseNum,n,c);

	}
public static int inverzija (int inverseNum, int n, int c){
	for (int i=0; i<n; i++) {
		c=n%10;
		inverseNum+=c;	
		inverseNum*=10;
		n/=10;
	}
	inverseNum/=10;
	System.out.println (inverseNum);
	return inverseNum;

	
}
}
