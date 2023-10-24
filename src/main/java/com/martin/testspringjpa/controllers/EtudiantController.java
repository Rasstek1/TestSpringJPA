package com.martin.testspringjpa.controllers;

import com.martin.testspringjpa.models.Etudiant;
import com.martin.testspringjpa.models.EtudiantDataContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EtudiantController {
    @Autowired
    EtudiantDataContext etudiantDataContext;

    @RequestMapping("/etudiant/accueil")
    public String accueil(){
        return "accueil";
    }

    @RequestMapping("/etudiant/liste")
    public ModelAndView listeEtudiant(){
        //etudiantrepository.save(new Etudiant(3,"Bounouar", "Ahmed"));
        //etudiantrepository.save(new Etudiant(4,"Bounouar", "Zak"));
        ModelAndView mv= new ModelAndView("liste");
        mv.addObject("listeetud",this.etudiantDataContext.selectAll());
        return mv;

    }

    @RequestMapping("/etudiant/delete/{id}")
    public ModelAndView deleteEtudiant(@PathVariable int id){
        this.etudiantDataContext.deleteById(id);
        ModelAndView mv= new ModelAndView("liste");
        mv.addObject("listeetud",etudiantDataContext.selectAll());
        return mv;

    }
    @RequestMapping(value = "/etudiant/update/{id}", method = RequestMethod.GET)
    public ModelAndView updateEtudiant(@PathVariable(required = true) int id){
        ModelAndView mv= new ModelAndView("update");
        mv.addObject("etud",this.etudiantDataContext.selectById(id));
        return mv;

    }

    @RequestMapping(value = "/etudiant/update", method = RequestMethod.POST)
    public ModelAndView updateEtudiant(@ModelAttribute Etudiant modelEtudiant){
        this.etudiantDataContext.insert(modelEtudiant);
        ModelAndView mv= new ModelAndView("liste");
        mv.addObject("listeetud",this.etudiantDataContext.selectAll());
        return mv;

    }
    @RequestMapping(value = "/etudiant/add", method = RequestMethod.GET)
    public ModelAndView addEtudiant(){

        ModelAndView mv= new ModelAndView("add");
        mv.addObject("etud",new Etudiant());
        return mv;

    }
    @RequestMapping(value = "/etudiant/add", method = RequestMethod.POST)
    public ModelAndView addEtudiant(@ModelAttribute Etudiant modelEtudiant){
        this.etudiantDataContext.insert(modelEtudiant);
        ModelAndView mv= new ModelAndView("liste");
        mv.addObject("listeetud",this.etudiantDataContext.selectAll());
        return mv;

    }
}
