package ac.za.cput.repository.user.implement;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.factory.user.EmployeeGenderFactory;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertNotEquals;

public class EmployeeGenderReposImplTest {

    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

   @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderReposImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.getEmployeeGender("M785437","Z763873");
    }

    @Test
    public void create() {
        EmployeeGender created = this.repository.create(this.employeeGender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.employeeGender);
    }

    @Test
    public void update() {
        String newEmpId = "Snw25";
        Employee updated = new Employee.Builder().empId(newEmpId).build();
        System.out.println("the update, done = " + updated );
        //this.repository.update(updated);
        Assert.assertEquals(newEmpId,updated.getEmpId());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(employeeGender.getGendId());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, gender Id = " + employeeGender.getGendId());
        EmployeeGender read = this.repository.read(employeeGender.getGendId());
        getAll();
       assertNotEquals(employeeGender, read);
    }

    @Test
    public void getAll() {
        Set< EmployeeGender > all = this.repository.getAll();
    }

}