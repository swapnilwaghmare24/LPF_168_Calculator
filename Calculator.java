public class Calculator()
{
	public double add(double num1,double num2)
	{
		return num1+num2;
	}
	public static void main(String[] args)
	{
		Calculator calculator= new Calculator();
		double result=calculator.add(10.15,20.30);
		System.out.println(result);
	}

}