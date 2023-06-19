package code.with.John.GenericClass;

public class PrinterDifferentGenericTypes <T, V>{
	
	
	T thingToPrint;

	V otherThingToPrint;

	
	public PrinterDifferentGenericTypes(T thingToPrint, V otherThingToPrint){
		
		
		this.thingToPrint = thingToPrint;
		this.otherThingToPrint = otherThingToPrint;
	}
	
	
	public void print() {

		System.out.println(thingToPrint);
	}

}
