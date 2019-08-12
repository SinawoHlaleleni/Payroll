package ac.za.cput.repository.user.implement;

import ac.za.cput.domain.demographic.Race;
import ac.za.cput.factory.demographic.RaceFactory;
import ac.za.cput.repository.demographic.RaceRepository;
import ac.za.cput.repository.demographic.implementation.RaceRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertNotEquals;

public class EmployeeRaceRepoImplTest {

    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.getRaceName("IsiXhosa");
    }

    @Test
    public void create() {
        Race created = this.repository.create(this.race);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertSame(created,this.race);
    }

    @Test
    public void update() {
        String newName = "IsiZulu";
        Race updated = new Race.Builder().raceName(newName).build();
        System.out.println("In update, about_to_update = " + race.getRaceName());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        Assert.assertSame(newName, updated.getRaceName());
    }

    @Test
    public void delete() {
        this.repository.delete(race.getRaceId());
    }

    @Test
    public void read() {
        System.out.println("In read, coloured = " + race.getRaceName());
        Race read = this.repository.read(race.getRaceName());
        getAll();
        assertNotEquals(race, read);
    }

    @Test
    public void getAll() {
        Set<Race> all = this.repository.getAll();
    }

}