package Preparation8;

public class ReverseString {
	public static void main(String[] args) {
		String a="dhananjeyan";
		String temp="";
		for(int i=a.length()-1;i>=0;i--) {
			temp=temp+a.charAt(i);
		}
			System.out.println(temp);
		}
	

}
