package helloPackage;

public class Stuff implements IStuff{
	int age;
	int id;
	String ssn = "555-555-5555";


	Stuff(){
		age = 30;
		id = 4000;

	}
	Stuff(int a, int i){
		age = a;
		id = i;
	}


	public int getNums(){
		return (id + age);
	}

	public static class Address {
		int numAddress;
		String street;
		String city;
		int zip;


		Address(int na, String s, String c, int z){
			 numAddress = na;
			 street = s;
			 city = c;
			 zip = z;
		}
		void getAddress(){
			this.numAddress = numAddress;
			this.street = street;
			this.city = city;
			this.zip = zip;


		}





	}



	@Override
	public void getSsn() {

	}

	@Override
	public void showMore() {

	}



}

