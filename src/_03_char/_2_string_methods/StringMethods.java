package _03_char._2_string_methods;


public class StringMethods {
	public static void main(String[] args) {
		int num = 0;
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
			String dog = "dog";
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt
	
		char c = dog.charAt(num);
		

		// 3. Print the length of your String to the console.
		//    HINT: .length()
		while( num < 3) {
			char letters = dog.charAt(num);
			System.out.println(letters+" is index "+num);
			num += 1;
		}
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
		}
	}




