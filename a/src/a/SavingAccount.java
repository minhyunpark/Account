package a;

public class SavingAccount extends Account {
	
	private double interest;
	private int accumlateTime;
	private int contractPeriod = 12;

	public SavingAccount(double balance,double interest){
		super(balance);
		this.interest = interest;
		accumlateTime=0;
	}
	
	@Override
	public void debit(double sub){
		if(accumlateTime<contractPeriod){
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			balance -=sub;
		}
	}
	
	public double getWithdrawableAccount(){
		if(accumlateTime<contractPeriod){
			return 0.00;
		}else{
		
		return balance;
		}
	}
	
	public void passTime(int time){
		accumlateTime +=time;
		if(accumlateTime==contractPeriod){
		balance = balance * Math.pow(1+interest,contractPeriod);
		}
					
	}
}


