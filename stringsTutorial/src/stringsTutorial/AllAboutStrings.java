package stringsTutorial;

public class AllAboutStrings {

	public static void main(String[] args) {
		String basicGreeting = "Hello World, string class is meant for single thread app bc it is not thread safe";
		
		basicGreeting.toUpperCase();//cannot modify the existing string
		//basicGreeting.charAt(0) = "T"
		
		//must creating another string for the modications
		
		String newString = basicGreeting.toUpperCase();
		
		System.out.println(newString);
		
		
		//StringBuilder and StringBuffer
		
		StringBuilder s1 = new StringBuilder(basicGreeting);
		StringBuffer s2 = new StringBuffer(newString);
		
		//we can modify using these two classes
		
		s1.reverse().append(s2);
		
		System.out.println(s2.toString());
		System.out.print(s1.toString());
		System.out.print(s1);
	
		//stringbuilder is faster but not thread safe
		//stringbuffer is slower but is thread safe
		
		
	
	}

}
