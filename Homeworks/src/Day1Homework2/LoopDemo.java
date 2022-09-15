package Day1Homework2;

public class LoopDemo {

	public static void main(String[] args) {
		//for          i++ : i yi 1 artýr
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);//çift yazdýrýr
		}
		
		System.out.println("For Döngüsü Bitti");
		
		int i=2;
		//while
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//do-while da þart saðlanmasa döngüye girer.
		int j=100;
		do {
			System.out.println("Loglandý"); // Loglama yapmak test etmek için kullanýrýz do-while ý
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");
	}
	
}
