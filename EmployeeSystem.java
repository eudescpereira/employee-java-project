package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class EmployeeSystem {
	
	public static List<Employees> EmployeesList = new ArrayList<Employees>();
		
	public static List<Employees> moreThan1000List = new ArrayList<Employees>();
		
	public static List<Employees> sameAs1000List = new ArrayList<Employees>();
		
	public static List<Employees> lessThan1000List = new ArrayList<Employees>();
		
	List<Integer> slist = List.of();
		 
		
	/*position options*/
	public static String getPosition(int code) {

		return switch (code) {
			case 1 -> "Salary Analyst";
			case 2 -> "Accounting Assistant";
			case 3 -> "Billing Manager";
			case 4 -> "Expedition Manager";
			case 5 -> "Accountant";
			case 6 -> "Division Manager";
			case 7 -> "Clerk";
			case 8 -> "Caretaker";
			case 9 -> "Administrative Manager";
			case 10 -> "Commercial Manager";
			case 11 -> "People Manager";
			case 12 -> "Training Manager";
			case 13 -> "Financial Manager";
			case 14 -> "Ongoing";
			case 15 -> "Computer Operator";
			case 16 -> "Computer Programmer";
			case 17 -> "Secretary";
			default -> "Inform a number between 1 and 17: ";
		};
	}
		
		/*registration of a new employee*/
		public static void registerEmployee() {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inform employee's name: ");
			String name = input.next();
			
			System.out.println("Inform employee's registration number: ");
			int registrationNumber = input.nextInt();
			String positionName = "";
			while (true) {
				System.out.println("\n");
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

				System.out.println("Inform employee's position: ");
				
				int positionCode = input.nextInt();
				
				if (positionCode <= 17) {
					positionName =	getPosition(positionCode);
					break;
				}
				
			}
			
			System.out.println("Inform employee's salary: ");
			int salary = input.nextInt();
			
			Employees employee = new Employees(name,salary,positionName,registrationNumber);
			EmployeesList.add(employee);
			
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
			System.out.println("\n");
			System.out.println("Employee Registered.");
			System.out.println("\n");
		}

		/*searching for employees*/
		public static void listEmployee() {
			System.out.println("Registered employees: ");
			for(Employees worker : EmployeesList) {
				System.out.println("\n" + "Name: " + worker.getName() + "\n" +"Registration Number: " + worker.getRegistrationNumber() + "\n" +"Position: "+ worker.getPosition() + "\n" +"Salary: " + worker.getSalary());
			}
		}

		/*searching for employees which salary is more than R$1000*/
		public static void moreThan1000() {
			boolean foundEmployee = false;
			for(Employees worker : EmployeesList) {
				if(worker.getSalary()  > 1000) {
					foundEmployee = true;
					System.out.println("\n");
					System.out.println("Employees who earn more than R$1,000: ");
					System.out.println("\n" + "Name: " + worker.getName() + "\n" +"Registration Number: " + worker.getRegistrationNumber() + "\n" +"Position: "+ worker.getPosition() + "\n" +"Salary: " + worker.getSalary());
				}
			} if (!foundEmployee) {
				System.out.println("No Employees who earn more than R$1,000 could be found.");
			}
		}


	/*searching for employees which salary is R$1000*/
		public static void sameAs1000() {
			boolean foundEmployee2 = false;
			for (Employees worker : EmployeesList) {
				if (worker.getSalary() == 1000) {
					foundEmployee2 = true;
					System.out.println("Employees who earn R$1,000: ");
					System.out.println("\n" + "Name: " + worker.getName() + "\n" + "Registration Number: " + worker.getRegistrationNumber() + "\n" + "Position: " + worker.getPosition() + "\n" + "Salary: " + worker.getSalary());
				}
			}	if (!foundEmployee2) {
					System.out.println("No Employees who earn R$1,000 could be found.");
				}
		}

		/*searching for employees which salary is less than R$1000*/
		public static void lessThan1000() {
			boolean foundEmployee3 = false;
			for(Employees worker : EmployeesList) {
				if(worker.getSalary() <= 999) {
					foundEmployee3 = true;
					System.out.println("Employees who earn less than R$1,000: ");
					System.out.println("Name: " + worker.getName() + "\n" +"Registration Number: " + worker.getRegistrationNumber() + "\n" +"Position: "+ worker.getPosition() + "\n" +"Salary: " + worker.getSalary());
			}
		} if (!foundEmployee3) {
				System.out.println("No Employees who earn less than R$1,000 could be found.");
			}
	}

		/*searching for employees by name or RN*/
		public static void searchEmployee() {
			Scanner input = new Scanner(System.in);
			System.out.println("\n");
			System.out.println("1. Search employee by name.");
			System.out.println("2. Search employee by registration number.");
			System.out.println("\n");
		
			String search = input.next();

			switch (search) {
				case "1" -> {
					System.out.println("Inform employee's name: ");
					String nameSearched = input.next();
					for (Employees worker : EmployeesList) {
						if (worker.getName().equalsIgnoreCase(nameSearched)) {
							System.out.println("\n");
							System.out.println("Name : " + worker.getName() + "\n" + "Registration Number: " + worker.getRegistrationNumber() + "\n" + "Position: " + worker.getPosition() + "\n" + "Salary: " + worker.getSalary());
							System.out.println("\n");
						} else {
							System.out.println("No employee with name: " + nameSearched + " could be found. ");
						}
					}
				}
				case "2" -> {
					System.out.println("Inform employee's registration number: ");
					int rnSearched = input.nextInt();
					for (Employees worker : EmployeesList) {
						if (worker.getRegistrationNumber() == rnSearched) {
							System.out.println("\n");
							System.out.println("Name : " + worker.getName() + "\n" + "Registration Number: " + worker.getRegistrationNumber() + "\n" + "Position: " + worker.getPosition() + "\n" + "Salary: " + worker.getSalary());
							System.out.println("\n");
						} else {
							System.out.println("No employee with registration number: " + rnSearched + " could be found.");
						}
					}
				}
				default -> {
					System.out.println("Press 1 or 2 to search for employee: ");
					searchEmployee();
				}
			}
	}

	public static void deleteEmployee() {
		Scanner input = new Scanner(System.in);
		System.out.println("\n");
		System.out.println("1. Delete employee by name.");
		System.out.println("2. Delete employee by registration number.");
		System.out.println("\n");

		String deleteOption = input.next();

		switch (deleteOption) {
			case "1" -> {
				System.out.println("Enter the name of the employee to delete: ");
				String nameToDelete = input.next();
				boolean found = false;

				Iterator<Employees> iterator = EmployeesList.iterator();
				while (iterator.hasNext()) {
					Employees worker = iterator.next();
					if (worker.getName().equalsIgnoreCase(nameToDelete)) {
						iterator.remove();
						found = true;
						System.out.println("Employee with name " + nameToDelete + " has been deleted.");
					}
				}

				if (!found) {
					System.out.println("No employee with name: " + nameToDelete + " could be found.");
				}
			}
			case "2" -> {
				System.out.println("Enter the registration number of the employee to delete: ");
				int rnToDelete = input.nextInt();
				boolean found = false;

				Iterator<Employees> iterator = EmployeesList.iterator();
				while (iterator.hasNext()) {
					Employees worker = iterator.next();
					if (worker.getRegistrationNumber() == rnToDelete) {
						iterator.remove();
						found = true;
						System.out.println("Employee with registration number " + rnToDelete + " has been deleted.");
					}
				}

				if (!found) {
					System.out.println("No employee with registration number: " + rnToDelete + " could be found.");
				}
			}
			default -> {
				System.out.println("Press 1 or 2 to delete an employee: ");
				deleteEmployee();
			}
		}
	}

		public static void menu() {
			Scanner input = new Scanner(System.in);
			String option = null;
			   
			   while (!Objects.equals(option, "8")) {
				   /*menu*/
				   System.out.print("\n");
				   System.out.print("MENU" + "\n");
				   System.out.print("\n");
				   System.out.print("  1. Register new employee;" + "\n");
				   System.out.print("  2. List employee;" + "\n");
				   System.out.print("  3. Search for employee by name or RN;" + "\n");
				   System.out.print("  4. Delete employee by name or RN;" + "\n");
				   System.out.print("  5. Employees who earn more than R$1.000; " + "\n");
				   System.out.print("  6. Employees who earn R$1.000; " + "\n");
				   System.out.print("  7. Employees who earn less than R$1.000; " + "\n");
				   System.out.print("  8. Exit; " + "\n");
				   System.out.println("\n" + "Inform a number to continue: ");
				   
				   option = input.next();

				   switch (option) {
					   case "1" -> registerEmployee();
					   case "2" -> listEmployee();
					   case "3" -> searchEmployee();
					   case "4" -> deleteEmployee();
					   case "5" -> moreThan1000();
					   case "6" -> sameAs1000();
					   case "7" -> lessThan1000();
					   case "8" -> System.out.println("System closed!!");
					   default -> {
						   System.out.println("\n");
						   System.out.println("This option is not available. Inform a number between 1 and 8.");
						   System.out.println("\n");
					   }
				   }
			   }     
		}

		public static void main(String[] args) {
			 menu();
		}
}