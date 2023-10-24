package com.martin.testspringjpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Etudiant  {
    @Id //primary key
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name = "etudiantid")
    private int id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    public Etudiant() {
    }

    public Etudiant(int etudiantID, String nom, String prenom) {
        this. id = etudiantID;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return this.id;
    }
    public void setId(int value) {
        this.id = value;
    }
    public String getNom() {
        return this.nom;
    }
    public void setNom(String value) {
        this.nom = value;
    }
    public String getPrenom() {
        return this.prenom;
    }
    public void setPrenom(String value) {
        this.prenom = value;
    }
}
