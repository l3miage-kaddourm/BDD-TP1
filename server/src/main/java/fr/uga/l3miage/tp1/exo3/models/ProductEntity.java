package fr.uga.l3miage.tp1.exo3.models;

import lombok.Cleanup;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "product_entity")
public class ProductEntity {
    @Id
    @Column(name="bar_code_number", length = 15)
    private String barCodeNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "consumable")
    private Boolean consumable;

    @OneToMany(mappedBy = "product")
    private Set<BrandEntity> brands;
}
