package implicitexample;
//created package name as implicitexample

public class TypeDemo {
 //created class name as TypeDemo
	public static void main(String[] args) {
	 //created main method

		//here taking different type variables as short and double
	    short short1 = 4000;
	    double double1 = .10101;
	    
	    // here promoting short into double
	    double result = double1 * short1;
	    
	    //  prints the result 
	    System.out.println("double to short is " + result);
	    
	    int integer=60;//we are taking another integer
		float float1=integer;
		//and float value. integer value is equal to float
		System.out.println("int to float:"+integer);
		short short2 =(short)float1;
		//taking another value in short and converting it from integer to short
		System.out.println("float to short:"+short2);


	}

}
