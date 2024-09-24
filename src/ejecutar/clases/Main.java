package ejecutar.clases;
import java.util.HashMap;

import ejecutar.Employee;
import ejecutar.SalesManager;
import ejecutar.SalesRep;

public class Main {

	public static void main(String[] args) {
		
		Employee Efren= new Employee("Efren", "Garnica", 111, 20, 800, 10, 15000, 2);
		System.out.println(Efren.timeToRetirement());
		System.out.println(Efren.vacationTimeLeft());
		System.out.println(Efren.calculateBonus());
		System.out.println(Efren);
		
		System.out.println("--------------------------------------");
		SalesRep Mario= new SalesRep("Mario", "Garnica", 333, 22, 379, 0, 9000, 1, 5000);
		SalesRep Alberto= new SalesRep("Alberto", "Garnica", 444, 23, 600, 10, 9000, 1, 6000);
		SalesRep Victor= new SalesRep("Victor", "Garnica", 555, 24, 800, 5, 10000, 2, 7000);
		SalesRep Teresa= new SalesRep("Teresa", "Garnica", 666, 29, 100, 5, 9000, 0, 8000);
		SalesRep Lucia= new SalesRep("Lucia", "Garnica", 777, 30, 780, 7, 9000, 2, 9000);
		System.out.println(Mario.timeToRetirement());
		System.out.println(Mario.vacationTimeLeft());
		System.out.println(Mario.calculateBonus());
		System.out.println(Mario);
		System.out.println("Su comisión es: " + Mario.calculateComission());
		
		
		System.out.println("--------------------------------------");
		HashMap<Integer, SalesRep> salesTeam= new HashMap<Integer, SalesRep>();
		SalesManager Aurelio = new SalesManager("Aurelio", "Garnica", 888, 50, 3700, 100, 30000, 10, 90000,salesTeam);
		Aurelio.addToMyTeam(Mario); //verificar cuando la persona NO sea SalesRep 
		Aurelio.addToMyTeam(Alberto);//Aurelio..addToMyTeam(new SalesRep("Alberto", "Garnica", 444, 23, 600, 10, 9000, 1, 6000));
		Aurelio.addToMyTeam(Victor);//Puedo agregar directamemente asi como arriba
		Aurelio.addToMyTeam(Teresa);
		Aurelio.addToMyTeam(Lucia);
		
		System.out.println(Aurelio.timeToRetirement());
		System.out.println(Aurelio.vacationTimeLeft());
		System.out.println(Aurelio.calculateBonus());
		System.out.println("Su comisión es: " + Aurelio.calculateComission());
		System.out.println(Aurelio);
		
		
		
	}//main

}// class Main










