package com.example.calendarspring.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
public class Surveillant extends Personne {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricule;
    @ManyToOne
    private Salle salle;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Roles roles;

    public Surveillant(Long id, String nom, String prenom, String tel, String email, String cin, String password, String matricule) {
        super(id, nom, prenom, tel, email, cin, password);
        this.matricule = matricule;
    }

    public Surveillant() {

    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

}
