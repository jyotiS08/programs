package jspiderbtm.demoapp.tostr;

public class Citizen {
	long adharNumber;
	String name;
	@Override
	public int hashCode() {
		Long wl = this.adharNumber;
		return wl.hashCode();
		}
	@Override
	public String toString() {
		return  this.name + "   " + this.adharNumber;
	
	}
	public static void main(String[] args) {
		Citizen c = new Citizen();
		c.adharNumber= 123456789;
		c.name = "abc";
		System.out.println(c);
	}

}
