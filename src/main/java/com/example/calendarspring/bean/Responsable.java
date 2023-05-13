package com.example.calendarspring.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Responsable extends Personne {

    @ManyToOne
    private Departement departement;


    public Responsable(Long id, String nom, String prenom, String tel, String email, String cin, String password) {
        super(id, nom, prenom, tel, email, cin, password);

    }
    public Responsable() {
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }
}

