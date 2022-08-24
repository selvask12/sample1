package sample;

public class Test3 {
	public static void main(String[] args) {
		String[] a= {"sandy","praveen","ajith","nivi"};
		String min=a[1];
		for(int i=0; i<a.length; i++) {
			if(a[i].length()<min.length()) {
				min=a[i];
			}
		}
		System.out.println(min);
	}

}
