import java.util.Scanner;

public class ProcessingNumbers {
	public static void main (String[] args ){
		Scanner userInput= new Scanner(System.in);
		int max= userInput.nextInt();
		int min=max;
		int inputNumber;
		int totalSum;
		System.out.println("Enter 2 integers");
		inputNumber=max;
		totalSum=max;

		for (int i=0; i<2; i++){
			int a= userInput.nextInt();
			if (a>max){
				max=a;
			} if (a<min){
				min=a;
			}if (a%2==0){
				inputNumber+=a;
				totalSum=a;
			}
						
			}
			
	}}