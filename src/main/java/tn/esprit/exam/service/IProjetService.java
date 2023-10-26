package tn.esprit.exam.service;

import tn.esprit.exam.entity.*;

import java.util.List;

public interface IProjetService {

    public List<Classe> retrieveAllClasses();

    public Classe retrieveClasse(Integer classeId);

    public Classe addClasse(Classe c);

    public void removeClasse(Integer classeId);

    public Classe modifyClasse(Classe c);

    public List<CoursClassroom> retrieveAllClassrooms();

    public CoursClassroom retrieveClassroom(Integer classroomId);

    public CoursClassroom addClassroom(CoursClassroom cl);

    public void removeClassroom(Integer classroomId);

    public CoursClassroom modifyClassroom(CoursClassroom c);

    /////////////////////////////////////////////
    public List<Utilisateur> retrieveAllUtilisateurs();

    public Utilisateur retrieveUtilisateur(Integer utilisateurId);

    public Utilisateur addUtilisateur(Utilisateur c);

    public void removeUtilisateur(Integer utilisateurId);

    public Utilisateur modifyUtilisateur(Utilisateur c);


}
