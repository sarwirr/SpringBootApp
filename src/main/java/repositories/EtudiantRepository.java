package repositories;

import com.insat.tp.Enseignant;
import com.insat.tp.Etudiant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant, Long> {
}
