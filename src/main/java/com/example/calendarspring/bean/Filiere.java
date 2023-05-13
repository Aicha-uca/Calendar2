package com.example.calendarspring.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String description;

    @OneToMany(mappedBy = "filiere")
    private List<Etudiant> etudiants = new ArrayList<>();

    public Filiere() {
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
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    public void addEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
        etudiant.setFiliere(this);
    }
    public void removeEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
        etudiant.setFiliere(null);
    }
}

