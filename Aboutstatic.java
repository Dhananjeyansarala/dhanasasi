package Preparation8;

public class  Aboutstatic {
	static String collageName;
	String name;
	int age;
	int noOfStudents;
	static {
		collageName="Aaadhiparasakthi";
		
	}
	Aboutstatic(String name,int age,int noOfStudents) {
		this.name=name;
		this.age=age;
		this.noOfStudents=noOfStudents;
	}
	public void get() {
		System.out.println(name+" "+age+" "+noOfStudents+" "+collageName);
	}
	public static void main(String[] args) {
		Aboutstatic as=new Aboutstatic("Dhananjeyan",25,1);
		as.get();
	}
	  
	

}
