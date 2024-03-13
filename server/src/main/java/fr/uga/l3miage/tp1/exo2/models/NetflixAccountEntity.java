package fr.uga.l3miage.tp1.exo2.models;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="NetflixAccountEntity")
public class NetflixAccountEntity {
    @Id
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "nb_devices")
    private Integer nbDevices;

    @Column(name = "typeAccount")
    private String typeAccount;

    @Column(name = "uuid_user")
    @OneToOne(mappedBy = "netflixAccount")
    private NetflixUserEntity netflixUser;
}
