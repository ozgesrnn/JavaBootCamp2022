package Day1Homework2;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 29;
		int remainder = number % 2 ;
		//System.out.println(remainder);
		boolean isPrime = true;
		
	
		if(number==1) {
			System.out.println(number + " Say� asal de�ildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Ge�ersiz say�d�r.");
			return;
		}
		
		for(int i=2; i<number; i++) {
			if(number % i == 0 ) {
				isPrime = false;
				
			}
		}
		
		if(isPrime) {
			System.out.println(number + " Say� asald�r.");
		}else {
			System.out.println(number + " Say� asal de�ildir.");
		}

	}

}
