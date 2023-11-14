package Day12;
import java.util.Scanner;
class BankAccountTest{
	private int number;
	private int balance;
public BankAccountTest(int number,int balance) {
	this.number=number;
	this.balance=balance;
}
public void deposite(int amount) {
	balance=balance+amount;
	System.out.println("your deposite is success full"+balance);
}
public void withdraw(int amount) {
	if(amount<=balance) {
		int bal=balance-amount;
		System.out.println("your balance is"+bal);
	}else {
		System.out.println("insufficent funds");
		
	}
}
}

 class SavingsAccount extends BankAccountTest{
	 public SavingsAccount(int number,int balance) {
		 super(number,balance);
		 if(balance>0) {
			 System.out.println("your balance is"+balance);
			 
		 }
	 }
		 public void calculateInterest(double balance) {
			 double rate=2;
		  rate= balance * (rate/100);
		 System.out.println("your interst rate is"+rate);
	 }
 }
 public class BankAccount {
 
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 BankAccountTest[] ac = new BankAccountTest[1];
		 
		 System.out.println("Enter the deposite amount");
		int dep=(sc.nextInt());
		System.out.println("Enter the withdraw amount");
		 int draw=(sc.nextInt());
		 for(int i=0;i<ac.length;i++) {
		 ac[i] = new SavingsAccount(sc.nextInt(), sc.nextInt());
	       ac[i].deposite(dep);
	       ac[i].withdraw(draw);
	       
		 }
		 SavingsAccount sa=new SavingsAccount(sc.nextInt(), sc.nextInt());
		 
		 System.out.println("Enter the rate of interst");
		 sa.calculateInterest(sc.nextDouble());
		 }
	 
	 
	 }
 
