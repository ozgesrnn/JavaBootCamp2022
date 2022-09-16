package Day1Homework2;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj= "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayýsý: "+ mesaj.length());
		System.out.println("5.eleman: "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaþasýn!")); //daha sonra kullanýlacaksa concat kullanýlmasý bir deðiþkene atanmalý
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av")); // belirlediðim karakteri o indekte arar
		System.out.println(mesaj.lastIndexOf("a")); // aramaya saðdan baþlar
		
		System.out.println("-------------------------------------");
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); //metnimizde deðiþim yapmak için mesela karakter 
		System.out.println(mesaj.substring(2,5)); //belirlediðimiz indexten itibaren mesajý yazdýrýr ',' den sonrasýda o kýsma kadar kes demek
	
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //cümlenin tüm harflerini küçük harf yapar
		System.out.println(mesaj.toUpperCase()); //cümlenin tüm harflerini büyük harf yapar
		System.out.println(mesaj.trim()); //baþýndaki ve sonundaki boþluklarý yok eder.
	}

}
