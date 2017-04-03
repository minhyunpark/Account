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
			super.debit(sub);
			if(balance<0){
			System.out.println("Debit amount exceeded account balance");
			}
		}else{
		   System.out.println("No withdrawal");
		}
	}

	public double getWithdrawableAccount(){
    	return(balance + creditLimit >0)? balance+creditLimit : 0;
    }
    
    public void passTime(int time){
    	if(balance>=0){
    		balance = balance * Math.pow(1+interest,time);
    		 
    	}else {
    		balance = balance * Math.pow(1+loanInterest,time);
    		
    	}
    }
    
    public  boolean isBankrupted(){
    	return balance > -creditLimit;
     }
}

	


