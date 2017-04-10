package a;

public class Car implements Valuable{
	public final String name;
	private double price;
	
	public Car(String name,double price){
		this.name = name;
		this.price = price;
	}
	
	public double EstimateValue(int month){
		price = 0.8*price;
		price = price * Math.pow(0.99,month);
			return price;
		}
	
	public String toString(){
		return String.format("car name : %s \ninital price : %.2f" ,name,price);
		
	}
	
}
