package services;

import com.insat.tp.Etudiant;
import com.insat.tp.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.EnseignantRepository;
import repositories.EtudiantRepository;
import repositories.GroupeRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EnseignantService {
    @Autowired
    EnseignantRepository enseignantRepository;

    @Autowired
    GroupeRepository groupeRepository;
    @Autowired
    EtudiantRepository etudiantRepository;

    List<Enseignant> retrieveAllEnseignants(){
        return (List<Enseignant>) enseignantRepository.findAll();
    }
    Enseignant addEnseignant(Enseignant c){
        return enseignantRepository.save(c);
    }
    void deleteEnseignant(Integer id){
        enseignantRepository.deleteById(id);
    }
    Enseignant updateEnseignant(Enseignant c){
        Optional<Enseignant> enseignantToUpdate = enseignantRepository.findById(c.getId());
        enseignantToUpdate.get().setNom(c.getNom());

        return enseignantRepository.save(enseignantToUpdate.get());
    }
    Optional<Enseignant> retrieveEnseigant(Integer id){
        return enseignantRepository.findById(id);
    }

    long countEnseignants(){
        return enseignantRepository.count();
    }

    public List<Enseignant> getEnseignantsByDateNaissanceBetween(Date debut, Date fin) {
        return enseignantRepository.findByDateOfBirthBetween(debut, fin);
    }

    List<Etudiant> getEnseiganntsByGroupe(Long idGrp){
        return groupeRepository.findById(idGrp).get().getEtudiants();
    }

    public List<Enseignant> retrieveEnseignantsByEtudiantsId(Long idEtudiants){
        return etudiantRepository.findById(idEtudiants).get().getGroupe().getEnseignants();
    }
}
