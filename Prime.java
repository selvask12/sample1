package sample;

public class Prime {
	public static void main(String[] args) {
		int a=5;
		String isprime="";
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				isprime="yes";
			}
		}
			if(isprime.equals("yes")) {
				System.out.println("prime number");
			}
			else {
				System.out.println("not prime");
			}
		}
	}


