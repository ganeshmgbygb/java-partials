package Day18;
import java.lang.*;
import java.util.*;


class AdBook{
	 private int phonenumber;
	    private String name;
	    public AdBook(int phonenumber, String name) {
	    	this.setPhonenumber(phonenumber);
	    	this.setName(name);
	    	
	    }
	    public int getphonenumber() {
	    	 return getPhonenumber();
	    }
	    public String getname () {
	    	return getName();
	    }
	    
	    public String toChararray(){
	    	return "phonenumber "+getPhonenumber() +"Name"+getName();
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPhonenumber() {
			return phonenumber;
		}
		public void setPhonenumber(int phonenumber) {
			this.phonenumber = phonenumber;
		}
}
public class AddressBook {
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,AdBook> map=new HashMap<Integer,AdBook>();
	public void addphonenumber(int phonenumber,AdBook p) {
		
		map.put(phonenumber,p);
		}
	
	public void deleteContact(int phonenumber) {
		if (map.containsKey(phonenumber)) {
			map.remove(phonenumber);
			System.out.println("contact is deleted successfully");
		}else {
			System.out.println("contact is not found"+phonenumber);
		}
	}
	public void print() {
		for(Map.Entry<Integer,AdBook>m:map.entrySet())
		{
			AdBook ad=(AdBook)m.getValue();
			System.out.println(ad.getPhonenumber()+" "+ad.getName());
		}
		
	}
	public void search(int phonenumber) {
		int flag=0;
		for(Map.Entry<Integer,AdBook>m:map.entrySet())
		{
			int Key=(int)m.getKey();
			if(Key==phonenumber) {
				flag=1;
				System.out.println("Contact Details Found...");
				AdBook b1=(AdBook)m.getValue();
				System.out.println("phone number is not found"+b1.getphonenumber());
			}
		}
		if(flag==0)
		{
			System.out.println("Contact Details Not Found ....");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("hellow world");
		Scanner sc=new Scanner(System.in);
		AddressBook d=new AddressBook();
		int number=0;
		String name=null;
		for(int i=0;i<3;i++) {
		System.out.println("enter the contact number ");
		 number=sc.nextInt();
		System.out.println("enter the contact name ");
		 name=sc.next();
		}
		AdBook a=new AdBook(number,name);
		
	d.addphonenumber(number,a);
	System.out.println("enter the contact for deletion ");
	d.deleteContact(sc.nextInt());
	d.print();
	System.out.println("enter the contact for Search ");
	d.search(sc.nextInt());
	    }
	}		

