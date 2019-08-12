package ac.za.cput.service.demographic.implemantation;

import ac.za.cput.domain.demographic.Gender;
import ac.za.cput.factory.demographic.GenderFactory;
import ac.za.cput.repository.demographic.GenderRepository;
import ac.za.cput.repository.demographic.implementation.GenderRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class GenderServiceImplTest {

    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.getGender("Boy");
    }

    @Test
    public void create() {
        Gender created = this.repository.create(this.gender);
        System.out.println("In create, created = " + created);
        getAll();
        Assert.assertEquals(created, this.gender);
    }

    @Test
    public void update() {
        String newName = "Bonita";
        Gender updated = new Gender.Builder().genderType(newName).build();
        System.out.println("In update, about_to_updated = " + gender.getGenderType());
        this.repository.update(updated);
        System.out.println("In update, updated = " + updated);
        assertEquals(newName, updated.getGenderType());
        getAll();
    }

    @Test
    public void delete() {
        this.repository.delete(gender.getGenderType());
        getAll();
    }

    @Test
    public void read() {
        System.out.println("In read, female = "+ gender.getGenderType());
        Gender read = this.repository.read(gender.getGenderType());
        getAll();
        assertNotEquals(gender,read);
    }

    @Test
    public void getAll() {
        Set<Gender> genders = this.repository.getAll();
    }
}