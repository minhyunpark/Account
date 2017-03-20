package a;

import java.util.Scanner;


public class AccountTest {
	
	public static void main(String[] args){
		
		CheckingAccount ac1 = new CheckingAccount(100,-50,0.01,0.07);
		CheckingAccount ac2 = new CheckingAccount(100,-50,0.01,0.07);
		System.out.printf("Account1 balance : $%.2f\n",ac1.balance);
		System.out.printf("Account2 balance : $%.2f\n",ac2.balance);
	    System.out.printf("Enter deposit amount for Account1 : ");
	    
	    Scanner sc1 = new Scanner(System.in);
	    double m  = sc1.nextDouble();
		ac1.credit(m);
		System.out.printf("\nAccount1 balance : $%.2f\n",ac1.balance);
		System.out.printf("Account2 balance : $%.2f\n",ac2.balance);
		System.out.printf("Enter withdrawl amount for Account2 : ");
		double n  = sc1.nextDouble();
		ac2.debit(n);
		System.out.printf("\nAccount1 balance : $%.2f\n",ac1.balance);
		System.out.printf("Account2 balance : $%.2f\n",ac2.balance);
		ac1.nextMonth();
		ac2.nextMonth();
		System.out.printf("\nnext month!",ac1.balance);
		System.out.printf("\nAccount1 balance : $%.2f\n",ac1.balance);
		System.out.printf("Account2 balance : $%.2f\n",ac2.balance);
		
		
		
		
	}
	}




/*package a;

import java.util.Scanner;


public class AccountTest {
	
	public static void main(String[] args){
		
		
		Account ac1 = new Account(0);
		Account ac2 = new Account(0);
		ac1.credit(50);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		System.out.printf("\nEnter withdrawal amount for account :");
		Scanner sc1 = new Scanner(System.in);
		double m  = sc1.nextDouble();
		ac1.debit(m);
		System.out.printf("\nsubtracting %.2f from account balance \n",m);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		System.out.printf("\nEnter withdrawal amount for account :");
		
		double n  = sc1.nextDouble();
		ac2.debit(n);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		
		
	}
	

}
*/