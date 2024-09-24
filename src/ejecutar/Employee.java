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
	   }//constructor

	   public int timeToRetirement(){
		   int  timetoretirement = min((60-age),(40 - yearsWorked));//Math.min((60-age),(40 - yearsWorked)) y ya NO haces la función
		   return timetoretirement;
	   }// timeToRetirement

	   private int min(int i, int j) {  //En la doc de Java en Math.min
		   if(i<j) {
			return i;
		   }else {
			return j;
		   }
	   }//min

	   public int vacationTimeLeft(){
		      double vacationtimeleft = (daysWorked/360)*(30 - vacationDaysTaken);
		      int numeroEntero = (int)(vacationtimeleft);
		      return numeroEntero;
	   }//vacationTimeLeft

	   public double calculateBonus(){
		       double bonus = 2.2*salary;
		       return bonus;
	   }//calculateBonus

	   public int getRegistration() {
		return registration;
	   }//getRegistration

	   @Override
	   public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration
				+ ", age=" + age + ", daysWorked=" + daysWorked + ", vacationDaysTaken=" + vacationDaysTaken
				+ ", salary=" + salary + ", yearsWorked=" + yearsWorked + "]";
	   }//toString

	
	
	
	
}// class Employee
