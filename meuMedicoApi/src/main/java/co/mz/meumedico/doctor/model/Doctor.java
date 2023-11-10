package co.mz.meumedico.doctor.model;

import co.mz.meumedico.config.Person;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_doctor")
@Getter
@Setter
public class Doctor extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private LocalDate startedAt;
}

