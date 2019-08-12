package ac.za.cput.factory.user;

import ac.za.cput.domain.user.EmployeeRace;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeRaceFactoryTest {

    @Test
    public void getEmployeeRace() {
        String raceID = "snw2025";
        String empNum = "45638e";
        EmployeeRace employeeRace = EmployeeRaceFactory.getEmployeeRace(raceID,empNum);
        System.out.println(employeeRace);
        Assert.assertNotNull(employeeRace.toString());
    }
    }
