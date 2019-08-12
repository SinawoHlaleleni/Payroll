package ac.za.cput.service.demographic.implemantation;

import ac.za.cput.domain.demographic.Race;
import ac.za.cput.repository.demographic.RaceRepository;
import ac.za.cput.repository.demographic.implementation.RaceRepositoryImpl;
import ac.za.cput.service.demographic.RaceService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class RaceServiceImpl implements RaceService {


    public static RaceServiceImpl service = null;
    private RaceRepository repository;

    private RaceServiceImpl(){
        this.repository= RaceRepositoryImpl.getRepository();
    }
    public static RaceServiceImpl getService(){
        if(service == null) service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Set<Race> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Race create(Race race) {
        return this.repository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.repository.update(race);
    }

    @Override
    public void delete(String race) {
        repository.delete(race);
    }

    @Override
    public Race read(String race) {
        return this.repository.read(race);
    }

}
