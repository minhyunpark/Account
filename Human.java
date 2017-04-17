package a;

public class Human implements Valuable {
	public final String name;
	private int age;
	
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public double estimateValue(int month){
		return Double.POSITIVE_INFINITY;
	}
	
	@override
	public double estimateValue(){
		return Double.POSITIVE_INFINITY;
	    
    }
	public String toString(){
		return String.format("Human name : %s \nregitstered age :  %d",name,age);
		
	}
}
