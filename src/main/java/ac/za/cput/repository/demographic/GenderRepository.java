package ac.za.cput.repository.demographic;

import ac.za.cput.domain.demographic.Gender;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface GenderRepository extends IRepository< Gender,String > {
    Set<Gender> getAll();
}
