package ejecutar;

public class SalesRep extends Employee { //Cuanbdo creas la clase hay una opcion para que te la ponga como que se heredó y ya no escribes tod
	private double salesMade;
	

	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}//constructor
	
	public double calculateComission(){
		      double comission = 0.1 * salesMade;
		      return comission;
	}//calculateComission

	public double getSalesMade() {
		return salesMade;
	}//getSalesMade

	@Override
	public String toString() {
		return super.toString() + "\n" + "SalesRep [salesMade=" + salesMade + "]";
	}//toString
	
	

}// class SalesRep
