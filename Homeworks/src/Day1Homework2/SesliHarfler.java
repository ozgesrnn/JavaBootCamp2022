package Day1Homework2;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'Y';
		
		switch (harf) {
			case 'A': 
			case 'I':
			case 'O':
			case 'U':
				System.out.println(harf + " Kalýn Sesli Harf");
			break;
			case 'E':
			case 'Ý':
			case 'Ö':
			case 'Ü':
				System.out.println(harf + " Ýnce Sesli Harf");
			break;
		default: 
			System.out.println("Geçersiz bir harf girdiniz.");
		}
		
	}

}
