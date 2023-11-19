package Day18;
import java.util.*;

public class Product {
	 private int productId;
	    private String productname;
	    public Product(int productId,String productname) {
	    	this.productId=productId;
	    	this.productname=productname;
	    }
	    public int getproductId() {
	    	return productId;
	    }
	    public String getproductname() {
	    	return productname;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hell world");
	HashSet<Product> s=new HashSet<>();
	for(int i=0;i<6;i++) {
	Product p=new Product(sc.nextInt(),sc.next());
     s.add(p);
	}
     for(Product e:s) {
    	System.out.println( e.productId);
    	System.out.println( e.productname);
     }
     
	
	}

}
