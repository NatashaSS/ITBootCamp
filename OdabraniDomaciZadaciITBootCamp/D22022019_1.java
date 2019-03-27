package domaci;

import java.util.Scanner;

public class D22022019_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Napisati program u kojem  korisnik unosi broj n i ispisuje sve brojeve fibonacijevog niza
//		ciji je zbir cifara deljiv sa k(takodje unosi korisnik. 
//		Ako se unese broj 10  i k =3 fibonacijev niz brojeva je 1 1 2 3 5 8 13 21 34 55 ispis
//		treba da bude 3 21.

		Scanner sc = new Scanner(System.in);
		int i, n, p1 = 1, p2 = 1, k, f, c, sum;
		i = 1;
		n = 0;

		System.out.println("Unesi broj ");
		n = sc.nextInt();

		System.out.println("Unesi broj k ");
		k = sc.nextInt();
//		System.out.println(p1);
//		System.out.println(p2);
		for (i = 2; i < n; i++) {
			f = p1 + p2;
			p1 = p2;
			p2 = f;

			sum = 0;
			while (f > 0) {
				c = f % 10;
				f /= 10;
				sum += c;
			}
			if (sum % k == 0) {
				System.out.println(p2);

			}
		}

	}

}
