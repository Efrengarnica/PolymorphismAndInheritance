package ejecutar;

public class SalesRep extends Employee {
	private double salesMade;
	
	
	
	



	public SalesRep(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked);
		this.salesMade = salesMade;
	}
	
	public double calculateComission(){
		      double comission = 0.1 * salesMade;
		      return comission;
		   }

	public double getSalesMade() {
		return salesMade;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "SalesRep [salesMade=" + salesMade + "]";
	}
	
	

}
