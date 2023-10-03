package Preparation8;

public class SingletonEarly {
	private static SingletonEarly single=new SingletonEarly();
	private SingletonEarly() {
		System.out.println("Early Instanation");
	}
	public static SingletonEarly getSingleton() {
		return single;
	}
	public static void main(String[] args) {
		SingletonEarly s=SingletonEarly.getSingleton();
		System.out.println(s.hashCode());
		SingletonEarly s2=SingletonEarly.getSingleton();
		System.out.println(s2.hashCode());
		
	}

}
