package ac.za.cput.service.demographic.implemantation;

import ac.za.cput.domain.demographic.Gender;
import ac.za.cput.repository.demographic.GenderRepository;
import ac.za.cput.repository.demographic.implementation.GenderRepositoryImpl;
import ac.za.cput.service.demographic.GenderService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class GenderServiceImpl implements GenderService {


    public static GenderServiceImpl service = null;
    private GenderRepository repository;

    private GenderServiceImpl(){
        this.repository= GenderRepositoryImpl.getRepository();
    }
    public static GenderServiceImpl getService(){
        if(service == null) service = new GenderServiceImpl();
        return service;
    }

    @Override
    public Set<Gender> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Gender create(Gender gender) {
        return this.repository.create(gender);
    }

    @Override
    public Gender update(Gender gender) {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String gender) {
        repository.delete(gender);
    }

    @Override
    public Gender read(String gender) {
        return this.repository.read(gender);
    }
}
