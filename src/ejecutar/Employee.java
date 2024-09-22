package ejecutar;

public class Employee {
	private String firstName;
	private String lastName;
	private int registration;
	private int age;
	private int daysWorked;
	private int vacationDaysTaken;
	private double salary;
	private int yearsWorked;
	
	
	

	   public Employee(String firstName, String lastName, int registration, int age, int daysWorked, int vacationDaysTaken,
			double salary, int yearsWorked) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.registration = registration;
		this.age = age;
		this.daysWorked = daysWorked;
		this.vacationDaysTaken = vacationDaysTaken;
		this.salary = salary;
		this.yearsWorked = yearsWorked;
	}

	public int timeToRetirement(){
		      int  timetoretirement = min((60-age),(40 - yearsWorked));
		   return timetoretirement;
	}

	private int min(int i, int j) {
		if(i<j) {
			return i;
		}else {
			return j;
		}
	}

	public int vacationTimeLeft(){
		      double vacationtimeleft = (daysWorked/360)*(30 - vacationDaysTaken);
		      int numeroEntero = (int) Math.round(vacationtimeleft);
		return numeroEntero;
		   }

	   public double calculateBonus(){
		       double bonus = 2.2*salary;
		   return bonus;
	 }

	public int getRegistration() {
		return registration;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	}

	
	

	   
	 
	
	
	
	
	
}
