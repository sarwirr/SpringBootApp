package com.insat.tp;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Enseignant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "ens_nom")
    private String nom;
    @Column(name = "ens_prenom")
    private String prenom;

    @ManyToMany
    private List<Groupe> groupes;
    public Enseignant() {

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

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
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
}
