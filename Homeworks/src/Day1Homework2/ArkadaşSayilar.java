package Day1Homework2;

public class Arkada�Sayilar {

	public static void main(String[] args) {
		//220-284 �ki say� birbirinin kendisi hari� pozitif b�lenleri toplam�na e�itse bu say�lara arkada� say�lar denir.
		//220�nin kendisi hari� pozitif b�lenlerinin toplam� : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
		//284��n kendisi hari� pozitif b�lenlerinin toplam� : 1 + 2 + 4 + 71 + 142 = 220

		int number1 = 1210;
		int number2 = 1184;
		int total = 0; 
		
		for(int i=1; i<number1; i++) {
				if(number1 % i == 0) {
					total = total + i; 
				}
		}
		
		if(total == number2) {
			System.out.println(number1 + " ve " + number2 + " Arkada� say�lard�r.");
		}else {
			System.out.println(number1 + " ve " + number2 + " Arkada� say� de�illerdir.");
			
		}
	}

}
