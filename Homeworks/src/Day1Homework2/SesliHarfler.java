package Day1Homework2;

public class SesliHarfler {

	public static void main(String[] args) {
		char harf = 'Y';
		
		switch (harf) {
			case 'A': 
			case 'I':
			case 'O':
			case 'U':
				System.out.println(harf + " Kal�n Sesli Harf");
			break;
			case 'E':
			case '�':
			case '�':
			case '�':
				System.out.println(harf + " �nce Sesli Harf");
			break;
		default: 
			System.out.println("Ge�ersiz bir harf girdiniz.");
		}
		
	}

}
