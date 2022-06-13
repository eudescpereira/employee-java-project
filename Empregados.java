package projeto;

public class Empregados {
	
	public String nome;
    public int salário;
    public String cargo;
    public int matrícula;
    
    public Empregados(String nome, int salário, int matrícula, String cargo){
        this.nome = nome;
        this.salário = salário;
        this.matrícula = matrícula;
        this.cargo = cargo;
    }
    
    
    public String getNome() {
    	return nome;
    	}

    	public int getSalário() {
    	return salário;
    	}

    	public String getCargo() {
    	return cargo;
    	}
    	
    	public int getMatrícula() {
	    	return matrícula;
	    }
}
