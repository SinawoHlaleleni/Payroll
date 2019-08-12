package ac.za.cput.service.demographic;

import ac.za.cput.domain.demographic.Gender;
import ac.za.cput.service.IService;

import java.util.Set;

public interface GenderService extends IService< Gender,String > {
    Set<Gender> getAll();
}
