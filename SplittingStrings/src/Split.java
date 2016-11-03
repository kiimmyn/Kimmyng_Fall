import java.util.Arrays;

// Kimmy Ng
// APCS2
//10/29/16
// second period

public class Split {



	public static void main(String[] args) 
	{
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		String example = new String (" I like apples.");
		String[] array = example.split("  ");
		System.out.print(Arrays.toString(array));
		
		String example2 = new String (" I really like really red apples");
		String[] array2 = example2.split("really?");
		System.out.print(Arrays.toString(array2));
		
		// task1:
	    task1("applespineapplesbreadlettucestomatobaconmayohambreadcheese");
	    task1("applesbreadtomatobreadcheese");
	    task1("breadbreadbread");
	    task1("breadbread");
	    task1("bread");
	    
	    // task2:
	    task1("apples pineapples bread lettuces tomato bacon mayo ham bread cheese");
	    task1("apples bread tomato bread cheese");
	    task1("breadbreadbread");
	    task1("breadbread");
	    task1("bread");
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		String sandwich = new String("applespineapplesbreadlettucestomatobaconmayohambreadcheese");
		String food[]= sandwich.split("bread");
		int breadPosition = sandwich.indexOf("bread");
		int breadPosition2 = sandwich.indexOf("bread", breadPosition + 5);
		if (breadPosition < 0 || breadPosition >= 0 || breadPosition < 0) {
			System.out.println("Not a sandwich");
		} else if (sandwich.indexOf(food[food.length-1])<breadPosition) {
			System.out.println("Not a sandwich");
		} else if (sandwich.indexOf(food[food.length-1])<breadPosition2) {
			for(int i = 1; i <= food.length-1; i++) {
				System.out.println(food[i]);
			}
		} else {
			for (int i = 1; i <= food.length-2; i++) {
				System.out.println(food[i]);
			}
		}
		}
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/
		 public static void task2 (String sandwich){ 
		        int bread1 = sandwich.indexOf("bread");
		        int bread2 = sandwich.indexOf("bread", bread1 + 6);
		        if(bread1 < 0 && bread1 >=0 && bread2 < 0){
		            System.out.println("Not a sandwich");
		        } else{
		        	if (bread1+6 == bread2) {
		        
		            System.out.println("Not a sandwich");
		        } else{
		        if(bread1 == 0) {
		        
		            System.out.println("Not a sandwich");
		        } else {
		            System.out.println(sandwich.substring(bread1+6, bread2));
		        }
		        }}
		
		

	}

	private static void task1(String string) {
		// TODO Auto-generated method stub
		
	}
}
