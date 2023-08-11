package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class ProjetoFinalEudes {
	
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
				System.out.println("Informe o cargo do empregado"+"\n");
				System.out.println("===============================");
				
				int cargoCódigo = input.nextInt();
				
				if (cargoCódigo <= 17) {
					 nomeCargo =	getCargo(cargoCódigo);
					System.out.println(nomeCargo+"\n");
					break;
				}
				
			}
			
			System.out.println("Informe o Salário do empregado");
			int salário = input.nextInt();
			
			Empregados funcionário = new Empregados(nome,salário,matrícula,nomeCargo);
			EmployeesList.add(funcionário);
			
			/*for(Empregados empregado : listaDeFuncionários) {
			System.out.println(empregado.getNome());
			System.out.println(empregado.getCargo());
			System.out.println(empregado.getMatrícula());
			System.out.println(empregado.getSalário());
			System.out.println("=========================="+"\n");}*/
			
		for(Empregados empregado : EmployeesList) {
			if(empregado.getSalário() > 1000) {
				moreThan1000List.add(empregado);
			}
		}
			
		for(Empregados empregado : EmployeesList) {
			if (empregado.getSalário() == 1000) {
				sameAs1000List.add(empregado);
			}
		}
			
		for(Empregados empregado : EmployeesList) {
			if (empregado.getSalário() < 1000) {
				lessThan1000List.add(empregado);
			}
		}
		
			System.out.println("\n"+"==========================");
			System.out.println("= Funcionário Cadastrado =");
			System.out.println("=========================="+"\n");
		}
		
		public static void ListarEmpregado() {
			/*List<Integer> slist = Arrays.asList();*/
			System.out.println("Funcionários cadastrados");
			for(Empregados empregado : EmployeesList) {
				System.out.println("\n"+"["+"\n");
				System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
				System.out.println("]"+"\n"); 
			}
		}
		
		
		
		/*Mostrar funcionários que recebem mais que R$1000*/
		public static void Maisque1000() {
			for(Empregados empregado : EmployeesList) {
				if((empregado.getSalário()  > 1000) ) {
					System.out.println("Funcionários que recebem mais que R$1.000");
					System.out.println("\n"+"["+"\n");
					System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
					System.out.println("]"+"\n");
				}
			}
		}
		
		public static void iguala1000() {
			for(Empregados empregado : EmployeesList) {
				if(empregado.getSalário() == 1000) {
					System.out.println("Funcionários que recebem R$1.000");
					System.out.println("\n"+"["+"\n");
					System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
					System.out.println("]"+"\n");
				}
			}
		}

		public static void MenorQue1000() {
			System.out.println("Funcionários que recebem menos que R$1.000");
			for(Empregados empregado : EmployeesList) {
				if(empregado.getSalário() <= 999) { 
					System.out.println("\n"+"["+"\n");
					System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
					System.out.println("]"+"\n");
			}
		}
	}

		public static void PesquisarEmpregado() {
			Scanner input = new Scanner(System.in);
			System.out.println("===================================================================");
			System.out.println("Pesquisar funcionário através de seu nome digite 1.");
			System.out.println("Pesquisar funcionário através de seu número de matrícula digite 2.");
			System.out.println("===================================================================");
		
			String pesquisar = input.next();
		
			switch (pesquisar) {
			
			case "1" :
			System.out.println("Informe o nome do funcionário");
			String nomePesquisa = input.next();
			for(Empregados empregado : EmployeesList) {
				if(empregado.getNome().equalsIgnoreCase(nomePesquisa)) {
					System.out.println("\n"+"["+"\n");
					System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
					System.out.println("]"+"\n");
				} else {
					System.out.println("Não existem funcionários com esse nome. ");
				}
			}
			break;
			
			case "2" :
			System.out.println("Informe o numero de matrícula do funcionario: ");
			int matriPesquisa = input.nextInt();
			for(Empregados empregado : EmployeesList) {
				if(empregado.getMatrícula() == matriPesquisa) {
					System.out.println("\n"+"["+"\n");
					System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
					System.out.println("]"+"\n");
				} else {
					System.out.println("Não existem funcionários com esse número de matrícula.");
				}
			}
			break;
		
			default :
			System.out.println("Digite 1 ou 2 para pesquisar o funcionário.");
			PesquisarEmpregado();
		}
	}
		
		/*Mostrar menu*/
		public static void menu() {
			Scanner input = new Scanner(System.in);
			String opcao = null;
			   
			   while (opcao!="7") {
				   /*menu*/
				   System.out.print("============================="+ "\n");
				   System.out.print("  Registro de Funcionários " + "\n");
				   System.out.print("=============================" + "\n");
				   System.out.print("  1. Cadastrar Funcionário;" + "\n");
				   System.out.print("  2. Listar Funcionários;" + "\n");
				   System.out.print("  3. Pesquisar funcionário; " + "\n");
				   System.out.print("  4. Empregados que recebem mais de R$1.000; " + "\n");
				   System.out.print("  5. Empregados que recebem R$1.000; " + "\n");
				   System.out.print("  6. Empregados que recebem menos de R$1.000; " + "\n");
				   System.out.print("  7. Sair; " + "\n");
				   System.out.print("=============================");
				   System.out.println("\n" + "Informe a opção para continuar.");
				   
				   opcao = input.next();
					   
				   switch (opcao) {
					   case "1":
						   registerEmployee();
						   break;
				       case "2" :
				    	   ListarEmpregado();
				    	   break;
				       case "3" :
				    	   PesquisarEmpregado();
				    	   break;
				       case "4" :
				    	   Maisque1000();			   
				    	   break;
				       case "5" :
				    	   iguala1000();
				    	   break;
				       case "6": 
				    	   MenorQue1000();
				    	   break;
				       case "7": 
				    	   System.out.println("Programa Fechado!!");
				    	   break;
				    	   
				    	  default:
				    		  System.out.println("\n");
				    		  System.out.println("O número escolhido é inválido! Digite um número entre 1 a 7.");
				    		  System.out.println("\n");
				   }	   
			   }     
		}

		public static void main(String[] args) {
			 menu();
		}
}
