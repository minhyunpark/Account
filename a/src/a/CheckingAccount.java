package a;

public class CheckingAccount extends Account {
	
	private double creditLimit;
	private double interest;
	private double loanInterest;
	
	CheckingAccount(double balance,double credit_limit,double interest,double loan_interest){
		super(balance);
		this.creditLimit = credit_limit;
		this.interest = interest;
		this.loanInterest = loan_interest;
	}

	@Override
    public void debit(double sub){
		if(balance - creditLimit > sub){
			balance -=sub;
			if(balance<0){
			System.out.println("Debit amount exceeded account balance");
			}
		}else
		{
		   System.out.println("No withdrawal");
		}
		
	}
    public void nextMonth(){
    	if(balance>=0){
    	balance *= (1+interest);
    	}else{
    	balance *= (1+loanInterest);
    	}
    }
}
	


