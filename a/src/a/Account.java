package a;

public abstract class Account {
	
	protected double balance;
	
	public Account(double balance){
		this.balance = balance;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int time);
	
	
	public double getBalance(){
    	return balance;
    }
    
    public void credit(double add ){
		balance += add ;
	}
	
	public void debit(double sub){
		if(balance < sub){
			System.out.println("Debit amount exceeded account balance");
		}else{
		   balance -= sub;
		}
	}
}