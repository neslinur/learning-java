public class StaticMethods
{
	public static void main(String[] args)
	{
		double area = 5.5;
		int investmentReturn = (int)getReturn(area);
		System.out.println("For " + area + " hectares, the return is " + investmentReturn + " USD.");

		area = 2.0;
		investmentReturn = (int)getReturn(area);
		System.out.println("For " + area + " hectares, the return is " + investmentReturn + " USD.");
	}
	
	//add the 3 methods below
	public static double getReturn(double a){
		return (a * 4) * 4000;
	}

	public static double getTonnes(double a){
		return a * 4;
	}

	public static double getUSD(double a){
		return a * 4000;
	}
}

