package com.example.calendarspring.bean;


import javax.persistence.*;

@Entity
public class Admin extends Personne {

    @ManyToOne
    private Departement departement;

    public Admin(Long id, String nom, String prenom, String tel, String email, String cin, String password, Departement departement) {
        super(id, nom, prenom, tel, email, cin, password);
        this.departement = departement;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Admin() {
    }
}

