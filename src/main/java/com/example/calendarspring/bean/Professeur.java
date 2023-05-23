package com.example.calendarspring.bean;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Professeur extends Personne {
    private String numCouvertureMedicale;


    @ManyToOne
    private Departement departement;
    @ManyToMany(fetch= FetchType.EAGER)
    private Collection<Cours> cours = new ArrayList<>();

    public Professeur(Long id, String nom, String prenom, String tel, String email, String cin, String password) {
        super(id, nom, prenom, tel, email, cin, password);
    }

    public Professeur() {
        super();
    }


    public String getNumCouvertureMedicale() {
        return numCouvertureMedicale;
    }

    public void setNumCouvertureMedicale(String numCouvertureMedicale) {
        this.numCouvertureMedicale = numCouvertureMedicale;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}
