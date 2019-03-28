package at.fhv.oo;

public class Address {
	private String _address;
	private String _plz;
	private String _city;
	
	public Address(String address, String plz, String city) {
		_address = address;
		_plz = plz;
		_city = city;
		System.out.println(_address  +' '+ _plz + ' '+_city);
	}
	

}
