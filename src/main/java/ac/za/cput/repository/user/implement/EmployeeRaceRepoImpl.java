package ac.za.cput.repository.user.implement;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.user.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

public class EmployeeRaceRepoImpl implements EmployeeRaceRepository{

    private static EmployeeRaceRepoImpl repository = null;
    private Set< EmployeeRace > employeeRaces;

    private EmployeeRaceRepoImpl(){
        this.employeeRaces = new HashSet<>();
    }

    private EmployeeRace findEmployeeRace(final String raceId){
        return this.employeeRaces.stream()
                .filter(employeeRace -> employeeRace.getRaceId().trim().equals(raceId))
                .findAny()
                .orElse(null);
    }

    public static EmployeeRaceRepoImpl getRepository() {
        if (repository == null) repository = new EmployeeRaceRepoImpl();
        return repository;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        this.employeeRaces.add(employeeRace);
        return employeeRace;
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        EmployeeRace toDelete = findEmployeeRace(employeeRace.getEmpId());
        if(toDelete != null){
            this.employeeRaces.remove(toDelete);
            return create(employeeRace);
        }
        return null;
    }

    @Override
    public void delete(String empNum) {
        EmployeeRace employeeRace = findEmployeeRace(empNum);
        if (employeeRace !=null) this.employeeRaces.remove(employeeRace);

    }

    @Override
    public EmployeeRace read(String raceID) {
        EmployeeRace employeeRace = findEmployeeRace(raceID);
        return employeeRace;
    }

    @Override
    public Set<EmployeeRace> getAll() {
        return this.employeeRaces;
    }
}
