
public class Calculation {

	private int intValueOne;
	private int intValueTwo;
	private float floatValueOne;
	private float floatValueTwo;
	
	public Calculation()
	{
		
	}
	
	//Getters
	public void getInputValuesInt()
	{
		System.out.println("Value 1: " + intValueOne);
		System.out.println("Value 2: " + intValueTwo);
	}
	
	public void getInputValuesFloat()
	{
		System.out.println("Value 1: " + floatValueOne);
		System.out.println("Value 2: " + floatValueTwo);
	}
	
	//Text Methods
	
	public void textDisplayAdd()
	{
		System.out.println("The sum of these numbers added are:");
	}
	public void textDisplaySubtract()
	{
		System.out.println("The sum of these numbers subracted are:");
	}
	
	//Calculations
	public int intAddition(int i, int j)
	{
		intValueOne = i;
		intValueTwo = j;
		return i + j;
	}
	
	public int intSubtraction(int i, int j)
	{
		intValueOne = i;
		intValueTwo = j;
		return i - j;
	}
	
	public float floatAddition(float i, float j)
	{
		floatValueOne = i;
		floatValueTwo = j;
		return i + j;
	}
	
	public float floatSubtraction(float i, float j)
	{
		floatValueOne = i;
		floatValueTwo = j;
		return i - j;
	}
}
