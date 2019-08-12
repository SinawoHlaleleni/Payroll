package ac.za.cput.service.user.implement;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.user.EmployeeRaceRepository;
import ac.za.cput.repository.user.implement.EmployeeRaceRepoImpl;
import ac.za.cput.service.user.EmployeeRaceService;

import java.util.Set;

public class EmployeeRaceServiceImpl implements EmployeeRaceService {
    private static EmployeeRaceServiceImpl service ;
    private EmployeeRaceRepository repository;

    private EmployeeRaceServiceImpl(){
        this.repository = EmployeeRaceRepoImpl.getRepository();
    }

    public static EmployeeRaceServiceImpl getService(){
        if (service == null) service = new EmployeeRaceServiceImpl();
        return service;
    }

    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.repository.create(employeeRace);
    }

    public EmployeeRace update(EmployeeRace employeeRace) {
        return this.repository.update(employeeRace);
    }


    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return null;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return null;
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return service.read(s);
    }


    @Override
    public Set<EmployeeRace> getAll() {
        return service.getAll();
    }

}


