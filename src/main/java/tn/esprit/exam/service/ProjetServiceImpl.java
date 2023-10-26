package tn.esprit.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.exam.repository.ClasseRepository;
import tn.esprit.exam.repository.CoursClassroomRepository;
import tn.esprit.exam.repository.UtilisateurRepository;
import tn.esprit.exam.entity.*;

import java.util.List;

@Service
@Slf4j
public class ProjetServiceImpl implements IProjetService {
    @Autowired
    ClasseRepository classeRepository;
    @Autowired
    CoursClassroomRepository coursClassroomRepository;
    @Autowired
    UtilisateurRepository utilisateurRepository;


    @Scheduled(fixedDelay = 10000)
    public List<Classe> retrieveAllClasses() {

        //log.info("In Method : retrieveAllClasses ");

        List<Classe> listClasses = classeRepository.findAll();
        for (Classe Classe : listClasses) {
            log.info("j'affiche un prjet : " + Classe);
        }

        //log.info("Out of Method : retrieveAllClasses ");

        return listClasses;

    }

    public Classe retrieveClasse(Integer ClasseId) {
        return classeRepository.findById(ClasseId).get();
    }

    public Classe addClasse(Classe p) {
        return classeRepository.save(p);
    }

    public void removeClasse(Integer ClasseId) {
        classeRepository.deleteById(ClasseId);
    }

    public Classe modifyClasse(Classe Classe) {
        return classeRepository.save(Classe);
    }


    // Classe et ClasseDeail ne sont pas encore créés (cascade) :
    // Dans le JSON on met le Classe et le Classe Detail
    public Classe addClasseAndClasseDetailAndAssign(Classe Classe) {
        return classeRepository.save(Classe);
    }


    @Scheduled(fixedDelay = 10000)
    public List<Utilisateur> retrieveAllUtilisateurs() {

        //log.info("In Method : retrieveAllUtilisateurs ");

        List<Utilisateur> listUtilisateurs = utilisateurRepository.findAll();
        for (Utilisateur Utilisateur : listUtilisateurs) {
            log.info("j'affiche un prjet : " + Utilisateur);
        }

        //log.info("Out of Method : retrieveAllUtilisateurs ");

        return listUtilisateurs;

    }

    public Utilisateur retrieveUtilisateur(Integer UtilisateurId) {
        return utilisateurRepository.findById(UtilisateurId).get();
    }

    public Utilisateur addUtilisateur(Utilisateur p) {
        return utilisateurRepository.save(p);
    }

    public void removeUtilisateur(Integer UtilisateurId) {
        utilisateurRepository.deleteById(UtilisateurId);
    }

    public Utilisateur modifyUtilisateur(Utilisateur Utilisateur) {
        return utilisateurRepository.save(Utilisateur);
    }

    // Utilisateur et UtilisateurDeail ne sont pas encore créés (cascade) :
    // Dans le JSON on met le Utilisateur et le Utilisateur Detail
    public Utilisateur addUtilisateurAndUtilisateurDetailAndAssign(Utilisateur Utilisateur) {
        return utilisateurRepository.save(Utilisateur);
    }

    @Scheduled(fixedDelay = 10000)
    public List<CoursClassroom> retrieveAllClassrooms() {

        //log.info("In Method : retrieveAllCoursClassrooms ");

        List<CoursClassroom> listCoursClassrooms = coursClassroomRepository.findAll();
        for (CoursClassroom coursClassroom : listCoursClassrooms) {
            log.info("j'affiche un prjet : " + coursClassroom);
        }

        //log.info("Out of Method : retrieveAllCoursClassrooms ");

        return listCoursClassrooms;

    }

    public CoursClassroom retrieveClassroom(Integer CoursClassroomId) {
        return coursClassroomRepository.findById(CoursClassroomId).get();
    }

    public CoursClassroom addClassroom(CoursClassroom p) {
        return coursClassroomRepository.save(p);
    }

    public void removeClassroom(Integer CoursClassroomId) {
        coursClassroomRepository.deleteById(CoursClassroomId);
    }

    public CoursClassroom modifyClassroom(CoursClassroom CoursClassroom) {
        return coursClassroomRepository.save(CoursClassroom);
    }

    // CoursClassroom et CoursClassroomDeail ne sont pas encore créés (cascade) :
    // Dans le JSON on met le CoursClassroom et le CoursClassroom Detail
    public CoursClassroom addCoursClassroomAndCoursClassroomDetailAndAssign(CoursClassroom CoursClassroom) {
        return coursClassroomRepository.save(CoursClassroom);
    }

}
