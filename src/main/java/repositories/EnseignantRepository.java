package repositories;

import com.insat.tp.Enseignant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface EnseignantRepository extends CrudRepository<Enseignant,Integer> {
    List<Enseignant> findByDateOfBirthBetween(Date debut, Date fin);
}
