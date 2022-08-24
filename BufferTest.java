package sample;

public class BufferTest {
	public static void main (String[] args) {
		StringBuffer buffer=new StringBuffer("selva");
		buffer.append("kumar");
		System.out.println(buffer);
		
		StringBuilder builder=new StringBuilder("ajith");
		builder.append("kumar");
		System.out.println(builder);
		
	}

}
