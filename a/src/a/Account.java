package a;



public class Account {
	
	
	protected double balance;
	
	Account(double balance){
		this.balance = balance;
	}
	
	
    public double getBalance(){
    	return balance;
    	 }
    
    public void credit(double add ){
		
		balance += add ;
	}
	
	public void debit(double sub){
		
		
		if(balance < sub){
			System.out.println("Debit amount exceeded account balance");
		}else{
			
		   balance -= sub;
		    
		    
		   
		}
		
		
		
	}
    
	
}
