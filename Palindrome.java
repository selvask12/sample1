package sample;

public class Palindrome {
	public static void main(String[] args) {
		String name="amma";
		String rev="";
		for(int i=0; i<name.length(); i++) {
			rev=rev+name.charAt(i);
			
		}
		if(name.equalsIgnoreCase(rev)) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
