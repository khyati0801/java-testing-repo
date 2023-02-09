package banking;

import java.util.Scanner;

public class BankOperations {
	private String Name;
	private long mobile;
	private long Accno;
	private int Balance;
	private String  pass;
	
	Scanner sc=new Scanner(System.in);
	public void CreateAcc() {
		
		System.out.println("Enter your Name:");
		 Name=sc.next();
		
		System.out.println("Enter mobile Number:");
		 mobile=sc.nextLong();
		
		System.out.println("Enter Account Number:");
		 Accno=sc.nextLong();
		 
		
		System.out.println("Enter Amount to Deposit:");
		Balance=sc.nextInt();
		
		
		
			
	}
	public  void Show() {
		System.out.println("Account Details:");
		System.out.println("Name:"+Name+"\nAccountno:"+Accno+"\nMobile:"+mobile+"\nBalance:"+Balance);
		
		
	}
	public void ShoWBalance() {
		
		System.out.println("Current Balance in your Account:"+Balance);
	}
	
	public int  Deposit(int Amt) {
		
		return Balance=Balance+Amt;
		
	}
public int  withdraw(int Amt) {
		if(Amt>=Balance) {
			System.out.println("can't withdraw insufficient balance in your Account "+Balance);
			
			return Balance;
		}
		else {
		return Balance=Balance-Amt;
		}
	}
}
