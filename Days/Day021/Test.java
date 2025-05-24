package Day021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test{

    public static void main(String[] args) {
        
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("nisal",50000, "IT"));
        employees.add(new Employee("kasun",20000, "HR"));
        employees.add(new Employee("saman",45500, "Account"));
        employees.add(new Employee("supun",35000, "HR"));
        employees.add(new Employee("kasun",60000, "IT"));
        employees.add(new Employee("ashan",10000, "IT"));
        employees.add(new Employee("pathum",78000, "IT"));
        employees.add(new Employee("asanaka",85000, "IT"));

        //  get highest salary paying first 5  IT Deparment employees names 
        List<String> result = employees.stream()
        .filter(emp -> emp.getDepartment().equals("IT"))
        .sorted(Comparator.comparing(Employee::getSalary).reversed())
        .map(Employee::getName)
        .limit(5)
        .toList();

        result.forEach(System.out::println);

        // get unique names from the employess
        Set<String> uniqueNames = employees.stream().map(Employee::getName).collect(Collectors.toSet());
        System.out.println(uniqueNames);
        
        
        // joining elements
        String allnamesJoined = employees.stream().map(Employee::getName).collect(Collectors.joining(", "));
        System.out.println(allnamesJoined);

        // Grouping
        Map<String, List<Employee>> byDepartment = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(byDepartment.toString());

    }
}
