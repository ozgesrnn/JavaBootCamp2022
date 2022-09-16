package Day1Homework2;

public class ArkadaþSayilar {

	public static void main(String[] args) {
		//220-284 Ýki sayý birbirinin kendisi hariç pozitif bölenleri toplamýna eþitse bu sayýlara arkadaþ sayýlar denir.
		//220’nin kendisi hariç pozitif bölenlerinin toplamý : 1 + 2 + 4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
		//284’ün kendisi hariç pozitif bölenlerinin toplamý : 1 + 2 + 4 + 71 + 142 = 220

		int number1 = 1210;
		int number2 = 1184;
		int total = 0; 
		
		for(int i=1; i<number1; i++) {
				if(number1 % i == 0) {
					total = total + i; 
				}
		}
		
		if(total == number2) {
			System.out.println(number1 + " ve " + number2 + " Arkadaþ sayýlardýr.");
		}else {
			System.out.println(number1 + " ve " + number2 + " Arkadaþ sayý deðillerdir.");
			
		}
	}

}
