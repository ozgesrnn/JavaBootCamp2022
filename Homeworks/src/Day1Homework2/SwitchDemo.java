package Day1Homework2;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'C';
		
		switch(grade) {
		case 'A' :
			System.out.println("Mükemmel, Geçtiniz!");
			break;
		case 'B':
		case 'C':
			System.out.println("Çok Güzel, Geçtiniz!");
			break;
		case 'D' :
			System.out.println("Ýyi, Geçtiniz!");
			break;
		case 'F' :
			System.out.println("Üzgünüz, Kaldýnýz.");
			break;
		default:
			System.out.println("Geçersiz not girdiniz!");
		}

	}

}
