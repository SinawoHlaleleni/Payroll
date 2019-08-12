package ac.za.cput.service.user.implement;

import ac.za.cput.domain.user.Employee;
import ac.za.cput.factory.user.EmployeeFactory;
import ac.za.cput.repository.user.EmployeeRepository;
import ac.za.cput.repository.user.implement.EmployeeRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertNotSame;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceImplTest {
    private  EmployeeServiceImpl service;
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.getEmpName( "Seanahwar" );
    }

    @Test
    public void getAll() {
        Set<Employee> employee = repository.getAll();
        System.out.println("Fetch employee," + employee);
    }

    @Test
    public void create() {
        Employee created = repository.create(this.employee);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.employee);
    }

    @Test
    public void update() {
        String newEmpName = "Snw25";
        Employee updated = new Employee.Builder().empId(newEmpName).build();
        System.out.println("the update, done = " + employee.getEmpName() );
        this.repository.update(updated);
        Assert.assertEquals(newEmpName,updated.getEmpId());
        //assertEquals(newEmpName, updated.getEmpName());
        getAll();
    }

    @Test
    public void delete() {
        repository.delete( employee.getEmpId() );
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