package com.springBoot.TechnicalAssessment.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material {
    @Id
    @SequenceGenerator(
            name = "Material_sequence",
            sequenceName = "Material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Material_sequence"
    )
    private int material_id;
    private String material_name;

    @ManyToOne(
            cascade=CascadeType.ALL
    )
    @JoinColumn(
            name= "faculty_id",
            referencedColumnName = "faculty_id"
    )
    private Faculty faculty;

    @OneToMany(mappedBy = "material")
    Set<Student_Material> StudentMaterial;

    public int getMaterial_id() {
        return material_id;
    }

    public void setMaterial_id(int material_id) {
        this.material_id = material_id;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }
}
