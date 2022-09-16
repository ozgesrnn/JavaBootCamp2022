package Day1Homework2;

public class MukemmelSayi {

	public static void main(String[] args) {
		//6 --> 1,2,3 
		//28 -> 1,2,4,7,14   kendisine bölünen sayıların toplamıda kendisi eden sayılardır.
		
		int number = 28;
		int total= 0;
		
		if(number<1) {
			System.out.println(number + " Geçersiz sayıdır.");
			return;
		}
		
		for(int i=1; i<number; i++) {
			if(number % i == 0 ) {
				total = total + i;	
			}

		}
		
		if(total == number) {
			System.out.println(number + " Mükemmel Sayıdır.");
		}else {
			System.out.println(number + " Mükemmel sayı değildir.");
		}
		
	}
	
	
}
