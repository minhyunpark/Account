package a;

public abstract class Account implements Valuable {
	
	protected double balance;
	
	
	public Account(double balance){
		this.balance = balance;

	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime();
	public abstract void passTime(int month);
	
	
	public double getBalance(){
    	return balance;
    }
    
    public void credit(double add ){
		balance += add ;
	}
	
    public void debit(double amount) throws Exception {
		balance -= amount;
	}
	
	 
}