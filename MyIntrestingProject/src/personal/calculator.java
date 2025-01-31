package personal;

public class calculator {

	public static void main(String[] args) {
		
				double x = 5.2;
				double y = 4.7;
				double z = 7.6;
				
				double result = subtraction(x,y,z);
				System.out.println("the result is "+result);
				
				result = subtraction(x,y,z);
				System.out.println("the result is "+result);
				
				result = subtraction(x,y,z);
				System.out.println("the result is "+result);
				
				result = subtraction(x,y,z);
				System.out.println("the result is "+result);

	}
	public static double addition(double x, double y, double z) {
		double sum = x + y + z;
		return sum;
		
	}

	public static double subtraction(double x, double y, double z) {
		double answer = x - y - z;
		return answer;
		
	}
	public static double multiplication(double x, double y, double z) {
		double result = x * y * z;
		return result;
		
	}
	public static double division(double x, double y, double z) {
		double quotient = x / y / z;
		return quotient;
		
	}
}

