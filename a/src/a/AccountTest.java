package a;

import java.util.Scanner;


public class AccountTest {
	
	public static void main(String[] args){
		
		
		Account ac1 = new Account();
		Account ac2 = new Account();
		ac1.credit(50);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		System.out.printf("\nEnter withdrawal amount for account%d :");
		Scanner sc = new Scanner(System.in);
		double m = sc.nextDouble();
		ac1.debit(m);
		System.out.printf("\nsubtracting %.2f from account%d balance \n",m);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		ac2.debit(m);
		System.out.printf("account1 balance : $%.2f\n",ac1.getBalance());
		System.out.printf("account2 balance : $%.2f\n",ac2.getBalance());
		
		
	}
	

}
