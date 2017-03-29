package a;

public class SavingAccount extends Account {
	
	private double interest;
	private int a;

	public SavingAccount(double balance,double interest){
		super(balance);
		this.interest = interest;
	}
	
	@Override
	public void debit(double sub){
		if(a<12){
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			balance -=sub;
		}
	}
	
	public double getWithdrawableAccount(){
		if(a<12){
			return 0.00;
		}else{
		
		return balance;
		}
	}
	
	public void passTime(int time){
		a +=time;
		if(a==12){
		balance = balance * Math.pow(1+interest,12);
		}
					
	}
}


