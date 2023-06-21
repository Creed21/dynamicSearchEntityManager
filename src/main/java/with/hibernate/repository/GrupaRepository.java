package with.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import with.hibernate.model.Grupa;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface GrupaRepository extends JpaRepository<Grupa, Integer> {
    List<Grupa> findAllByNaziv(String naziv);
    List<Grupa> findAll();
}
