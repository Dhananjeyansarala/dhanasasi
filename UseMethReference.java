package Preparation8;

public class UseMethReference {
	public String vegHotel(String food) {
		return food;
	}
	public static void main(String[] args) {
		String food="Noodles";
		UseMethReference ref=new UseMethReference();
		MethReference hotel=ref::vegHotel;
		System.out.println(hotel.Hotel(food));
		
	}

}
