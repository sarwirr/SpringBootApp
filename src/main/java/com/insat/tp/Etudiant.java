package com.insat.tp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@AllArgsConstructor

@Setter
@Getter
@Entity
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    private Groupe groupe;

    public Etudiant() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Etudiant(int id, String nom, String prenom, Date datefeuile) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.datefeuile = datefeuile;
    }

    public Date getDatefeuile() {
        return datefeuile;
    }

    public void setDatefeuile(Date datefeuile) {
        this.datefeuile = datefeuile;
    }

    @Column(name = "etudiant_nom")
    private String nom;
    @Column(name = "etudiant_prenom")
    private String prenom;
    @Column(name = "etudiant_date")
    private Date datefeuile;
}
