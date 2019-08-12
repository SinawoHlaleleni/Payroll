package ac.za.cput.repository.user;

import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface EmployeeRaceRepository extends IRepository < EmployeeRace,String > {
    Set<EmployeeRace> getAll();
}
