package Day2Homework2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
	 Product product = new Product(1,"Laptop","Asus Laptop",5000,3);
	 
/*	Ýki türlü kullanýmý vardýr yukarýdaki gibi de kullanýlabilir aþaðýdaki gibide. Ýki türlüde set edilmiþ olarak kullanýlýr yukarýdaki product classýnda tihs ile set edilmiþtir.
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
