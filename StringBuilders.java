package Preparation8;

public class StringBuilders {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("dhana");
		sb.append("jeyan");
		System.out.println(sb.hashCode());
		//System.out.println(sb.reverse());
		//sb.insert(1, "beautiful");
		//System.out.println(sb);
		sb.replace(2, 6, "comfort");
		System.out.println(sb);
		
	}

}
