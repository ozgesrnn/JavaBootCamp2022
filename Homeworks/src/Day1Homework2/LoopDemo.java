package Day1Homework2;

public class LoopDemo {

	public static void main(String[] args) {
		//for          i++ : i yi 1 art�r
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);//�ift yazd�r�r
		}
		
		System.out.println("For D�ng�s� Bitti");
		
		int i=2;
		//while
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While D�ng�s� Bitti");
		
		//do-while da �art sa�lanmasa d�ng�ye girer.
		int j=100;
		do {
			System.out.println("Logland�"); // Loglama yapmak test etmek i�in kullan�r�z do-while �
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("Do-While D�ng�s� Bitti");
	}
	
}
