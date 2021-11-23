
public class Human {
	private String name;
	private int age;
	private boolean isAlive;
	private float averageAmountOfLegs;
	
	public Human(String Name, int Age, boolean IsAlive, float AverageAmountOfLegs)
	{
		name = Name;
		age = Age;
		isAlive = IsAlive;
		averageAmountOfLegs = AverageAmountOfLegs;
	}
	
	//Setters
	public void setName(String nameGiven) {
		name = nameGiven;
	}
	public void setAge(int ageGiven) {
		age = ageGiven;
	}
	public void setIsAlive(boolean isAliveStatus) {
		isAlive = isAliveStatus;
	}
	public void setAverageAmountOfLegs(float averageAmountOfLegsGiven) {
		averageAmountOfLegs = averageAmountOfLegsGiven;
	}
	
	//Getters
	public String returnName()
	{
		return name;
	}
	public int returnAge()
	{
		return age;
	}
	public void getAlive()
	{
		System.out.println(isAlive);
	}
	public void getAverageAmountOfLegs()
	{
		System.out.println(averageAmountOfLegs);
	}
}
