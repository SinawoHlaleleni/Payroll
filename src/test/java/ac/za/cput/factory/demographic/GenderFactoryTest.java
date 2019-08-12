package ac.za.cput.factory.demographic;

import ac.za.cput.domain.demographic.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {

    @Test
    public void getGender() {
        String female = "Girl";
        Gender gender = GenderFactory.getGender( female );
        //Gender gender2 = GenderFactory.getGender(male);
        System.out.println( gender );
        Assert.assertNotNull( gender.toString() );
    }
}