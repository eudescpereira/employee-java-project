package projeto;

public class Employees {
	
	public String name;
    public int salary;
    public String position;
    public int registrationNumber;
    
    public Employees(String name, int salary, String position, int registrationNumber){
        this.name = name;
        this.salary = salary;
        this.position = position;
		this.registrationNumber = registrationNumber;
    }
    
    
    public String getName() {
    	return name;
    	}

    	public int getSalary() {
    	return salary;
    	}

    	public String getPosition() {
    	return position;
    	}
    	
    	public int getRegistrationNumber() {
	    	return registrationNumber;
	    }
}
