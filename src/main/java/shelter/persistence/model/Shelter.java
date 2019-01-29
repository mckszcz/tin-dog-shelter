package shelter.persistence.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "shelter", schema = "shelter")
@Setter
@Getter
public class Shelter {
    @Id
    @SequenceGenerator(name = "shelter_shelter_id_seq",
            sequenceName = "shelter.shelter_shelter_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "shelter_shelter_id_seq")
    @Column(name = "shelter_id", nullable = false)
    private Integer shelterId;

    @Column(name = "shelter_name")
    private String shelterName;

    @Column(name = "shelter_address")
    private String shelterAddress;
}
