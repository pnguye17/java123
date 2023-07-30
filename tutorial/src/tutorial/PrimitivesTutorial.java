package tutorial;

public class PrimitivesTutorial {

	public static void main(String[] args) {
		//primitves must have value, cannot be null
		
		boolean isStudent = true;
		char letter = 'a';
		
		byte b = 1;
		short s = 1;
		int i = 1;
		long l = 1L;
		
		float f = 1f;
		double d = 1d;
		
		//non-primitives refer to objects, strings are immutable
		
		
		String string = "Hi";
		String[] greetings = {"Hello", "Goodbye"};
		
		//perform methods on non primitives only 
		
		System.out.println(string.toString());
		
		//cannot invoke methods on primitves 
		// int lengthOfLetter = letter.length
		
		
		
		

	}

}
