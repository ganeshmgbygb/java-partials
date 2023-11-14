package Day12;
import java.util.Scanner;
class Electronic {
	private String Brand;
	private int model;
	public Electronic(String Brand,int model) {
		this.Brand=Brand;
		this.model=model;
	}
}
class phone extends Electronic{

	public phone(String Brand, int model) {
		super(Brand, model);
	}
	public void phone() {
		System.out.println("modile");
		System.out.println("256 gb rom");
		System.out.println("12 gb ram");
		System.out.println("sd 845");
		System.out.println("2k screen");
	}
	
}
class laptop extends Electronic{

	public laptop(String Brand, int model) {
		super(Brand, model);
	}
	public void laptop() {
		System.out.println("laptop");
		System.out.println("256 gb ssd");
		System.out.println("16 gb ram");
		System.out.println("intel i7");
		System.out.println("nvidaGtx");
	}
	
}
class smartphone extends phone{
	public smartphone(String Brand, int model) {
		super(Brand, model);
	}
		public void smartphone1() {
		System.out.println("Smartphone");
		System.out.println("256 gb rom");
		System.out.println("12 gb ram");
		System.out.println("sd 955");
		System.out.println("4k screen");
		
}
}




public class ElectronicDevicesHierarchy {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		Electronic []ec=new Electronic[2];
		for(int i=0;i<ec.length;i++) {
			System.out.println("enter the brand,model,");
			ec[i]=new phone(sc.next(),sc.nextInt());
			System.out.println("enter the brand,model,");
			ec[i]=new laptop(sc.next(),sc.nextInt());
			System.out.println("enter the brand,model,");
			ec[i]=new smartphone(sc.next(),sc.nextInt());
}
		smartphone []sp=new smartphone[1];
		for(int i=0;i<ec.length;i++) {
			
			sp[i].smartphone1();
		}
		
		
	}
}
