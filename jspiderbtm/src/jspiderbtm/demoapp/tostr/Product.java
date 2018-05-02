package jspiderbtm.demoapp.tostr;

public class Product {
String barcode;
double price;

@Override
	public int hashCode() {
		return barcode.hashCode();
	}
@Override
	public String toString() {
		return this.barcode +"  " +this.price;
		}
public static void main(String[] args) {
	Product p = new Product();
	p.barcode ="sdggg";
	p.price = 150;
	System.out.println(p);
	System.out.println(p.hashCode());
}
}
