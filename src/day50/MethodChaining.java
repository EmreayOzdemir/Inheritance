package day50;

public class MethodChaining {

	public static void main(String[] args) {//bu ornekte block called another method
	//step1
		methodA();
       //step7
	}

	public static void methodA() {
		//step2 
		methodB();
		//step6
		System.out.println("methodA called");
	}
	public static void methodB() {
		//step3
		System.out.println("B called");
		//step4
		methodC();
	}
	public static void methodC() {
		//step5
		System.out.println("c called");
	}
	
}
