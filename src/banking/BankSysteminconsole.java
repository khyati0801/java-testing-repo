package banking;

import java.util.Scanner;

public class BankSysteminconsole {
	static {
		System.out.println("welcome to java BankingSystem:");
		
	}
	public static void main(String[] args) {
		String ch,pass,pass1;
		int Amt;
		
		Scanner sc=new Scanner(System.in);
		BankOperations ob1=new BankOperations();
		System.out.println("Create New Account");
		
		
		ob1.CreateAcc();
		System.out.println("Create Password");
		pass=sc.next();
		ob1.Show();
		
		
		
		do {
			System.out.println("\nEnter your choice(IN Capital letter only):");
			System.out.println("\nBank Operations:");
			System.out.println("\n 1:Deposit(D) \n 2.Withdraw(w) \n 3.CheckBalance(C) \n 4.exit(E)");
			ch=sc.next();
			System.out.println("Enter password");
			pass1=sc.next();
			
			if(pass1.equals(pass))
			{
			
			
		switch(ch) {
	
			
		case "D":
			System.out.println("Enter your amount to Deposit:");
			Amt=sc.nextInt();
			ob1.Deposit(Amt);
			System.out.println("Data Upadated");
			ob1.Show();
			break;
			
		case "W":
			System.out.println("Enter your amount to Withdraw:");
			Amt=sc.nextInt();
			ob1.withdraw(Amt);
			ob1.ShoWBalance();
			//ob1.Show();
			break;
			
		case "C":
			ob1.ShoWBalance();
			break;
			
		case "E":
			
			System.out.println("Exit from banking System");
			System.exit(0);
			
			break;
			
		default:
			
			System.out.println("enter choice W,D or E");
			
		}
		}
		else
		{
			System.out.println("you enter wrong password");
		}
			
		}while(ch!="E");
		
	}
		}
		
		
		
		
	
		
		
	


