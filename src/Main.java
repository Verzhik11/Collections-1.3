import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        EmployeeBook employeeBook = new EmployeeBook();
        Map<String, Employee> emp = employeeBook.getEmployees();
        employeeBook.addEmployee(new Employee("Wolf", "Messing"));
        employeeBook.addEmployee(new Employee("Brad", "Pitt"));
        employeeBook.addEmployee(new Employee("Alan", "Po"));
        //employeeBook.removeEmployee(new Employee("Brad", "Pitt"));
        employeeBook.showAll();
        //employeeBook.findEmployee(new Employee("Alan", "Po"));

    }




    //        Map<String, Employee> employees = new HashMap<>(Map.of(
//                "teamLeader", new Employee("Wolf", "Messing"),
//                "senior", new Employee("Brad", "Pitt"),
//                "junior1", new Employee("Alan", "Po"),
//                "junior2", new Employee("Richard", "Wagner")
//        ));
}