package ac.za.cput.factory.user;

import ac.za.cput.domain.user.Employee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {

    @Test
    public void getEmpName() {
        String name = "Seanahwar";
        Employee employee = EmployeeFactory.getEmpName(name);
        System.out.println(employee);
        Assert.assertNotNull(employee.toString());
    }
    }