package a;

import java.util.Scanner;


public class AccountTest {
	
	public static void main(String[] args){
		
		
		Account ac1 = new Account();
		Account ac2 = new Account();
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
		Scanner sc2 = new Scanner(System.in);
		double n  = sc2.nextDouble();
		ac2.debit(n);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		
		
	}
	

}
