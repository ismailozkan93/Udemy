package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		/*Kullanici ay ismini girince o ayin mevsini ekrana yaazdirin
		 * 
		 */
		//NOT:Switchlerde boolean, virg?lle sayilar(float,double) long kullanilmaz
		//char,byte,short,int,String kullanilir
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Ayin ismini giriniz");
		String ay = scan.nextLine();
		switch (ay) {
		case ("Aralik"):
		case ("Ocak"):
		case ("Subat"):
		System.out.println("Kis");
		break;
		
		case ("Mart"):
		case ("Nisan"):
		case ("Mayis"):
		System.out.println("Ilkbahar");
		break;
		
		case ("Haziran"):
		case ("Temmuz"):
		case ("Agustos"):
		System.out.println("Yaz");
		break;
		
		case ("Eyl?l"):
		case ("Ekim"):
		case ("Kasim"):
		System.out.println("Sonbahar");
		break;
		default:
			System.out.println("Ay gir l?tfen!!!");
		}
		
		
		
		
		
	}

}
