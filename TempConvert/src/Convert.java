/**
*author APCS2 Kimmy Ng
*9/17/16
*This program will convert temperature in Fahrenheit into Celsius
*/

public class Convert {
	public static void main(String[] args) {
		int tempOfFah= 302;
		double tempOfCel;
		tempOfCel= (tempOfFah - 32) * 5/9;
		System.out.println("Temperature of Celcius is: " + tempOfCel);
			
	}
}