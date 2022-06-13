package projeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import java.util.stream.*;

public class ProjetoFinalEudes {
	
	/*public static  Empregados[] listaDeFuncionários = new Empregados[ 20 ];*/
	
	public static List<Empregados> listaDeFuncionários = new ArrayList<Empregados>();
		
	public static List<Empregados> listaMais1000 = new ArrayList<Empregados>();
		
	public static List<Empregados> igual1000 = new ArrayList<Empregados>();
		
	public static List<Empregados> menor1000 = new ArrayList<Empregados>();
		
	List<Integer> slist = Arrays.asList();  
		 
		
	/*Opções de cargos*/
	public static String getCargo(int código) {
			
			 switch (código) {
			 case 1:
				 return "Analista de Salários";
			 case 2:
				 return "Auxiliar de Contabilidade";
			 case 3:
				 return "Chefe de Cobrança";
			 case 4:
				 return "Chefe de Expedição";
			 case 5:
				 return "Contador";
			 case 6:
				 return "Gerente de Divisão";
			 case 7:
				 return "Escriturário";
			 case 8:
				 return "Faxineiro";
			 case 9:
				 return "Gerente Administrativo";
			 case 10:
				 return "Gerente Comercial";
			 case 11:
				 return "Gerente de Pessoal";
			 case 12:
				 return "Gerente de Treinamento";
			 case 13:
				 return "Gerente Financeiro";
			 case 14:
				 return "Contínuo";
			 case 15:
				 return "Operador de Computador";
			 case 16:
				 return "Programador de Computador";
			 case 17:
				 return "Secretária";
			     default: 
			    return "Informe um numero entre 1-17";
			 }
	}
		
		/*Cadastrando usuário*/
		public static void CadastrarEmpregado() {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Informe o nome do empregado");
			String nome = input.next();
			
			System.out.println("Informe a matrícula do empregado");
			int matrícula = input.nextInt();
			String nomeCargo = "";
			while (true) {
				System.out.println("========"+"\n");
				System.out.println("Cargos:"+"\n");
				System.out.println("1. Analista de Salários");
				System.out.println("2. Auxiliar de Contabilidade");
				System.out.println("3. Chefe de Cobrança");
				System.out.println("4. Chefe de Expedição");
				System.out.println("5. Contador");
				System.out.println("6. Gerente de Divisão");
				System.out.println("7. Escriturário");
				System.out.println("8. Faxineiro");
				System.out.println("9. Gerente Administrativo");
				System.out.println("10. Gerente Comercial");
				System.out.println("11. Gerente de Pessoal");
				System.out.println("12. Gerente de Treinamento");
				System.out.println("13. Gerente Financeiro");
				System.out.println("14. Contínuo");
				System.out.println("15. Operador de Computador");
				System.out.println("16. Programador de Computador");
				System.out.println("17. Secretária"+"\n");
				
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
			listaDeFuncionários.add(funcionário);
			
			/*for(Empregados empregado : listaDeFuncionários) {
			System.out.println(empregado.getNome());
			System.out.println(empregado.getCargo());
			System.out.println(empregado.getMatrícula());
			System.out.println(empregado.getSalário());
			System.out.println("=========================="+"\n");}*/
			
		for(Empregados empregado : listaDeFuncionários) {
			if(empregado.getSalário() > 1000) {
				listaMais1000.add(empregado);
			}
		}
			
		for(Empregados empregado : listaDeFuncionários) {
			if (empregado.getSalário() == 1000) {
				igual1000.add(empregado);
			}
		}
			
		for(Empregados empregado : listaDeFuncionários) {
			if (empregado.getSalário() < 1000) {
				menor1000.add(empregado);
			}
		}
		
			System.out.println("\n"+"==========================");
			System.out.println("= Funcionário Cadastrado =");
			System.out.println("=========================="+"\n");
		}
		
		public static void ListarEmpregado() {
			/*List<Integer> slist = Arrays.asList();*/
			System.out.println("Funcionários cadastrados");
			for(Empregados empregado : listaDeFuncionários) {
				System.out.println("\n"+"["+"\n");
				System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
				System.out.println("]"+"\n"); 
			}
		}
		
		
		
		/*Mostrar funcionários que recebem mais que R$1000*/
		public static void Maisque1000() {
			for(Empregados empregado : listaDeFuncionários) {
				if((empregado.getSalário()  > 1000) ) {
					System.out.println("Funcionários que recebem mais que R$1.000");
					System.out.println("\n"+"["+"\n");
					System.out.println(" Nome : " + empregado.getNome() + "\n" +" Matrícula: " + empregado.getMatrícula() + "\n" +" Cargo = "+ empregado.getCargo() + "\n" +" Salário: " + empregado.getSalário());
					System.out.println("]"+"\n");
				}
			}
		}
		
		public static void iguala1000() {
			for(Empregados empregado : listaDeFuncionários) {
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
			for(Empregados empregado : listaDeFuncionários) {
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
			for(Empregados empregado : listaDeFuncionários) {
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
			for(Empregados empregado : listaDeFuncionários) {
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
						   CadastrarEmpregado();  
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
