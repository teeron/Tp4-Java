import java.util.ArrayList;
import java.util.List;

public  class EmployeeManager {
    List<Employee> employees= new ArrayList<>();

    public void addEmployeeToList(Employee employee) {
        this.employees.add(employee);
        System.out.println(employees.size());
    }

    public void calculateSalary(){

    }

    public static EmployeeManager instance;

    public EmployeeManager getInstance() {
        if(instance == null) {
            instance = new EmployeeManager();
        }
        return instance;
    }
}