package jspiderbtm.demoapp.tostr;

public class City {
	int pincode;
	String name;
@Override
public String toString() {
	return this.pincode +"   "+this.name;
	
	}
@Override
public int hashCode() {
	return this.pincode;
	}
public static void main(String[] args) {
	City c1 = new City();
	c1.name="banglore";
	c1.pincode=560001;
	System.out.println(c1);
}
}
