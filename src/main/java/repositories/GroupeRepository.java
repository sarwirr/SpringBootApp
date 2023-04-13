package repositories;

import com.insat.tp.Enseignant;
import com.insat.tp.Groupe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository extends CrudRepository<Groupe, Long> {
}
