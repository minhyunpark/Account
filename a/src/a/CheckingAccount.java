package a;

public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	
	public CheckingAccount(double balance,double creditLimit,double interest,double loanInterest){
		super(balance);
		this.creditLimit = creditLimit;
		this.interest = interest;
		this.loanInterest = loanInterest;
		
	}
	@Override
    public void debit(double sub){
		if(balance + creditLimit > sub){
			balance -=sub;
			if(balance<0){
			System.out.println("Debit amount exceeded account balance");
			}
		}else
		{
		   System.out.println("No withdrawal");
		}
		
	}

	
    
	public double getWithdrawableAccount(){
    	if(balance + creditLimit >0){
    		return balance + creditLimit;
    	}else{
    		return 0;
    	}
    }
    
    public void passTime(int time){
    	if(balance>=0){
    		 balance *= (1+time*interest);
    		
    	}else {
    		 balance *= (1+time*loanInterest);
    		
    	}
    }
    
    public  boolean isBankrupted(){
    	if(balance + creditLimit >0){
    		return true;
    	}else{
    		return false;
    	}
     }
}

	


