package Day2Homework2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	 Product product = new Product(1,"Laptop","Asus Laptop",5000,3);
	 
/*	�ki t�rl� kullan�m� vard�r yukar�daki gibi de kullan�labilir a�a��daki gibide. �ki t�rl�de set edilmi� olarak kullan�l�r yukar�daki product class�nda tihs ile set edilmi�tir.
 *  product.setName("Laptop");
	 product.setId(1);
	 product.setDescription("Asus Laptop");
	 product.setPrice(5000);
	 product.setStockAmount(3);*/
	 
	 ProductManager productManager = new ProductManager();
	 productManager.Add(product);
	 System.out.println(product.getKod());


	}

}
