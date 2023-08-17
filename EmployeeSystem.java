package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class EmployeeSystem {
	
	/*public static  Empregados[] listaDeFuncionários = new Empregados[ 20 ];*/
	
	public static List<Employees> EmployeesList = new ArrayList<Employees>();
		
	public static List<Employees> moreThan1000List = new ArrayList<Employees>();
		
	public static List<Employees> sameAs1000List = new ArrayList<Employees>();
		
	public static List<Employees> lessThan1000List = new ArrayList<Employees>();
		
	List<Integer> slist = Arrays.asList();  
		 
		
	/*position options*/
	public static String getPosition(int code) {
			
			 switch (code) {
			 case 1:
				 return "Salary Analyst";
			 case 2:
				 return "Accounting Assistant";
			 case 3:
				 return "Billing Manager";
			 case 4:
				 return "Expedition Manager";
			 case 5:
				 return "Accountant";
			 case 6:
				 return "Division Manager";
			 case 7:
				 return "Clerk";
			 case 8:
				 return "Caretaker";
			 case 9:
				 return "Administrative Manager";
			 case 10:
				 return "Commercial Manager";
			 case 11:
				 return "People Manager";
			 case 12:
				 return "Training Manager";
			 case 13:
				 return "Financial Manager";
			 case 14:
				 return "Ongoing";
			 case 15:
				 return "Computer Operator";
			 case 16:
				 return "Computer Programmer";
			 case 17:
				 return "Secretary";
			     default: 
			    return "Inform a number between 1 and 17: ";
			 }
	}
		
		/*registrating user*/
		public static void registerEmployee() {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inform employee's name: ");
			String name = input.next();
			
			System.out.println("Inform employee's registration number: ");
			int registrationNumber = input.nextInt();
			String positionName = "";
			while (true) {
				System.out.println("========"+"\n");
				System.out.println("Positions:"+"\n");
				System.out.println("1. Salary Analyst");
				System.out.println("2. Accounting Assistant");
				System.out.println("3. Billing Manager");
				System.out.println("4. Expedition Manager");
				System.out.println("5. Accountant");
				System.out.println("6. Division Manager");
				System.out.println("7. Clerk");
				System.out.println("8. Caretaker");
				System.out.println("9. Administrative Manager");
				System.out.println("10. Commercial Manager");
				System.out.println("11. People Manager");
				System.out.println("12. Training Manager");
				System.out.println("13. Financial Manager");
				System.out.println("14. Ongoing");
				System.out.println("15. Computer Operator");
				System.out.println("16. Computer Programmer");
				System.out.println("17. Secretary"+"\n");
				
				System.out.println("==============================="+"\n");
				System.out.println("Inform employee's position:"+"\n");
				System.out.println("===============================");
				
				int positionCode = input.nextInt();
				
				if (positionCode <= 17) {
					 positionName =	getPosition(positionCode);
					System.out.println(positionName+"\n");
					break;
				}
				
			}
			
			System.out.println("Inform employee's salary: ");
			int salary = input.nextInt();
			
			Employees employee = new Employees(name,salary,positionName,registrationNumber);
			EmployeesList.add(employee);
			
			/*for(Empregados empregado : listaDeFuncionários) {
			System.out.println(empregado.getNome());
			System.out.println(empregado.getCargo());
			System.out.println(empregado.getMatrícula());
			System.out.println(empregado.getSalário());
			System.out.println("=========================="+"\n");}*/
			
		for(Employees worker : EmployeesList) {
			if(worker.getSalary() > 1000) {
				moreThan1000List.add(worker);
			}
		}
			
		for(Employees worker : EmployeesList) {
			if (worker.getSalary() == 1000) {
				sameAs1000List.add(worker);
			}
		}
			
		for(Employees worker : EmployeesList) {
			if (worker.getSalary() < 1000) {
				lessThan1000List.add(worker);
			}
		}
		
			System.out.println("\n"+"==========================");
			System.out.println("= Employee Registered. =");
			System.out.println("=========================="+"\n");
		}
		
		public static void ListEmployee() {
			/*List<Integer> slist = Arrays.asList();*/
			System.out.println("Registered employees: ");
			for(Employees worker : EmployeesList) {
				System.out.println("\n"+"["+"\n");
				System.out.println(" Name: " + worker.getName() + "\n" +" Registration Number: " + worker.getRegistrationNumber() + "\n" +" Position: "+ worker.getPosition() + "\n" +" Salary: " + worker.getSalary());
				System.out.println("]"+"\n"); 
			}
		}
		
		
		
		/*Mostrar funcionários que recebem mais que R$1000*/
		public static void moreThan1000() {
			for(Employees worker : EmployeesList) {
				if((worker.getSalary()  > 1000) ) {
					System.out.println("Employees who earn more than R$1,000: ");
					System.out.println("\n"+"["+"\n");
					System.out.println(" Name: " + worker.getName() + "\n" +" Registration Number: " + worker.getRegistrationNumber() + "\n" +" Position: "+ worker.getPosition() + "\n" +" Salary: " + worker.getSalary());
					System.out.println("]"+"\n");
				}
			}
		}
		
		public static void sameAs1000() {
			for(Employees worker : EmployeesList) {
				if(worker.getSalary() == 1000) {
					System.out.println("Employees who earn R$1,000: ");
					System.out.println("\n"+"["+"\n");
					System.out.println(" Name: " + worker.getName() + "\n" +" Registration Number: " + worker.getRegistrationNumber() + "\n" +" Position: "+ worker.getPosition() + "\n" +" Salary: " + worker.getSalary());
					System.out.println("]"+"\n");
				}
			}
		}

		public static void lessThan1000() {
			System.out.println("Employees who earn less than R$1,000: ");
			for(Employees worker : EmployeesList) {
				if(worker.getSalary() <= 999) {
					System.out.println("\n"+"["+"\n");
					System.out.println(" Name: " + worker.getName() + "\n" +" Registration Number: " + worker.getRegistrationNumber() + "\n" +" Position: "+ worker.getPosition() + "\n" +" Salary: " + worker.getSalary());
					System.out.println("]"+"\n");
			}
		}
	}

		public static void SearchEmployee() {
			Scanner input = new Scanner(System.in);
			System.out.println("===================================================================");
			System.out.println("1. Search employee by name.");
			System.out.println("2. Search employee by registration number.");
			System.out.println("===================================================================");
		
			String search = input.next();
		
			switch (search) {
			
			case "1" :
			System.out.println("Inform employee's name: ");
			String nameSearched = input.next();
			for(Employees worker : EmployeesList) {
				if(worker.getName().equalsIgnoreCase(nameSearched)) {
					System.out.println("\n"+"["+"\n");
					System.out.println(" Name : " + worker.getName() + "\n" +" Registration Number: " + worker.getRegistrationNumber() + "\n" +" Position: "+ worker.getPosition() + "\n" +" Salary: " + worker.getSalary());
					System.out.println("]"+"\n");
				} else {
					System.out.println("No employee with name: " + nameSearched + " found. ");
				}
			}
			break;
			
			case "2" :
			System.out.println("Inform employee's registration number: ");
			int rnSearched = input.nextInt();
			for(Employees worker : EmployeesList) {
				if(worker.getRegistrationNumber() == rnSearched) {
					System.out.println("\n"+"["+"\n");
					System.out.println(" Name : " + worker.getName() + "\n" +" Registration Number: " + worker.getRegistrationNumber() + "\n" +" Position: "+ worker.getPosition() + "\n" +" Salary: " + worker.getSalary());
					System.out.println("]"+"\n");
				} else {
					System.out.println("No employee with registration number: " + rnSearched + " found.");
				}
			}
			break;
		
			default :
			System.out.println("Press 1 or 2 to search for employee: ");
			searchEmployee();
		}
	}
		
		public static void menu() {
			Scanner input = new Scanner(System.in);
			String option = null;
			   
			   while (option!="7") {
				   /*menu*/
				   System.out.print("============================="+ "\n");
				   System.out.print("  Employee Register " + "\n");
				   System.out.print("=============================" + "\n");
				   System.out.print("  1. Register new employee" + "\n");
				   System.out.print("  2. List employee" + "\n");
				   System.out.print("  3. Search for employee" + "\n");
				   System.out.print("  4. Employees who earn more than R$1.000; " + "\n");
				   System.out.print("  5. Employees who earn R$1.000; " + "\n");
				   System.out.print("  6. Employees who earn less than R$1.000; " + "\n");
				   System.out.print("  7. Exit; " + "\n");
				   System.out.print("=============================");
				   System.out.println("\n" + "Inform a number to continue: ");
				   
				   option = input.next();
					   
				   switch (option) {
					   case "1":
						   registerEmployee();
						   break;
				       case "2" :
				    	   ListEmployee();
				    	   break;
				       case "3" :
				    	   SearchEmployee();
				    	   break;
				       case "4" :
				    	   moreThan1000();			   
				    	   break;
				       case "5" :
				    	   sameAs1000();
				    	   break;
				       case "6": 
				    	   lessThan1000();
				    	   break;
				       case "7": 
				    	   System.out.println("System closed!!");
				    	   break;
				    	   
				    	  default:
				    		  System.out.println("\n");
				    		  System.out.println("This option is not available. Inform a number between 1 and 7.");
				    		  System.out.println("\n");
				   }	   
			   }     
		}

		public static void main(String[] args) {
			 menu();
		}
}