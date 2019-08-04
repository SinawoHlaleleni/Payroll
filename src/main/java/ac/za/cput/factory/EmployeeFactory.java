package ac.za.cput.factory;

import ac.za.cput.domain.Employee;
import ac.za.cput.util.Misc;

public class EmployeeFactory {

    public static Employee getEmpName(String empName) {
        return new Employee.Builder()
                .empName("Sinawo")
                .empSurname("Hlaleleni")
                .id( Misc.generateId())
                .build();
    }
}
