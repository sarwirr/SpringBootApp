package com.insat.tp;

import com.insat.tp.Speciality ;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Groupe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom_groupe")
    private String nomG;
    @Column(name = "speciality")
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
    @ManyToMany(mappedBy = "groupes")
    private List<Enseignant> enseignants;
    @ManyToMany()
    private List<Etudiant> etudiants;
}