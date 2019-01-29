package shelter.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dog", schema = "shelter")
@Setter
@Getter
public class Dog {

    @Id
    @SequenceGenerator(name = "dog_dog_id_seq",
            sequenceName = "shelter.dog_dog_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "dog_dog_id_seq")
    @Column(name = "dog_id", nullable = false)
    private Integer dogId;

    @Column(name = "dog_name", nullable = false)
    private String dogName;

    @Column(name = "dog_breed")
    private String dogBreed;

    @Column(name = "dog_age")
    private Integer dogAge;

    @Column(name = "dog_colour")
    private String dogColour;

    @Column(name = "adopted", nullable = false)
    private Boolean adopted;

    @Column(name = "find_date", nullable = false)
    private Date findDate;

    @Column(name = "adoption_date")
    private Date adoptionDate;

    @Column(name = "shelter_id")
    private Integer shelterId;

    @Column(name = "person_id")
    private Integer personId;

}
