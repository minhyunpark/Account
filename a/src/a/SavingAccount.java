package a;

public class SavingAccount extends Account {
	
	private double interest;
	private int aTime;
	private int contractPeriod = 12;

	public SavingAccount(double balance,double interest){
		super(balance);
		this.interest = interest;
		aTime = 0;
	}
	
	@Override
	public void debit(double sub){
		if(aTime<contractPeriod){
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			balance -= sub;
		}
	}
	
	public double getWithdrawableAccount(){
		return (aTime<contractPeriod)? 0 : balance;
		}
	
	public void passTime(int time){
		if(time<0){
			
		}else{
			aTime += time;
			if((time<contractPeriod) && (aTime>contractPeriod) ){
				balance = balance * Math.pow(1+interest,contractPeriod);
			}
		}
					
	}
	public double EstimateValue(int month){
		balance = balance * Math.pow(1+interest,month);
		return balance;
	}
	 public String toString(){
			return String.format("SavingsAccount_Balance : " + balance);
	    }
}


