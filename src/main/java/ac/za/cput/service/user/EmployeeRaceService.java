package ac.za.cput.service.user;

import ac.za.cput.domain.user.EmployeeGender;
import ac.za.cput.domain.user.EmployeeRace;
import ac.za.cput.service.IService;

import java.util.Set;

public interface EmployeeRaceService extends IService<EmployeeGender, String> {
    Set< EmployeeRace > getAll();
}
