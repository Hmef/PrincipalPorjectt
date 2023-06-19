package code.with.John.GenericClass;

public class Printer <T> {

	T thingToPrint;

	// Integer thingToPrint;

	/*
	 * public PrinterInteger(integer thingToPrint) {
	 * 
	 * this.thingToPrint = thingToPrint; }
	 */

	
	// Generics don't work with primtive types ( int, float, char ... ) 
	// we have to do is just use the WRAPPER classes like Integer 
	
	// That's probably used Generics all the time with Java's Collection framework 
	// Collection framework: Arraylist, LinkedList 
	
	// for example, if you wanted to create an Arraylist, probably you've specified in angle brackets <> the type of things 
	// that you want to have in your List
	
	public Printer(T thingToPrint) {

		this.thingToPrint = thingToPrint;
	}

	
	/*
	 * public void printInteger() {
	 * 
	 * System.out.println(thingToPrint); }
	 */
	
	public void print() {

		System.out.println(thingToPrint);
	}
}
