package Day005;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    
    public static void main(String[] args) {
        

        Employee[] arrayOfEmps  = {

            new Employee(1, "Kamal", 100000),
            new Employee(2, "Sunil", 150000),
            new Employee(3, "Vimal", 200000),
        };

        // obtain a stream from an existing array
        Stream.of(arrayOfEmps);

        // obtain a stream from an existing list
        List<Employee> empList = Arrays.asList(arrayOfEmps);
        empList.stream();

        // create a stream from individual objects using Stream.of()
        Stream.of(arrayOfEmps[0], arrayOfEmps[1], arrayOfEmps[2]);

        // create a stream using Stream.builder()
        Stream.Builder<Employee> empStreamBuilder = Stream.builder();
        empStreamBuilder.accept(arrayOfEmps[0]);
        empStreamBuilder.accept(arrayOfEmps[1]);
        empStreamBuilder.accept(arrayOfEmps[2]);

        Stream<Employee> empStream = empStreamBuilder.build();
        
        // increment salary by 10000
        empList.stream().forEach(e -> e.salaryIncrement(10000));

        System.out.println(arrayOfEmps[0].salary);
        System.out.println(arrayOfEmps[1].salary);
        System.out.println(arrayOfEmps[2].salary);

    }
}
