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
public class Classe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeClasse; // Identifiant classe (Clé primaire)

    private String titre;


    @Enumerated(EnumType.STRING)
    private Niveau niveau;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "classe")
    private Set<CoursClassroom> classrooms;
}
