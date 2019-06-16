package day50;

public class ExtremeSport extends Sport{
public void doSport() {
	System.out.println("doing extreme sport--sky diving");
}
//what we observed here 
//same method name
//same methodparemeter list
//same return type
//this is an instance method
//this is the optional annotation to make sure
//you have overriden the method correctly 
public String toString() {
	return"extreme message";
}

	public static void main(String[] args) {
		ExtremeSport e1=new ExtremeSport();
		e1.doSport();

	}

}
