package co.mz.meumedico.hospital.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_hospital")
public class Hospital {
    @Id
    private Long id;
}
