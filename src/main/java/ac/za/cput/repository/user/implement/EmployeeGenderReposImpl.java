package ac.za.cput.repository.user.implement;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.repository.user.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeGenderReposImpl implements EmployeeGenderRepository {
    private static EmployeeGenderReposImpl repository = null;
    private Set< EmployeeGender > employeeGenders;

    private EmployeeGenderReposImpl(){
        this.employeeGenders = new HashSet<>();
    }

    private EmployeeGender findEmployeeGender(final String gendId){
        return this.employeeGenders.stream()
                .filter(employeeGender -> employeeGender.getGendId().trim().equals(gendId))
                .findAny()
                .orElse(null);
    }

    public static EmployeeGenderReposImpl getRepository() {
        if (repository == null) repository = new EmployeeGenderReposImpl();
        return repository;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        this.employeeGenders.add(employeeGender);
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        EmployeeGender toDelete = findEmployeeGender(employeeGender.getEmpId());
        if(toDelete != null){
            this.employeeGenders.remove(toDelete);
            return create(employeeGender);
        }
        return null;
    }

    @Override
    public void delete(String empId) {
        EmployeeGender employeeGender = findEmployeeGender(empId);
        if (employeeGender !=null) this.employeeGenders.remove(employeeGender);

    }

    @Override
    public EmployeeGender read(String gendId) {
        EmployeeGender employeeGender = findEmployeeGender(gendId);
        return employeeGender;
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.employeeGenders;
    }
}
