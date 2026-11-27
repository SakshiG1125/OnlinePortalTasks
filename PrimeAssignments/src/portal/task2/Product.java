package portal.task2;

public class Product {
	int id;
	String name;
	double price;
	

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
public static void main(String[] args) {
	Product p = new Product(2143,"Hair Dryer",3500 );
	System.out.println("Details of the product:\n ProductId: "+p.id+" Product Name: "+p.name+"Price of the product : Rs."+p.price);
	
	
	Product p1 = new Product(2174,"TV",67000 );
	System.out.println("\nDetails of the product:\n ProductId: "+p1.id+" Product Name: "+p1.name+"Price of the product : Rs."+p1.price);
	
	Product p2 = new Product(21683,"Washing Machine",55000 );
	System.out.println("\nDetails of the product:\n ProductId: "+p2.id+" Product Name: "+p2.name+"Price of the product : Rs."+p2.price);
	
}
	
//	Product(int pid, String pname, double pprice){
//		id = pid;
//		name = pname;
//		price = pprice;
//	
//		
//	}

}
