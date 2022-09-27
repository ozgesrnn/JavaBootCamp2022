package Day2Homework2.classesWithAttributes;

public class Product {
	
	//constructor
	public Product(int id,String name, String description,double price,int stockAmount) {
		System.out.println("Yapýcý blok çalýþtý"); 
		this.id =id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount; // bu this ler ile set etmiþ olduk, constructorlarda overload yapýp iki türlü kullaným saðlanabilir bu þekilde
	}
	
	public Product() {
		
	}
	//attribute | field 
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;
	
	//fields
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id; // this : içinde bulunduðum class daki 'id' demek.
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getKod() {
		return this.name.substring(0,1) + id;
	}

}
