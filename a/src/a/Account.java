package a;



public class Account {
	
	private double balance;
	
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
