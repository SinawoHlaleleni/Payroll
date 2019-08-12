package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeRace;

public class EmployeeRaceFactory {

    public static EmployeeRace getEmployeeRace(String empId, String gendId){
        return new EmployeeRace().employeeRace(empId,gendId );
    }
}
