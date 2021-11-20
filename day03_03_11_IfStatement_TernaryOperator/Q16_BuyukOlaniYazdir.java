package day03_03_11_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q16_BuyukOlaniYazdir {
	/*
	 * Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve en kucuk
	 * olanlarini konsola yazdiriniz int num1 int num2 int num3
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Siralama icin lutfen sirasiyla uc tamsayi giriniz \ns1 : ");
		int s1 = input.nextInt();
		System.out.println("s2 : ");
		int s2 = input.nextInt();
		System.out.println("s3 : ");
		int s3 = input.nextInt();

		// if le kolay ternary ile zorlayalim

		System.out.println((s1 > s2 && s1 > s3) ? ("Ilk sayi en buyuktur")
				: s2 > s1 && s2 > s3 ? ("Ikinci sayi en buyuktur")
						: (s3 > s1 && s3 > s2) ? ("Ucuncu sayi en buyuktur")
								: (s1 > s2 && s2 == s3) ? ("ilk sayi en buyuk ikinci ve ucuncu sayi esit")
										: (s2 > s3 & s1 == s3) ? ("ikinci sayi en buyuk birinci ve ucuncu sayilar esit")
												: (s3 > s1 && s1 == s2)
														? ("ucuncu sayi en buyuk birinci ve ikinci sayilar esit")
														: ("Sayilarin hepsi birbirine esit"));

		input.close();
	}
}
