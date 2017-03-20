package a;

public class CheckingAccount extends Account {
	
	private double credit_limit;
	private double interest;
	private double loan_interest;
	
	CheckingAccount(double balance,double credit_limit,double interest,double loan_interest){
		super(balance);
		this.credit_limit = credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}

	@Override
    public void debit(double sub){
		if(balance - credit_limit > sub){
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
    	balance *= (1+loan_interest);
    	}
    }

}
	



