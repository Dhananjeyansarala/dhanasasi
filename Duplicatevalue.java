package Preparation8;

public class Duplicatevalue {
	public static void main(String[] args) {
		String name="beautiful";
		char[] b=name.toCharArray();
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(b[i]==b[j]) {
					System.out.println(b[j]);
					break;
				}
			}
			
		}
	}

}
