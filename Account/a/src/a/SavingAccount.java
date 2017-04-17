package a;

public class SavingAccount extends Account {
	
	private double interest;
	private int aTime;
	private int contractPeriod = 12;
	private double valueBalance;

	public SavingAccount(double balance,double interest){
		super(balance);
		
		this.interest = interest;
		aTime = 0;
		valueBalance = balance;
	}
	
	@Override
	public void debit(double amount) throws Exception {
		if (amount > 0) {
			if (aTime < contractPeriod) {

				throw new Exception("아직 출금할 수 없습니다.");
			} else {
				super.debit(amount);
				if (balance < 0)
					throw new Exception("Debit amount exceeded account balance");
			}
		} else {
			throw new Exception("음수입력");
		}
	}

	
	public double getWithdrawableAccount(){
		return (aTime<contractPeriod)? 0 : balance;
		}
	 
	@Override
	public void passTime(int time){
		if(time>0){
			aTime += time;
			if(((time<=contractPeriod) && (aTime>=contractPeriod)) || time>=contractPeriod){
				balance *= Math.pow(1+interest,contractPeriod);
			}
		}
					
	}
	 @Override
	public void passTime(){
		
			aTime += 1;
			if(aTime>=contractPeriod){
				balance *= Math.pow(1+interest,contractPeriod);
			}
		
					
	}
	
	
	@Override
	public double estimateValue(int month){
		
		valueBalance *= Math.pow(1+interest,month);
		return valueBalance;
	}
	
	@Override
	public double estimateValue(){
		
		valueBalance *= Math.pow(1+interest,1);
		return valueBalance;
	}
	 public String toString(){
			return String.format("SavingsAccount_Balance : " + balance);
	    }
}


