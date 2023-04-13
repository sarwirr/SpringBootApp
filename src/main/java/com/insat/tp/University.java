package com.insat.tp;

import javax.persistence.*;
import java.io.Serializable;

@Entity

public class University implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "uni_nom")
    private String nom;
    @Column(name = "uni_address")
    private String address;

    public University(int id, String nom, String address) {
        this.id = id;
        this.nom = nom;
        this.address = address;
    }

    public University() {

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
