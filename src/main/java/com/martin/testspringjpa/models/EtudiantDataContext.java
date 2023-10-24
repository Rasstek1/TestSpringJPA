package com.martin.testspringjpa.models;

import com.martin.testspringjpa.Data.EtudiantRepository;

public class EtudiantDataContext {

    private EtudiantRepository etudiantReposirory;

    public EtudiantDataContext(EtudiantRepository etudiantReposirory) {

        this.etudiantReposirory = etudiantReposirory;
    }

    public EtudiantRepository getEtudiantReposirory() {
        return etudiantReposirory;
    }

    public void setEtudiantReposirory(EtudiantRepository etudiantReposirory) {
        this.etudiantReposirory = etudiantReposirory;
    }

    // les méthodes utilitaires

    public Object selectAll(){
        return this.etudiantReposirory.findAll();
    }
    public Etudiant selectById(int id){
        return this.etudiantReposirory. findById(id).get();
    }
    public void insert(Etudiant etudiant){
        this.etudiantReposirory.save(etudiant);
    }
    public void deleteById(int id){
        this.etudiantReposirory.deleteById(id);
    }
    public void delete(Etudiant etudiant){
        this.etudiantReposirory.delete(etudiant);
    }
    public void update(Etudiant etudiant){
        this.etudiantReposirory.save(etudiant);
    }
}

