package ac.za.cput.service.user.implement;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;
import ac.za.cput.repository.user.implement.EmployeeGenderReposImpl;
import ac.za.cput.service.user.EmployeeGenderService;

import java.util.Set;

public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderServiceImpl service = null;
    private EmployeeGenderRepository repository;

    private EmployeeGenderServiceImpl(){
        this.repository = EmployeeGenderReposImpl.getRepository();
    }

    public static EmployeeGenderServiceImpl getService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.repository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.repository.update(employeeGender);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.repository.getAll();
    }
}
