package Day021;

public class Employee {
    
    
    private String name;
    private int salary;
    private String department; 

    Employee(String name, int salary, String department) {
        this.salary = salary;
        this.name = name;
        this.department = department;
    }

    public String getDepartment(){
       return department;
    }

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
}
