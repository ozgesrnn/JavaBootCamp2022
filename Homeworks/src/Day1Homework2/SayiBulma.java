package Day1Homework2;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 15;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			System.out.println(aranacak + " Say�s� vard�r.");
		}else {
			System.out.println(aranacak + " Say�s� yoktur.");
		}

	}

}
