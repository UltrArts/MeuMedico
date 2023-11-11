package co.mz.meumedico.config;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String firstName;
    private String surname;
    private LocalDate dateOfBirth;
    private char genre;
    private String province;
    private String job;

//    @CreatedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "create_at", nullable = false, updatable = false)
//    private Instant createdAt;
//
//    @CreatedDate
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "updated_at", nullable = false, updatable = false)
//    private Instant updatedAt;
}
