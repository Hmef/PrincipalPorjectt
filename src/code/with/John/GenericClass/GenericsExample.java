package code.with.John.GenericClass;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
	
	
	public static void main(String[] args) {
		
		
		//IntegerPrinter printer = new IntegerPrinter(23); // Before create a Generic Class Printer <T> 
															//to be able to print all Objects we want to print 
		
		//printer.print();
		
		
		Printer<Integer> printer = new Printer<>(23); // in Olders version of Java, we used to have to put the type in <> again 
		
		printer.print();
	
	
		Printer<Double> doublePrinter = new Printer<>(33.5);
		
		doublePrinter.print();
		
		
		ArrayList<Cat> cats = new ArrayList<>();
		cats.add(new Cat("cat1",2));
		
		
		System.out.println("");
		System.out.println(" Java Support multiple different generic types ");
		
		shout("John", 74);
		
		
		// List<Integer> intList = new ArrayList<>(); 
		//intList.add(2);
		//printList(intList);  // ERROR -->  we can't pass in this list of Integer as this parameter
								// that's supposed to be a list of Object 
								// well even though an Integer is subclass of Object, a list of Integer is not a subclass of a list of objects 
								// so this doesn't work, this is a wild card will work to solve you problem 
		
		System.out.println("");
		System.out.println(" a Wild Card --> List<?> myList : ");
		List<Integer>  intList = new ArrayList<>();
		intList.add(2);
		
		// on appelle la méthode printList avec intList comme paramètre
		printList(intList);
		
	
		
		
		
		
		
		System.out.println("");
		 List<Cat> catList = new ArrayList<>(); 
		 catList.add(new Cat("cat 2", 2));
		 printList(catList);
		 
		
		
	}
	
	
	private static <T, V> void shout(T thingsToShout, V othersThingsToShout) {
		
		System.out.println(thingsToShout + "!!!!!");
		
		System.out.println(othersThingsToShout + "!!!!!");
	}

	// Create a method that can take a List that holds any type of Objects 
	// Quand on entends Objetcs, on trouve que c'est évident d'avoir List<Object> but ( more explication in top of this class )
	// 
	
	// private static void printList(List<Object> myList)
	
	// Instead of saying this is a list of Objects —> we say that this is going to be a list of unknown by passing a question mark 
	// This question mark is the wild card 
	
	private static void printList(List<?> myList) {
		
		System.out.println(myList);
	}
	
	
	
}
