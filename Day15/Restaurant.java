package Day15;
import java.util.Scanner;
class Dish{
	private String name;
	private String ingredients;
	private int price;
	
		public void setName(String name) {
			this.name=name;
			
		}
		public void setingredients(String ingredients) {
		this.ingredients=ingredients;
		
		}
		public void setprice(int price) {
			this.price=price;
		}
		public String getName() {
			return name;
		}
		public String getingredients() {
			return ingredients;
		}
		public int getprice() {
			return price;
		}
	}

class Restaurant1  extends Dish
{
	int count=0;
	Dish d[];
	public Restaurant1(Dish d1[]) {
		this.d=d;
		
	}
	public void addDish(Dish d1)
	{
		if(count<2)
		{
		d[count]=d1;
		count++;
		}
		else
		{
			System.out.println("cannot add");
		}
	}
	public void removedish(String dishname)
	{
		for(int i=0;i<d.length;i++)
		{
			if(d[i].getName().equals(dishname))
			{
				
				for(int pos=i;pos<d.length-1;pos++)
				{
					d[pos]=d[pos+1];
				}
				d[d.length-1]=null;
			}
		}
	}

}




public class Restaurant {
public static void main(String[] args) {
	int i;
	Scanner sc=new Scanner(System.in);
	Restaurant  re=new Restaurant ();
	 Dish []d1=new Dish[1];
	 for( i=0;i<d1.length;i++) {
		 d1[i].setName(sc.next());
		 d1[i].setingredients(sc.next());
		 d1[i].setprice(sc.nextInt());
	 }
	
	System.out.println(d1[i].getName());
	System.out.println(d1[i].getingredients());
	System.out.println(d1[i].getprice());
	
	}

}
