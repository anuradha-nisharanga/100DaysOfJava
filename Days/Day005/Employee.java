package Day005;

public class Employee {

    int id;
    String  name;
    int salary;

    Employee(int id, String name, int salary ){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    
    public int salaryIncrement(int increment) {
        
        this.salary = salary + increment;
        return salary;
    }
    
}
