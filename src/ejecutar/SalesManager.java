package ejecutar;

import java.util.HashMap;

public class SalesManager extends SalesRep{
	HashMap<Integer, SalesRep> salesTeam;
	
	   public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade,
			HashMap<Integer, SalesRep> salesTeam) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
		this.salesTeam = salesTeam;
	}
	   public void addToMyTeam(SalesRep integranteNuevo) {
		   this.salesTeam.put(integranteNuevo.getRegistration(), integranteNuevo);
	   }


	public double calculateComissionToTeam(){
		double total = 0;
		for(SalesRep sr: salesTeam.values()) {
			total+=sr.getSalesMade();
		}
		
		double comision= 0.03*total;        //getSalesMade all sales made by team
		return comision;
		       
		   }
	@Override
	public String toString() {
		return super.toString() + "\n" + "SalesManager [Comisión por mi salesTeam= " + calculateComissionToTeam() + "]";
	}
	
}
