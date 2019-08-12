package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.util.Misc;

public class EmployeeFactory {

    public static Employee getEmpName(String empName) {
        return new Employee.Builder()
                .empName("Sinawo")
                .empSurname("Hlaleleni")
                .empId( Misc.generateId())
                .build();
    }
}
