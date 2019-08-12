package ac.za.cput.service.demographic;

import ac.za.cput.domain.demographic.Race;
import ac.za.cput.service.IService;

import java.util.Set;

public interface RaceService extends IService< Race,String > {
    Set<Race> getAll();
}
