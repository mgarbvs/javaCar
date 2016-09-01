
public class Car {
	double startMiles;
	double endMiles;
	double gallons;
	
	public Car(double startOdo, double endOdo, double gallons1) {
	    startMiles = startOdo;
	    endMiles = endOdo;
	    gallons = gallons1;

}
	  public double calculateMPG() 
{ 
	return (endMiles - startMiles) / gallons;   	
}
	
	  public static void main(String[] args) {
		
		
	Car gar = new Car(1, 3, 10);
	double x = gar.calculateMPG();
	System.out.println(x + " miles per gallon.");
	
	  }
}
