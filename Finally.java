package Preparation8;

public class Finally {
	
	public static void main(String[] args) {
		Finally f=new Finally();
		System.out.println(f.hashCode());
		f=null;
		System.gc();
		System.out.println("garbage collected");
	}
		public void finalize() {
			System.out.println(" finalize garbage collected");
		}
		
	

}
