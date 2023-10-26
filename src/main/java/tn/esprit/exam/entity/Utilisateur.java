package tn.esprit.exam.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Utilisateur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUtilisateur; // Identifiant USER (Clé primaire)

    private String prenom;
    private String nom;
    private String password;
    @ManyToOne
    private Classe classeU;

}
