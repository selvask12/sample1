package sample;

public class Test2 {
	public static void main(String[] args) {
		String a="malayalam";
		String rev="";
		for(int i=0;i<a.length();i++) {
			rev=rev+a.charAt(i);
		}
		if(a.equals(rev)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
