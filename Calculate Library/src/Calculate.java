
public class Calculate {
	public static int square(int number){
		int answer;
		answer=number*number; 
		return(answer);
	
	}
	

	public static int cube(int number){
		int answer;
		answer=number*number*number;
		return(answer);
		
	}


	public static int average(int number1, int number2){ 
		int answer;
		answer=(number1+number2)/2;
		return(answer);
	
	}


	public static int average(int number1, int number2, int number3){
	int answer;
	answer=(number1+number2+number3)/3;
	return(answer);
	
	}


	public static double toDegrees(double radian){
	double answer;
	answer=(180/3.14159);
	return(answer);

	}

	public static double toRadians(double degrees){
		double answer;
		answer=(3.14159/180);
		return(answer);
	}


	public static double discriminant(double num1, double num2, double num3){
		return ((num2*num2-4* num1*num3));
	}
	
	public static String toImproperFrac( int wholenum, int numerator, int denominator, int improperNum){
		 improperNum= denominator * wholenum+ numerator;
		return(wholenum +"/"+  denominator);
	}

	public static String toMixedNum(int num, int den){
		boolean check= Calculate.isDivisibleBy(num , den);
		if(check==true) {
		return num/den + "";
		} else {
		return num/den + "_" + num % den + "/" + den;}
			
		}
		
	
	private static boolean isDivisibleBy(int a, int b) {
		// TODO Auto-generated method stub
		return false;
	}


	public static String foil (int a, int b, int c, int d, String e) {
		return (a*c + "x^2" + a*d + b*c+ "x" + b*d);
		}
	
	public static boolean inDivisbleby (int a, int b) {
		if (a % b == 0 || b % a == 0) { 
			return (true);
		}else{
			return(false); }
	}
	
	
	public static double absValue (double a){
	if (a>0){
	return a;
	}else return (a*-1);
	}
	
	public static int max (int a, int b){
		if (a>b){
		return a;
	}else if (b>a){
			return b;
		}
		return b;
	}
	
	
	public static double max(double a, double b ){
		if (a>b){
		return a;
		}else{
		return b;
			}
		}
	
	public static int min( int a, int b){
		if (a<b){
			return a;
		}else if (b<a){
			return b;
		}
		return b;
	}
	
	public static double round2 (double a) {
		double intnumber= (int)(a*100);
		double answer;
		if ((100*a) - intnumber >= .5) {
		answer= (int) (100*a+1);
		answer /= 100;
		return answer;
	
		}else{
			answer= (int) (100*a);
			answer /=100;
			return answer;
		
		}
	}
	
		
	//part 3
	
	
	public static double exponent1 (double b, int p) { 
		if (p < 0) {
			throw new IllegalArgumentException("negative exponent: " + p);
		}
		double answer = 1;
		for (int i = 1; i <= p; i++) {
			answer *= b;
		}
		return answer;
	}
			public static int factorial (int pos){
				if (pos<0){
						throw new IllegalArgumentException("Number for factorial must be positive.");
					}
				int answer=1;
				if (pos==0){
					return(1);
				}
				for(int i=1; i<= pos; i++){
					answer *=i;
				}
				return answer;
			}
}
	
	

			
	
