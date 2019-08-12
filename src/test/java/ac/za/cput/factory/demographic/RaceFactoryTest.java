package ac.za.cput.factory.demographic;

import ac.za.cput.domain.demographic.Race;
import org.junit.Assert;
import org.junit.Test;

public class RaceFactoryTest {

    @Test
    public void getRaceName() {

        String Black = "IsiXhosa";
        Race race = RaceFactory.getRaceName( Black );
        System.out.println(race);
        Assert.assertNotNull(race.toString());
    }
    }