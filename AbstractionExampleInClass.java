
abstract  class Vehicle  { //Declaring class abstract by abstract keyword

	abstract  void start(); //Declaring method abstract by abstract keyword
	
}

class Car extends Vehicle { //inheriting Vehicle class by extends keyword
		
	  void start(){ //it is necessary to implement abstract method in child class 

    System.out.println("car starts with key");

}
	
}


public class AbstractionExampleInClass extends Vehicle  {
	void  start(){

	    System.out.println("Scooter starts with kick");

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.start(); //calling start method in Car class

		AbstractionExampleInClass abs = new AbstractionExampleInClass ();

		abs.start();  //calling start method in Car class

	}

}
