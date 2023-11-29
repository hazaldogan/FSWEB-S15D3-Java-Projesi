import model.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1,"Hazal", "Taştan"));
        employees.add(new Employee(1,"Hazal", "Taştannn"));
        employees.add(new Employee(2,"Buğra", "Taştan"));
        employees.add(new Employee(2,"bura", "Taştan"));
        employees.add(new Employee(3,"AUmut", "Taştan"));
        employees.add(new Employee(3,"AhmetU", "Taştan"));

        Map<Integer,Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmployee = new ArrayList<>();

        System.out.println("Mevcut:" + employees);

        Iterator<Employee> iterator = employees.iterator();
        while(iterator.hasNext()){
            Employee employee = iterator.next();
            if(employee == null){
                System.out.println("null data buldum");
                continue;
            }
            if(employeeMap.containsKey(employee.getId())){
                removedEmployee.add(employee);
                iterator.remove();
            }else{
                employeeMap.put(employee.getId(),employee);
            }
        }
        System.out.println("Tekiller: " + employeeMap);
        System.out.println("Silinenler: " + removedEmployee);


    }
}