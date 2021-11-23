
public class Hello {	
	public static void main(String[] args) {
		
		//Human Class Constructor Example
		Human Fred = new Human("Fred", 21, true, 1.9f);
		System.out.println("Human constructor example: ");
		
		System.out.println(Fred.returnName());
		System.out.println(Fred.returnAge());
		Fred.getAlive();
		Fred.getAverageAmountOfLegs();
		
		//Class Example 1 - Human
		Human James = new Human("0", 0, false, 0.0f);
		System.out.println("Human class example: ");
		
		//Setters
		James.setName("James");
		James.setAge(25);
		James.setIsAlive(true);
		James.setAverageAmountOfLegs(1.8f);
		
		//Getters
		
		System.out.println(James.returnName());
		System.out.println(James.returnAge());
		James.getAlive();
		James.getAverageAmountOfLegs();
	
		//Class Example 2 - Calculation
		Calculation Calculate = new Calculation();
		System.out.println("Calculation class example: ");
		
		//Int Calculations
		System.out.println("5 + 6 = ");
		Calculate.textDisplayAdd();
		System.out.println(Calculate.intAddition(5, 6));
		Calculate.getInputValuesInt();
		
		System.out.println("9 - 4 = ");
		Calculate.textDisplaySubtract();
		System.out.println(Calculate.intSubtraction(9, 4));
		Calculate.getInputValuesInt();
		
		//Float Calculations
		System.out.println("2.5 + 4.2 = ");
		Calculate.textDisplayAdd();
		System.out.println(Calculate.floatAddition(2.5f , 4.2f));
		Calculate.getInputValuesFloat();
		
		System.out.println("3.2f - 1.0f = ");
		Calculate.textDisplaySubtract();
		System.out.println(Calculate.floatSubtraction(3.2f, 1.0f));
		Calculate.getInputValuesFloat();

	}

}
