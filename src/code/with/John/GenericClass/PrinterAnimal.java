package code.with.John.GenericClass;

public class PrinterAnimal <T extends Animal> {

	
	// <T extends Animal> is called : bounded Generic 
	//because you're giving a certain bound a limit on the type that's able to be passed
	
	// can also use boud with interfaces 
	
	// let's say you wanted to guarantee that this type implemented the serializable interface 
	// you just put in extends serializable  <T implements Serializable>  but no 
	// it still has to be extends not implements
	
	
	T thingToPrint;

	// Generics don't work with primtive types ( int, float, char ... )
	// we have to do is just use the WRAPPER classes like Integer

	// That's probably used Generics all the time with Java's Collection framework
	// Collection framework: Arraylist, LinkedList

	// for example, if you wanted to create an Arraylist, probably you've specified
	// in angle brackets <> the type of things
	// that you want to have in your List

	public PrinterAnimal(T thingToPrint) {

			this.thingToPrint = thingToPrint;
		}

	public void print() {

		thingToPrint.eat(); // methode hérité de la classe mére Animal
		System.out.println(thingToPrint);
	}
}
