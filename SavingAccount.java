package a;

public class SavingAccount extends Account {

	private double interest;
	private int aTime;
	private int contractPeriod = 12;

	public SavingAccount(double balance, double interest) {
		super(balance);
		this.interest = interest;
		aTime = 0;
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


	public double getWithdrawableAccount() {
		return (aTime < contractPeriod) ? 0 : balance;
	}

	public void passTime(int time) {
		if (time >= 0) {


	
	public double getWithdrawableAccount(){
		return (aTime<contractPeriod)? 0 : balance;
		}
	
	public void passTime(int time){
		if(time>0){

			aTime += time;

			if (((time < contractPeriod) && (aTime >= contractPeriod)) || (time >= contractPeriod)) {
				balance *= Math.pow(1 + interest, contractPeriod);

			if((time<=contractPeriod) && (aTime>=contractPeriod) ){
				balance *= Math.pow(1+interest,contractPeriod);

			}
		}
	}


	
	public double estimateValue(int month){
		balance *= Math.pow(1+interest,month);

		return balance;
	}
	@override
	public double estimateValue(){
		balance *= Math.pow(1+interest,1);

		return balance;
	}
	    
	    
    }

}