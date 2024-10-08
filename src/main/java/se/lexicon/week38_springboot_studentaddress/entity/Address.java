package se.lexicon.week38_springboot_studentaddress.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@EqualsAndHashCode
@ToString(exclude = "student")
@Entity(name = "addressDetails")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false, length = 6)
    private String zipCode;

    @Setter
    @OneToOne(mappedBy = "address")
    private Student student;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
}
