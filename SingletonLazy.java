package Preparation8;

public class SingletonLazy {
	private static SingletonLazy single;
	private SingletonLazy() {
		System.out.println("Lazy Instanation");
		
	}
	public static SingletonLazy getSingleton() {
		if(single==null) {
			single=new SingletonLazy();
		}
		return single;
	}
	public static void main(String[] args) {
		SingletonLazy s=new SingletonLazy();
		System.out.println(s.hashCode());
		SingletonLazy s1=new SingletonLazy();
		System.out.println(s1.hashCode());
		SingletonLazy s2=new SingletonLazy();
		System.out.println(s2.hashCode());
	}

}
