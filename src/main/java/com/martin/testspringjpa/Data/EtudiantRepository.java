package com.martin.testspringjpa.Data;

import com.martin.testspringjpa.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepository  extends JpaRepository<Etudiant, Integer> {

}

/*public interface EtudiantRepository  extends CrudRepository<Etudiant, Integer> {

}*/
