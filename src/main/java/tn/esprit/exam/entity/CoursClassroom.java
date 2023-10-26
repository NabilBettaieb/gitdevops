package tn.esprit.exam.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoursClassroom implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClassroom; // Identifiant CoursClass (Clé primaire)

    private String nom;
    private Integer nbHeures;
    private Boolean archive;


    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ManyToOne
    private Classe classe;

}
