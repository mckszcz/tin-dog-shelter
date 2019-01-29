package shelter.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "person", schema = "shelter")
@Setter
@Getter
public class Person {

    @Id
    @SequenceGenerator(name = "person_person_id_seq",
            sequenceName = "shelter.person_person_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "person_person_id_seq")
    @Column(name = "person_id", nullable = false)
    private Integer personId;

    @Column(name = "person_first_name")
    private String personFirstName;

    @Column(name = "person_last_name")
    private String personLastName;

    @Column(name = "person_phone_number")
    private String personPhoneNumber;
}
