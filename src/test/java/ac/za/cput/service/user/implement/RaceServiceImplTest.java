package ac.za.cput.service.user.implement;

import ac.za.cput.domain.demographic.Race;
import ac.za.cput.factory.demographic.RaceFactory;
import ac.za.cput.service.demographic.implemantation.RaceServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertNotSame;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class RaceServiceImplTest {

    private RaceServiceImpl service;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.service= RaceServiceImpl.getService();
        this.race = RaceFactory.getRaceName( "Black" );
    }
    @Test
    public void getAll() {
        Set<Race> races = this.service.getAll();
        System.out.println("In get all," + races);
    }

    @Test
    public void create() {
        Race created = this.service.create(this.race);
        System.out.println("the create, done =" + created);
        Assert.assertNotNull(created);
        Assert.assertSame(created, this.race);
    }

    @Test
    public void update() {
        String newRaceId = "005Bl";
        Race updated = new Race.Builder().raceId(newRaceId).build();
        System.out.println("the update, done = " + updated );
        this.service.update(updated);
        Assert.assertEquals(newRaceId,updated.getRaceId());
        getAll();
    }

    @Test
    public void delete() {
        this.service.delete(race.getRaceId());
        getAll();
    }

    @Test
    public void read() {
        Race read = this.service.read(race.getRaceId());
        System.out.println("the read, read = " + read);
        getAll();
        assertNotSame(read,race);
    }
}