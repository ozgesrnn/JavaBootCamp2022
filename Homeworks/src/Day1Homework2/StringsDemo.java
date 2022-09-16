package Day1Homework2;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj= "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman say�s�: "+ mesaj.length());
		System.out.println("5.eleman: "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" Ya�as�n!")); //daha sonra kullan�lacaksa concat kullan�lmas� bir de�i�kene atanmal�
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av")); // belirledi�im karakteri o indekte arar
		System.out.println(mesaj.lastIndexOf("a")); // aramaya sa�dan ba�lar
		
		System.out.println("-------------------------------------");
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj); //metnimizde de�i�im yapmak i�in mesela karakter 
		System.out.println(mesaj.substring(2,5)); //belirledi�imiz indexten itibaren mesaj� yazd�r�r ',' den sonras�da o k�sma kadar kes demek
	
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //c�mlenin t�m harflerini k���k harf yapar
		System.out.println(mesaj.toUpperCase()); //c�mlenin t�m harflerini b�y�k harf yapar
		System.out.println(mesaj.trim()); //ba��ndaki ve sonundaki bo�luklar� yok eder.
	}

}
