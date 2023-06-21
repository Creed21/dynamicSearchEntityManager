package with.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import with.hibernate.model.Grupa;
import with.hibernate.repository.DynamicSearch;
import with.hibernate.repository.GrupaRepository;

import java.util.List;

@Service
public class GrupaService {
    @Autowired
    private GrupaRepository grupaRepository;
    @Autowired
    private DynamicSearch dynamicSearch;

    public List<Grupa> findDynamic(Grupa grupa) {
        if(grupa == null)
            throw new RuntimeException("Neispravni parametri");

        return dynamicSearch.getDynamicGroups(grupa);
    }

    public List<?> findDynamicGeneral(Object searchObject) {
        if(searchObject == null)
            throw new RuntimeException("Neispravni parametri");

        List<?> result = dynamicSearch.getDynamicGeneral(searchObject);
        System.out.println("dynamicSearch.getDynamicGroupsGeneral: "+result);
        return result;
    }

    public List<Grupa> findAll() {
        return grupaRepository.findAll();
    }

    public Grupa findById(Integer id) {
        return grupaRepository.findById(id).get();
    }

    public List<Grupa> findAllByNaziv(String naziv) {
        return grupaRepository.findAllByNaziv(naziv);
    }
}
