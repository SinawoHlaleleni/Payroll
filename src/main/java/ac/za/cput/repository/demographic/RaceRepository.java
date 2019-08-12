package ac.za.cput.repository.demographic;

import ac.za.cput.domain.demographic.Race;
import ac.za.cput.repository.IRepository;

import java.util.Set;

public interface RaceRepository extends IRepository< Race, String > {
    Set<Race> getAll();
}
