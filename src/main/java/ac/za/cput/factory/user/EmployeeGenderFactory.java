package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeGender;

public class EmployeeGenderFactory {

    public static EmployeeGender getEmployeeGender(String empId, String gendId){

        return new EmployeeGender(empId,gendId);
    }


}
