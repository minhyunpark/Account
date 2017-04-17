package a;

public class CheckingAccount extends Account {

	private double creditLimit;
	private double interest;
	private double loanInterest;

	public CheckingAccount(double balance, double creditLimit, double interest, double loanInterest) {
		super(balance);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
	}

	@Override
	public void debit(double amount) throws Exception {
		if (amount > 0) {
			if (balance + creditLimit > amount) {
				super.debit(amount);
				if (balance < 0) {

					throw new Exception("Debit amount exceeded account balance");
				}
			} else {

				throw new Exception("No withdrawal");
			}
		} else
			throw new Exception("음수입력");
	}

	public double getWithdrawableAccount() {
		return (balance + creditLimit > 0) ? balance + creditLimit : 0;
	}

	public void passTime(int time) {
		if (balance >= 0) {
			balance *= Math.pow(1 + interest, time);
		} else {
			balance *= Math.pow(1 + loanInterest, time);
		}
	}


	public boolean isBankrupted() {
		return balance < -creditLimit;
	}

	


	public double getWithdrawableAccount(){
    	return(balance + creditLimit >0)? balance+creditLimit : 0;
    }
    
    public void passTime(int time){
    	if(balance>=0){
    		balance *= Math.pow(1+interest,time);
    		 
    	}else {
    		balance *= Math.pow(1+loanInterest,time);
    		
    	}
    }
    
    
    
    public  boolean isBankrupted(){
    	return balance > -creditLimit;
     }
    
    public double estimateValue(int month){
    	if(balance>=0){
    		balance *= Math.pow(1+interest,month);
    		return balance;
    		 
    	}else {
    		balance *= Math.pow(1+loanInterest,month);
    		return balance;
    		
    	}
    }
   @override
    public double estimateValue(){
    	if(balance>=0){
    		balance *= Math.pow(1+interest,1);
    		return balance;
    		 
    	}else {
    		balance *= Math.pow(1+loanInterest,1);
    		return balance;
    		
    	}
    
    }
    
    }
    public String toString(){
		return String.format("CheckingAccount_Balance : " + balance);
    }

}