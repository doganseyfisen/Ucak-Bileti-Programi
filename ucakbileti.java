import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int km, age, typ;
		double normTutar, indTutar;
		double indirimTutar, sonTutar;
		
		Scanner inp = new Scanner(System.in);
		
		System.out.print("Mesafeyi km cinsinden girin: ");
		km = inp.nextInt();

		if(km <= 0) {System.out.println("Hatalı veri girdiniz!");}
		
		System.out.print("Yaşınızı girin: ");
		age = inp.nextInt();
		
		if(age < 0) {System.out.println("Hatalı veri girdiniz!");}
		
		System.out.print("Tek Yön için = 1 yazın\nGidiş-Dönüş için = 2 yazın\nYolculuk tipi seçin: ");
		typ = inp.nextInt();
		
		if(typ <= 0 && km >=3 ) {System.out.println("Hatalı veri girdiniz!");}
		
		normTutar = km*0.10;
		
		if(age < 12 && typ == 2) {
			indTutar = normTutar-(normTutar*0.50);
			indirimTutar = indTutar-(indTutar*0.20);
			sonTutar = indirimTutar*2;
			System.out.println("Ödemeniz gereken indirimli tutar: " + sonTutar + " TL");
		} else if(age < 12 && typ == 1) {
			indTutar = normTutar-(normTutar*0.50);
			System.out.println("Ödemeniz gereken indirimli tutar: " + indTutar + " TL"); 
		}
		
		if(age <= 24 && age >= 12 && typ == 2) {
			indTutar = normTutar-(normTutar*0.10);
			indirimTutar = indTutar-(indTutar*0.20);
			sonTutar = indirimTutar*2;
			System.out.println("Ödemeniz gereken indirimli tutar: " + sonTutar + " TL");
		} else if(age <= 24 && age >=12 && typ == 1) {
			indTutar = normTutar-(normTutar*0.10);
			System.out.println("Ödemeniz gereken indirimli tutar: " + indTutar + " TL"); 
		}
		
		if(age <= 65 && age > 24 && typ == 2) {
			indTutar = normTutar;
			indirimTutar = indTutar-(indTutar*0.20);
			sonTutar = indirimTutar*2;
			System.out.println("Ödemeniz gereken indirimli tutar: " + sonTutar + " TL");
		} else if(age <= 65 && age >24 && typ == 1) {
			indTutar = normTutar;
			System.out.println("Ödemeniz gereken indirimli tutar: " + indTutar + " TL"); 
		}
		
		if(age > 65 && typ == 2) {
			indTutar = normTutar-(normTutar*0.30);
			indirimTutar = indTutar-(indTutar*0.20);
			sonTutar = indirimTutar*2;
			System.out.println("Ödemeniz gereken indirimli tutar: " + sonTutar + " TL");
		} else if(age > 65 && typ == 1) {
			indTutar = normTutar-(normTutar*0.30);
			System.out.println("Ödemeniz gereken indirimli tutar: " + indTutar + " TL"); 
		}
	
	}
}
