package tn.esprit.exam.controller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exam.entity.*;
import tn.esprit.exam.service.IProjetService;

import java.util.List;

@Tag(name = "Web Services pour la gestion de Projets")
@RestController
@RequestMapping("/projet")
public class ProjetRestController {

    @Autowired
    IProjetService projetService;

    @Tag(name = "CLASSES")
    // http://localhost:8089/exam/projet/retrieve-all-projets

    @Operation(description = "Ceci récupère la liste de tous les Classes")
    @GetMapping("/classe/retrieve-all-classes")
    public List<Classe> getClasses() {
        List<Classe> listClasses = projetService.retrieveAllClasses();
        return listClasses;
    }

    @Tag(name = "CLASSES")

    // http://localhost:8089/exam/classe/retrieve-classe/8
    @GetMapping("/classe/retrieve-classe/{classe-id}")
    public Classe retrieveClasse(@PathVariable("classe-id") Integer proejtId) {
        Classe classe = projetService.retrieveClasse(proejtId);
        return classe;
    }

    @Tag(name = "CLASSES")

    // http://localhost:8089/exam/classe/add-classe
    @PostMapping("/classe/add-classe")
    public Classe addClasse(@RequestBody Classe p) {
        Classe classe = projetService.addClasse(p);
        return classe;
    }

    @Tag(name = "CLASSES")

    // http://localhost:8089/exam/classe/remove-classe/{classe-id}
    @DeleteMapping("/classe/remove-classe/{classe-id}")
    public void removeClasse(@PathVariable("classe-id") Integer proejtId) {
        projetService.removeClasse(proejtId);
    }

    @Tag(name = "CLASSES")

    // http://localhost:8089/exam/classe/modify-classe
    @PutMapping("/classe/modify-classe")
    public Classe modifyClasse(@RequestBody Classe p) {
        Classe classe = projetService.modifyClasse(p);
        return classe;
    }

    @Tag(name = "CLASSROOMS")

    @Operation(description = "Ceci récupère la liste de tous les CoursClassrooms")
    @GetMapping("/classroom/retrieve-all-coursClassrooms")
    public List<CoursClassroom> getCoursClassrooms() {
        List<CoursClassroom> listCoursClassrooms = projetService.retrieveAllClassrooms();
        return listCoursClassrooms;
    }

    @Tag(name = "CLASSROOMS")

    // http://localhost:8089/exam/coursClassroom/retrieve-coursClassroom/8
    @GetMapping("/classroom/retrieve-coursClassroom/{coursClassroom-id}")
    public CoursClassroom retrieveCoursClassroom(@PathVariable("coursClassroom-id") Integer proejtId) {
        CoursClassroom coursClassroom = projetService.retrieveClassroom(proejtId);
        return coursClassroom;
    }

    @Tag(name = "CLASSROOMS")

    // http://localhost:8089/exam/coursClassroom/add-coursClassroom
    @PostMapping("/classroom/add-coursClassroom")
    public CoursClassroom addCoursClassroom(@RequestBody CoursClassroom p) {
        CoursClassroom coursClassroom = projetService.addClassroom(p);
        return coursClassroom;
    }

    @Tag(name = "CLASSROOMS")

    // http://localhost:8089/exam/coursClassroom/remove-coursClassroom/{coursClassroom-id}
    @DeleteMapping("/classroom/remove-coursClassroom/{coursClassroom-id}")
    public void removeCoursClassroom(@PathVariable("coursClassroom-id") Integer proejtId) {
        projetService.removeClassroom(proejtId);
    }

    @Tag(name = "CLASSROOMS")

    // http://localhost:8089/exam/coursClassroom/modify-coursClassroom
    @PutMapping("/classroom/modify-coursClassroom")
    public CoursClassroom modifyCoursClassroom(@RequestBody CoursClassroom p) {
        CoursClassroom coursClassroom = projetService.modifyClassroom(p);
        return coursClassroom;
    }

    @Tag(name = "UTILISATEURS")


    @Operation(description = "Ceci récupère la liste de tous les Utilisateurs")
    @GetMapping("/utilisateur/retrieve-all-utilisateurs")
    public List<Utilisateur> getUtilisateurs() {
        List<Utilisateur> listUtilisateurs = projetService.retrieveAllUtilisateurs();
        return listUtilisateurs;
    }

    @Tag(name = "UTILISATEURS")

    // http://localhost:8089/exam/utilisateur/retrieve-utilisateur/8
    @GetMapping("/utilisateur/retrieve-utilisateur/{utilisateur-id}")
    public Utilisateur retrieveUtilisateur(@PathVariable("utilisateur-id") Integer proejtId) {
        Utilisateur utilisateur = projetService.retrieveUtilisateur(proejtId);
        return utilisateur;
    }

    @Tag(name = "UTILISATEURS")

    // http://localhost:8089/exam/utilisateur/add-utilisateur
    @PostMapping("/utilisateur/add-utilisateur")
    public Utilisateur addUtilisateur(@RequestBody Utilisateur p) {
        Utilisateur utilisateur = projetService.addUtilisateur(p);
        return utilisateur;
    }

    @Tag(name = "UTILISATEURS")

    // http://localhost:8089/exam/utilisateur/remove-utilisateur/{utilisateur-id}
    @DeleteMapping("/utilisateur/remove-utilisateur/{utilisateur-id}")
    public void removeUtilisateur(@PathVariable("utilisateur-id") Integer proejtId) {
        projetService.removeUtilisateur(proejtId);
    }

    @Tag(name = "UTILISATEURS")

    // http://localhost:8089/exam/utilisateur/modify-utilisateur
    @PutMapping("/utilisateur/modify-utilisateur")
    public Utilisateur modifyUtilisateur(@RequestBody Utilisateur p) {
        Utilisateur utilisateur = projetService.modifyUtilisateur(p);
        return utilisateur;
    }

}
