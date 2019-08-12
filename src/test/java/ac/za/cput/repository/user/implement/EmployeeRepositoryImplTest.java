package ac.za.cput.repository.user.implement;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertNotSame;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeRepositoryImplTest {

    private  EmployeeRepositoryImpl repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = (EmployeeRepositoryImpl) EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmpName( "Seanahwar" );
    }

    @Test
    public void getAll() {
        Set<Employee> employee = this.repository.getAll();
        System.out.println("Fetch employee," + employee);
    }

    @Test
    public void create() {
        Employee created = this.repository.create(this.employee);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void update() {
        String newEmpId = "Snw25";
        Employee updated = new Employee.Builder().empId(newEmpId).build();
        System.out.println("the update, done = " + updated );
        this.repository.update(updated);
        Assert.assertEquals(newEmpId,updated.getEmpId());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete( employee.getEmpId() );
        getAll();
    }

    @Test
    public void read() {
        Employee read = this.repository.read(employee.getEmpId());
        System.out.println("the read, read = " + read);
        getAll();
        assertNotSame(read,employee);
    }

}