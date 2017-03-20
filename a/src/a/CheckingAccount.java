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
		if(balance +50 > sub){
			balance -=sub;
			System.out.println("Debit amount exceeded account balance");
		}else
		{
		   balance -= sub;
		}
    }
	

}
