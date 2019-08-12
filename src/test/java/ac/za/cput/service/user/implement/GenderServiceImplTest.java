package ac.za.cput.service.user.implement;

import ac.za.cput.domain.demographic.Gender;
import ac.za.cput.factory.demographic.GenderFactory;
import ac.za.cput.service.demographic.implemantation.GenderServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.Set;

import static org.junit.Assert.assertNotSame;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GenderServiceImplTest {

    private GenderServiceImpl service;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.service = (GenderServiceImpl) GenderServiceImpl.getService();
        this.gender = GenderFactory.getGender( "Female" );
    }

    @Test
    public void getAll() {
        Set< Gender > gender = this.service.getAll();
        System.out.println( "In get all," + gender );
    }

    @Test
    public void create() {
        Gender created = this.service.create( this.gender );
        System.out.println( "the create, done =" + created );
        Assert.assertNotNull( created );
        Assert.assertSame( created, this.gender );
    }

    @Test
    public void update() {

        String newGenderId = "002345";
        Gender updated = new Gender.Builder().gendId( newGenderId ).build();
        System.out.println( "the update, done = " + updated );
        this.service.update( updated );
        Assert.assertEquals( newGenderId, updated.getGendId());
        getAll();
    }

    @Test
    public void delete() {
        this.service.delete( gender.getGendId());
        getAll();
    }

    @Test
    public void read() {
        Gender read = this.service.read( gender.getGendId());
        System.out.println( "the read, read = " + read );
        getAll();
        assertNotSame( read, gender );
    }
}