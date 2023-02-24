package com.example.tptptp;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Departement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dep_nom")
    private String nom;
    @Column(name = "dep_speciality")
    private Speciality speciality;

    public Departement(int id, String nom, Speciality speciality) {
        this.id = id;
        this.nom = nom;
        this.speciality = speciality;
    }

    public Departement() {

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

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
