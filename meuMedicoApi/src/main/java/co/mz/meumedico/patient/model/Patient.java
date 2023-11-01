package co.mz.meumedico.patient.model;

import co.mz.meumedico.config.Person;
import co.mz.meumedico.patient.repository.CustomIdGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_patient")
@Getter
@Setter
@ToString
public class Patient extends Person {

    @Id
    private Long id;
    private Boolean status;

    @PrePersist
    public void setIdPersonalised() {
        if (this.id == null) {
            this.id = CustomIdGenerator.generate2();
        }
    }

    }
